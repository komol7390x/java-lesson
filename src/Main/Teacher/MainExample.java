package Main.Teacher;

import java.util.Scanner;

//Mavzular --- DataType, Variable and Wrapper, Method, Condition,         Loop, String, StringBuffer, StringBuilder, Array
public class MainExample {
    String name; //Instance
    static int count = 0; //Static
    //CPU RAM --- 0101010110101101
    // Javaning birinchi nomi OAK - daraxt turi 1995 - yilda 1-relizi Java 1.1 1.2, 2006 - Oracle Java 8
    // JDK, JRE, JVM .java => .class  machine code      byte code
    // JDK 17
    // LTS - 8, 11, 17, 21, 25
    // public, private, protected, default -- OOP

    public static void main(String[] args) {
        //byte, short, int, long ==== float, double === char, boolean - primitive data type
        //Byte, Short, Integer, Long.... Wrapper class
        //local, instance, static

        //DataType And Variabel
        int a = 12; //Local,     stack, heap
        int number = Integer.parseInt("21");
        String text = "21";
        System.out.println(number);
        System.out.println(text);
        Integer b = 15; //Local,     stack, heap
        count++; //increment
        // int i = staticMethod();
        System.out.println(count);
        //DataType And Variabel

        //METHOD

        //voidMethod();
        //staticMethod();
        //intMethod

        //METHOD

        //CONDITION - shart operatorlari
        //if else-if, else, switch
        Scanner scanner = new Scanner(System.in);
        //int age = scanner.nextInt();

        int age = 23;

        if (age >= 45) {
            System.out.println("Something1");
        } else if (age > 30) {
            System.out.println("Something2");
        }


        if (age > 50) {
            System.out.println("Qari");
        } else if (age >= 45) {
            System.out.println("O'rta");
        } else if (age >= 30) {
            System.out.println("Navqiron");
        } else {
            System.out.println("O'smir");
        }

        //Kiritiladigan aniq malumot bolsa
        int weakDay = scanner.nextInt();
        switch (weakDay) {
            case 1:
                System.out.println("Dushanba");
                break;
            case 2:
                System.out.println("Dushanba1");
                break;
            case 3:
                System.out.println("Dushanba2");
                break;
            case 4:
                System.out.println("Dushanba3");
                break;
            case 5:
                System.out.println("Dushanba4");
                break;
            case 6:
                System.out.println("Dushanba5");
                break;
            case 7:
                System.out.println("Dushanba6");
                break;
            default:
                System.out.println("Bundayu hafta kuni yoq!");
        }

        //CONDITION
    }

    static double staticMethod() { //Static Method
        // return count++; //increment
        return 0.0;
    }

    void voidMethod() { //Void Method- Qiymat qaytarmadigan method
        System.out.println("Something text");
    }

    int intMethod() { // Qiymat qaytaradigan method
        return 1;
    }
}
