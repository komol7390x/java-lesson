package Lesson4.Teacher.model;

//GETTER, SETTER
public class Product {
    private String name;
    private double price; //0.0
    private int stock;

    public Product(String name, double price, int stock) throws IllegalAccessException {
        this.name = name;
        changePrice(price);
        this.stock = stock;
    }

    public void changePrice(double price) throws IllegalAccessException {
        if (price <= 0) throw new IllegalAccessException("Summa manfiy bolishi mumkin emas!!!" + price);
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) throws IllegalAccessException {
        if (name == null || name.isBlank()) {
            throw new IllegalAccessException("Name null yokida bosh bolmasligi kerak!!!");
        }
        this.name = name.trim();
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws IllegalAccessException {
        if (price < 0) throw new IllegalAccessException("Summa manfiy bolishi mumkin emas!!!" + price);
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) throws IllegalAccessException {
        if (stock < 0) throw new IllegalAccessException("Qoldiq manfiy bolishi mumkin emas!!!" + stock);
        this.stock = stock;
    }
}
