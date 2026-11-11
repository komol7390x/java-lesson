import java.util.*;

public class Main {
    static void main(String[] args) {
//        1
        List<Integer> list1 = new ArrayList<>(List.of(12, 45, 67, 23, 9, 88, 34, 5));
//        sortArrayList(list);

//        2
        List<String> words = new ArrayList<>(List.of("olma", "banan", "olma", "uzum", "banan", "nok", "olma"));
//        removeDublicat(words);

//        3
        List<Integer> numbers = List.of(1, 4, 7, 10, 15, 18, 22, 27, 30, 33);
//        sortEven(numbers);

//        4
        List<Integer> list4 = List.of(54, 12, 89, 3, 45, 99, 23, 7);
//        findMaxAndMin(list4);

//        5
        List<String> items = new ArrayList<>(List.of("A", "B", "C", "D", "E", "F"));
//        swapElements(items, 2, 5);

//        6
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        chunkList(list, 3);

//        7
        List<Integer> l1 = List.of(1, 3, 5, 7, 9);
        List<Integer> l2 = List.of(3, 4, 5, 6, 7);
//        findCommonElements(l1, l2);

//        8
        List<String> langs = List.of("Java", "Python", "Java", "C++", "Java", "Go", "Python");
//        calculateElementFrequency(langs, "Java");

//        9
        List<Integer> nums = List.of(40, 10, 90, 20, 70, 50, 80);
//        maxNumber(nums, 3);

//        10
        List<String> queueInput = List.of("Task1", "Task2", "Task3", "Task4");
//        simulateQueue(queueInput);

//        --------------------- SET ---------------------
//        1
        String text = "java collections framework tutorial";
//        uniqueItem(text);

//        2
        Set<Integer> s1 = new HashSet<>(Set.of(10, 20, 30, 40, 50));
        Set<Integer> s2 = new HashSet<>(Set.of(30, 40, 50, 60, 70));
//        intersection(s1, s2);

//        3
        Set<String> setA = Set.of("Zebra", "Apple", "Mango");
        Set<String> setB = Set.of("Banana", "Apple", "Orange");
//        changeTreeSet(setA, setB);

//        4
        Set<Integer> setX = new HashSet<>(Set.of(1, 2, 3, 4, 5, 6));
        Set<Integer> setY = new HashSet<>(Set.of(4, 5, 6, 7, 8));
//        notDifference(setX,setY);

//        5
        String input = "programming in java";
//        findDuplicates(input);

//        6
        String sentence = "olma uzum anor olma gilos uzum anjir";
//        sortText(sentence);

//        7
        Set<Integer> mainSet = Set.of(1, 2, 3, 4, 5, 6, 7);
        Set<Integer> subSet = Set.of(2, 4, 6, 8);
//        checkSubSet(mainSet, subSet);

//        8
        TreeSet<Integer> tree = new TreeSet<>(Set.of(10, 20, 30, 40, 50));
//        findMinNumber(tree, 25);

//        9
        String str = "The quick brown fox jumps over the lazy dog";
//        isPangram(str);
    }

    public static void sortArrayList(List<Integer> list) {
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }

    public static void removeDublicat(List<String> list) {
        List<String> newList = new ArrayList<>();
        for (String i : list) {
            if (!newList.contains(i)) {
                newList.add(i);
            }
        }
        System.out.println(newList);

    }

    public static void sortEven(List<Integer> numbers) {
        List<Integer> newNumbers = new ArrayList<>();
        for (Integer num : numbers) {
            if (num % 2 == 0) {
                newNumbers.add(num);
            }
        }
        System.out.println(newNumbers);

    }

    public static void findMaxAndMin(List<Integer> numbers) {
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);
        int minIndex = numbers.indexOf(min);
        int maxIndex = numbers.indexOf(max);

