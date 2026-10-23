package Lesson4.Teacher.model.inheritance;

public class Product {
    private long id;
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getFinalPrice() {
        return price;
    }

    public long getId() {
        return id;
    }

    protected double basePrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " Price: " + getFinalPrice();
    }

    protected void log(String message) {
        System.out.println("LOG :: " + message);
    }

    public void printInfo() {
        System.out.println("Name: " + name + " Narx: " + price);
    }
}
