package exercise;

import java.util.List;
import java.util.function.Predicate;

public class Main {
    static void main(String[] args) {
//        sorterP();
//        library();
//        divisibleBy(2000);
polindrom("Kiyik");

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
        List<Book> books = List.of(
                new Book("O‘tkan kunlar", "Abdulla Qodiriy", 1926, 360, true),
                new Book("Mehrobdan chayon", "Abdulla Qodiriy", 1929, 280, false),
                new Book("Ulug‘bek xazinasi", "Odil Yoqubov", 1973, 450, true),
                new Book("Kecha va kunduz", "Cho‘lpon", 1936, 310, true),
                new Book("Sariq devni minib", "Xudoyberdi To‘xtaboyev", 1968, 220, true),
                new Book("Yulduzli tunlar", "Pirimqul Qodirov", 1979, 520, false));

        Predicate<Book> isOld = book -> book.year() <= 1950;
        Predicate<Book> isThick = book -> book.pages() >= 400;
        Predicate<Book> isAvailable = book -> book.available();
        System.out.println("Mavjud va eski kitoblar-> " + books.stream()
                .filter(isAvailable.and(isOld))
                .map(Book::title)
                .toList());
        System.out.println("Mavjud va eski kitoblar-> " + books.stream()
                .filter(isOld.negate().and(isThick))
                .map(Book::title)
                .toList());
        System.out.println("Mavjud va eski kitoblar-> " + books.stream()
                .filter(isAvailable.negate().or(isThick))
                .map(Book::title)
                .toList());
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
        boolean result=isPalindrome.test(text);
        System.out.println(result);
    }
}