        System.out.println("Max son: " + max + "\tIndex: " + maxIndex);
        System.out.println("Min son: " + min + "\tIndex: " + minIndex);
    }

    public static void swapElements(List<String> items, int from, int to) {
        Collections.swap(items, from, to);
        System.out.println(items);
    }

    public static void chunkList(List<Integer> list, int size) {
        if (size <= 0) return;
        List<List<Integer>> chunkList = new ArrayList<>();
        for (int i = 0; i < list.size(); i += size) {
            List<Integer> chunk = new ArrayList<>();
            for (int j = i; j < Math.min(i + size, list.size()); j++) {
                chunk.add(list.get(j));
            }
            chunkList.add(chunk);
        }

        System.out.println(chunkList);
    }

    public static void findCommonElements(List<Integer> list1, List<Integer> list2) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            if (list2.contains(list1.get(i))) {
                list.add(list1.get(i));
            }
        }
        System.out.println(list);
    }

    public static void calculateElementFrequency(List<String> langs, String lang) {
        int count = 0;
        for (String text : langs) {
            if (text.trim().equals(lang.trim())) {
                count++;
            }
        }
        System.out.println(lang + " so'zi " + count + " marta ishlatilgan");
    }

    public static void maxNumber(List<Integer> list, int maxNumber) {
        List<Integer> numberList = new ArrayList<>();
        for (Integer i : list) {
            if (!numberList.contains(i)) {
                numberList.add(i);
            }
        }
        Collections.sort(numberList, Collections.reverseOrder());
        System.out.println(maxNumber + " eng katta son: " + numberList.get(maxNumber - 1));
    }

    public static void simulateQueue(List<String> queueInput) {
        Queue<String> queue = new LinkedList<>();

        for (String task : queueInput) {
            queue.offer(task);
            System.out.println("Enqueue: " + task + " -> Navbat: " + queue);
        }

        System.out.println("\n");

        while (!queue.isEmpty()) {
            String removed = queue.poll();
            System.out.println("Dequeue: " + removed + " -> Qolgan navbat: " + queue);
        }
    }

    public static void uniqueItem(String text) {
        Set<Character> uniqueChars = new HashSet<>();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c != ' ') uniqueChars.add(c);
        }
        System.out.println(uniqueChars);
    }

    public static void intersection(Set<Integer> s1, Set<Integer> s2) {
        Set<Integer> result = new HashSet<>();
        for (Integer i : s1) {
            if (s2.contains(i)) result.add(i);
        }
        System.out.println(result);
    }

    public static void changeTreeSet(Set<String> setA, Set<String> setB) {
        TreeSet<String> unionSet = new TreeSet<>(setA);
        unionSet.addAll(setB);

        System.out.println(unionSet);
    }

    public static void notDifference(Set<Integer> setA, Set<Integer> setB) {
        setA.removeAll(setB);
        System.out.println(setA);
    }

    public static void findDuplicates(String text) {
        Set<Character> seen = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();

        for (char c : text.toCharArray()) {
            if (c == ' ') {
                continue;
            }
            if (!seen.add(c)) {
                duplicates.add(c);
            }
        }
        System.out.println(duplicates);
    }

    public static void sortText(String text) {
        TreeSet<String> array = new TreeSet<>(List.of(text.trim().split(" ")));
        System.out.println(array);
    }

    public static void checkSubSet(Set<Integer> mainSet, Set<Integer> subSet) {
        for (Integer i : subSet) {
            if (!mainSet.contains(i)) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

    public static void findMinNumber(TreeSet<Integer> numbers, int maxNumber) {
        int number = 0;
        for (Integer i : numbers) {
            if (maxNumber < i) {
                number = i;
                break;
            }
        }
        System.out.println(maxNumber + " dan katta bolgan eng kichik son: " + number);
    }

    public static void isPangram(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                set.add(c);
            }
        }
        boolean result = set.size() == 26;
        System.out.println(result ? "yes" : "no");
    }
}
