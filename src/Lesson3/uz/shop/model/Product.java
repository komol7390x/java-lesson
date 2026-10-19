package Lesson3.uz.shop.model;

public class Product {
    public static final double VAT_RATE = 0.12;
    private static int nextId = 1;

    private final int id;
    private final String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Nom bo'sh bo'lmasin");
        if (stock < 0) throw new IllegalArgumentException("Qoldiq manfiy bo'lmaydi");
        this.id = nextId++;
        this.name = name.trim();
        this.stock = stock;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getStock() {
        return this.stock;
    }

    public double getPriceWithVat() {
        return price * (1 + VAT_RATE);
    }

    public boolean isAvailable() {
        return stock > 0;
    }

    public void changePrice(double newPrice){
        if(newPrice<=0) throw new IllegalArgumentException("Narx musbat bo'lishi kerak");
        this.price=newPrice;
    }

    public int[] makeEnds(int[] nums) {
        if (nums.length == 0) return new int[] {};
        return new int[] { nums[0], nums[nums.length - 1] };
    }

    public int[] makeLast(int[] nums) {
        int[] result = new int[nums.length * 2];
        result[result.length - 1] = nums[nums.length - 1];
        return result;
    }

    


}
