package Lesson4.Student;

public class Drink extends Product {
    private double volumeLiters;

    public Drink(String name, double price, double volumeLiters) {
        super(name, price);
        checkVolumeLiters(volumeLiters);
    }

    private void checkVolumeLiters(double volumeLiters) {
        if (volumeLiters < 0) throw new IllegalArgumentException("Miqdor manfiy bola olmaydi!");
        this.volumeLiters = volumeLiters;
    }

    public double getVolumeLiters() {
        return this.volumeLiters;
    }

    @Override
    public double getFinalPrice() {
        return super.getFinalPrice() * 0.7;
    }
}
