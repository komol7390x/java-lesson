package Lesson;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {
        List<Student> students = List.of(new Student("Komol", 28, 88, false), new Student("Ali", 16, 95, true), new Student("Vali", 20, 70, true));
        List<Student> adults = filter(students, new AdultFilter());
        List<Student> excellent = filter(students, new ExcellentFilter());

//        System.out.println("Kattalar:");
//        adults.forEach(s -> System.out.println(" " + s.getName()));
//        System.out.println("A'lochilar:");
//        excellent.forEach(s -> System.out.println("  " + s.getName()));

        List<Student> listStudent = filter(students, new StudentFilter() {
            @Override
            public boolean test(Student s) {
                return s.getName().startsWith("A");

            }
        });
        for (Student student : listStudent) {
//            System.out.println(student.getName());
        }

//        filter(students, s -> s.getName().startsWith("K")).forEach(s -> System.out.println(s.getName()));
//        filters(students, s -> s.getAge() >= 18).forEach(s -> System.out.println(s.getName()));
        List<Student> active = students.stream().filter(Student::isActive).toList();
//        active.forEach(s -> System.out.println("Name: " + s.getName() + "\tActive: " + s.isActive()));


        Supplier<List<String>> newList = ArrayList::new; // () -> new ArrayList<>()
//  ?      Function<String, Lesson.Student> create = Lesson.Student::new; // name -> new Lesson.Student(name)
//  ?     BiFunction<String, Integer, Lesson.Student> create2 = Lesson.Student::new; // (n, a) -> new Lesson.Student(n, a)
        IntFunction<int[]> newArray = int[]::new; // size -> new int[size]

        Predicate<Integer> isPositive = n -> n > 0;
        Predicate<Integer> isEven = n -> n % 2 == 0;
//        System.out.println(isPositive.test(5)); // true
//        System.out.println(isPositive.test(-3)); // false
//        System.out.println(isEven.test(4)); // true


        Predicate<Integer> positiveAndEven = isPositive.and(isEven);
        Predicate<Integer> positiveOrEven = isPositive.or(isEven);
        Predicate<Integer> notPositive = isPositive.negate();

//        System.out.println(positiveAndEven.test(4)); // true
//        System.out.println(positiveAndEven.test(-4)); // false
//        System.out.println(positiveOrEven.test(-4)); // true
//        System.out.println(notPositive.test(-1));

        List<String> names = List.of("Ali", "  ", "", "Vali", "Gani", "\t\n");
        List<String> newNames1 = names.stream().filter(s -> !s.isBlank()).toList();
        System.out.println(newNames1);
        List<String> newNames2 = names.stream().filter(Predicate.not(String::isBlank)).toList();
        System.out.println(newNames2);
    }

    public static class AdultFilter implements StudentFilter {
        @Override
        public boolean test(Student s) {
            return s.getAge() >= 18;
        }
    }

    public static class ExcellentFilter implements StudentFilter {
        @Override
        public boolean test(Student s) {
            return s.getScore() >= 86;
        }
    }

    public static List<Student> filter(List<Student> students, StudentFilter f) {
        List<Student> result = new ArrayList<>();
        for (Student s : students) {
            if (f.test(s)) result.add(s);
        }
        return result;
    }

    public static <T> List<T> filters(List<T> items, Predicate<T> pre) {
        List<T> result = new ArrayList<>();
        for (T item : items) {
            if (pre.test(item)) result.add(item);
        }
        return result;
    }

}
