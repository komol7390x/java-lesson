package Lesson2.Student;

public class StaticMethod {
    public class StudentClass {
        String name;
        static int count = 0; // har bir objectda ALOHIDA

        StudentClass(String name) {
            this.name = name;
            count++;
            System.out.println("Yangi talaba yaratildi: " + name + ", count: " + count);
        }
    }

    StudentClass a = new StudentClass("Ali");
    StudentClass b = new StudentClass("Vali");
    StudentClass c = new StudentClass("Jasur");
    StudentClass d = new StudentClass("Sardor");

    static void main(String[] args) {
        System.out.println("Jami yaratilgan talabalar: " + StudentClass.count);
        new StaticMethod();
        System.out.println("Jami yaratilgan talabalar: " + StudentClass.count);

    }
}