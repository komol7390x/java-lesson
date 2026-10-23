package Lesson4.Student;

public abstract class Product {
    private final String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        checkPrice(price);
        checkStock(stock);
    }

    public Product(String name, double price) {
        this.name = name;
        checkPrice(price);
    }

    private double checkPrice(double price) {
        if (price < 0) throw new IllegalArgumentException("Narx 0 dan kichik bolmasliigi kere");
        return this.price = price;
    }

    private void checkStock(int stock) {
        if (stock <= 0) throw new IllegalArgumentException("Maxsulot soni manfiy bola olmaydi");
        this.stock = stock;
    }

    public double getFinalPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    public int getStock() {
        return this.stock;
    }
}
