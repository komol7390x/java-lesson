package Lesson2.Teacher;

public class Student {

    static final double PI = 3.14; // PI
    static int count;
    final String notebook = "Notebook";
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name) {
        this.name = name;
        count++;
    }

    public static int getCount() {
        return count;
    }
}
