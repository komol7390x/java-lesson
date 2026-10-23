package Lesson4.Student;

public class Main {
    static void main() {
        Product drink = new Drink("Cole", 15_000, 1.5);
        Product electronics = new Electronics("Iphone 15 pro", 100, 600, 12);
        System.out.print("Nomi: " + drink.getName() + "\nNarxi: " + drink.getFinalPrice());
    }
}
