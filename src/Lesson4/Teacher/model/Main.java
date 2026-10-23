package Lesson4.Teacher.model;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    //OOP - package, encapsulation, access modifier
    //Access modifier - private, protected = default + inheritance class, default, public
    public static void main(String[] args) throws IllegalAccessException {
        Product product = new Product("Olma", 2000.0, 15);
//        product.name = null;
//        product.price = -500;
//        product.stock = 10;
//        System.out.println("Name: " + product.name + " Price: " + product.price + " Stock: " + product.stock);
        product.setName(" Nok    ");
        product.setPrice(1200);
        product.setStock(10);

        System.out.println("Name: " + product.getName() + " Price: " + product.getPrice() + " Stock: " + product.getStock());
    }
}
