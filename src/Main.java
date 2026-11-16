import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Komol", 28, 88, false),
                new Student("Ali", 16, 95, true),
                new Student("Vali", 20, 70, true)
        );
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
        active.forEach(s -> System.out.println("Name: " + s.getName() + "\tActive: " + s.isActive()));
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
