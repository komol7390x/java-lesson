package Lesson3.Student;

public class Product {
    private String name;
    private double price;
    private int stock;

    Product(final String name, double price, int stock) {
        if(price<=0) throw  new IllegalArgumentException("Price must be greater than 0");
        this.name = name;
        changePrice(price);
        this.stock = stock;
        System.out.println("Name "+name+"\nPrice "+price+"\nStock "+stock);
    }

    public  void  changePrice(double newPrice){
        if(newPrice<=0) throw  new IllegalArgumentException("Price must be greater than 0");
        this.price=newPrice;
    }

    public double getPrice(){
        return  this.price;
    }

    private  boolean isValidPrice(double value){
        return  value>0 && value<1_000_000_000;
    }
}
