import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
}
