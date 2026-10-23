package Lesson4.Teacher.model.inheritance;

public class Food extends Product {
    private int expiryDay;

    public Food(String name, double price, int expiryDay) {
        super(name, price);
        this.expiryDay = expiryDay;
    }

    public int getExpiryDay() {
        return expiryDay;
    }

//    @Override
//    public double getFinalPrice() {
//        if (expiryDay <= 3) {
//            return getPrice() * 0.7;
//        }
//        return getPrice();
//    }

    @Override
    public double getFinalPrice() {
        log("Something final price");
        return basePrice() * 0.7;
    }
}
