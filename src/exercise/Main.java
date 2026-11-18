package exercise;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {
    static void main(String[] args) {
//        sorterP();  // 1
//        library();    // 2
//        divisibleBy(2000);    // 3
//        polindrom("Kiyik");   // 4
//        isAnagram("Salom", "molas");
        List<String> cities = List.of("Toshkent", "ab1", "Nukus2", "olma");
//        validTexts(cities);   // 5
        int[] arr1 = new int[]{3, 8, 1, 6};
        int[] arr2 = new int[]{10, -2};
//        showArray(arr1, arr2);    // 6
//        bankCard();   // 7
//        alert();    // 8
//        reapeat7(); // 9

    }

    public static void sorterP() {
        List<Integer> nums = List.of(12, 7, 0, -5, 33, 18, 101, -40);
        Predicate<Integer> isNegative = n -> n > 0;
        Predicate<Integer> isTwoDigit = n -> Math.abs(n) >= 10 && Math.abs(n) < 100;
        Predicate<Integer> isDivisibleBy3 = n -> n % 3 == 0;

        System.out.println(nums.stream().filter(isNegative).toList());
        System.out.println(nums.stream().filter(isTwoDigit).toList());
        System.out.println(nums.stream().filter(isDivisibleBy3).toList());
    }

    public static void library() {
        List<Book> books = List.of(new Book("O‘tkan kunlar", "Abdulla Qodiriy", 1926, 360, true), new Book("Mehrobdan chayon", "Abdulla Qodiriy", 1929, 280, false), new Book("Ulug‘bek xazinasi", "Odil Yoqubov", 1973, 450, true), new Book("Kecha va kunduz", "Cho‘lpon", 1936, 310, true), new Book("Sariq devni minib", "Xudoyberdi To‘xtaboyev", 1968, 220, true), new Book("Yulduzli tunlar", "Pirimqul Qodirov", 1979, 520, false));

        Predicate<Book> isOld = book -> book.year() <= 1950;
        Predicate<Book> isThick = book -> book.pages() >= 400;
        Predicate<Book> isAvailable = book -> book.available();
        System.out.println("Mavjud va eski kitoblar-> " + books.stream().filter(isAvailable.and(isOld)).map(Book::title).toList());
        System.out.println("Mavjud va eski kitoblar-> " + books.stream().filter(isOld.negate().and(isThick)).map(Book::title).toList());
        System.out.println("Mavjud va eski kitoblar-> " + books.stream().filter(isAvailable.negate().or(isThick)).map(Book::title).toList());
    }

    public static void divisibleBy(Integer num) {
        Predicate<Integer> fourCheck = n -> n % 4 == 0;
        Predicate<Integer> hundredCheck = n -> n % 100 == 0;
        Predicate<Integer> fourHundredCheck = n -> n % 400 == 0;
        Predicate<Integer> isLeapYear = fourCheck.and(hundredCheck.negate()).or(fourHundredCheck);
        boolean result = isLeapYear.test(num);
        System.out.println(num + " kabisa yilimi? " + result);
    }

    public static void polindrom(String text) {
        Predicate<String> isPalindrome = str -> {
            if (str == null) return false;
            String clean = str.replace("\\s+", "").toLowerCase();
            return clean.contains(new StringBuilder(clean).reverse());
        };
        boolean result = isPalindrome.test(text);
        System.out.println(result);
    }

    public static void isAnagram(String text1, String text2) {
        BiPredicate<String, String> check = (s1, s2) -> new StringBuilder(s1.toLowerCase().trim()).reverse().toString().equals(s2.toLowerCase());
        boolean result = check.test(text1, text2);
        System.out.println(result);
    }

    public static void validTexts(List<String> texts) {
        List<Predicate<String>> rules = List.of(s -> s.length() > 3, s -> Character.isUpperCase(s.charAt(0)), s -> s.chars().noneMatch(Character::isDigit));
        Predicate<String> allRule = allOf(rules);
        Predicate<String> anyOf = anyOf(rules);
        for (String text : texts) {
            System.out.println(text + "-> allOf: " + allRule.test(text));
            System.out.println(text + "-> anyOf: " + anyOf.test(text) + "\n");
        }

    }

    private static <T> Predicate<T> allOf(List<Predicate<T>> rules) {
        return rules.stream().reduce(t -> true, Predicate::and);
    }

    private static <T> Predicate<T> anyOf(List<Predicate<T>> rules) {
        return rules.stream().reduce(t -> false, Predicate::or);
    }

    private static void showArray(int[] arr1, int[] arr2) {
        Consumer<int[]> printArray = arr -> System.out.println("[ " + Arrays.stream(arr)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" | ")) + " ]");
        Consumer<int[]> printStats = arr -> {
            int sum = Arrays.stream(arr).sum();
            int max = Arrays.stream(arr).max().orElse(0);
            System.out.println("Yig‘indi: " + sum + ", Eng kattasi: " + max);
        };
        printArray.accept(arr1);
        printStats.accept(arr1);

        printArray.accept(arr2);
        printStats.accept(arr2);
    }

    private static void bankCard() {
        List<Card> cards = List.of(new Card("Aziza", 100_000), new Card("Bobur", 40_000));
        Consumer<Card> addCashback = s -> s.addCashback(5);
        Consumer<Card> chargeFee = s -> s.chargeFee(2000);
        Consumer<Card> print = Card::print;
        cards.forEach(addCashback.andThen(chargeFee).andThen(print));
    }

    private static void alert() {
        Map<String, Integer> stock = new LinkedHashMap<>();
        stock.put("Olma", 4);
        stock.put("Banan", 25);
        stock.put("Uzum", 9);
        stock.put("Nok", 12);
        BiConsumer<String, Integer> lowStockAlert = (s, i) -> {
            if (i < 10) System.out.println("⚠ Warning\t" + s + " : " + i + " dona qoldi");
        };
        BiConsumer<String, Integer> printAll = (s, i) -> {
            System.out.println(s + " - " + i);
        };
        stock.forEach(printAll);
        System.out.println("\n");
        stock.forEach(lowStockAlert);
        System.out.println("\n");
        stock.forEach(printAll.andThen(lowStockAlert));
    }

    private static void repeat(int n, IntConsumer action) {
        for (int i = 0; i <= n; i++) {
            action.accept(i);
        }
    }

    private static <T> void forEachIndex(List<T> list, BiConsumer<Integer, T> action) {
        for (int i = 0; i < list.size(); i++) {
            action.accept(i + 1, list.get(i));
        }
    }

    public static void reapeat7() {
        List<String> list = List.of("Toshkent", "Samarqand", "Xiva");
        repeat(5, i -> System.out.println("7 x " + i + " = " + (7 * i)));
        forEachIndex(list, (ind, city) -> System.out.println(ind + ") " + city));

    }
}
