package Lesson4.Teacher.model.inheritance;

public class Electronics extends Product{
    private int stock;

    public Electronics(String name, double price, int stock) {
        super(name, price);
        this.stock = stock;
    }


    @Override
    public double getFinalPrice() {
        log("Something final price");
        return basePrice() * 0.8;
    }
}
