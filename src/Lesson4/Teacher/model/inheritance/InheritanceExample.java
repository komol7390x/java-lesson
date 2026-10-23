package Lesson4.Teacher.model.inheritance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

public class InheritanceExample {

    public static void main(String[] args) {
        Food milk = new Food("Sut", 16000.0, 60);
        Food bread = new Food("Non", 5000.0, 3);

        System.out.println(milk.getName());
        System.out.println(milk.getPrice());
        System.out.println(milk.getExpiryDay());

        milk.printInfo();

        //Integer
        //Double

        //Object

        System.out.println("==================");


        System.out.println(milk.getName());
        System.out.println(milk.getFinalPrice());
        System.out.println(milk.getExpiryDay());

        System.out.println("==================");
        System.out.println(bread.getName());
        System.out.println(bread.getFinalPrice());
        System.out.println(bread.getExpiryDay());

    }
}
