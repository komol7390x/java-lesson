package Lesson4.Teacher.model.inheritance;

public class Drink extends Product {
    private int size;

    public Drink(String name, double price, int size) {
        super(name, price);
        this.size = size;
    }
}
