package Lesson4.Teacher.model;

import java.io.Closeable;
import java.util.Comparator;
import java.util.LinkedHashMap;

public class Example {
    public static void main(String[] args) {

        Car car = new Car();
        car.model = "Tayota";

        Integer a = 127; // 128
        Integer b = 127;

        System.out.println(a == b);       // reference      false    false    false
        System.out.println(a.equals(b)); // value           true     true     true

        System.out.println("====================");

        Integer c = 128;
        Integer d = 128;

        System.out.println(c == d); //false
        System.out.println(c.equals(d)); //true
        SomethingClass somethingClass = somethingMethod();
        String fieldString = somethingClass.fieldString;
        System.out.println(fieldString);

        int fieldInt = somethingClass.fieldInt;
        System.out.println(fieldInt);

    }

    public static SomethingClass somethingMethod() {
        return new SomethingClass(1);
    }
}
