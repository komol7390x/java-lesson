package Lesson4.Student;

public class Electronics extends Product {
    private int warrantyMonths;

    public Electronics(String name, int stock, double price, int warrantyMonths) {
        super(name, price, stock);
        checkWarrantyMonths(warrantyMonths);
    }

    private int checkWarrantyMonths(int warrantyMonths) {
        if (warrantyMonths < 0) throw new IllegalArgumentException("Muddatli to'lov manfiy bola olmaydi");
        return this.warrantyMonths = warrantyMonths;
    }

    @Override
    public double getFinalPrice() {
        return super.getFinalPrice() * 0.5;
    }
}
