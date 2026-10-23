package Lesson4.Teacher.model.inheritance;

import Lesson4.Teacher.service.Register;

public class PolymorphismExample {
    public static void main(String[] args) {
        Product product = new Product("Qalam", 3000.0);
        Product bread = new Food("Non", 5000, 10);
        Product electronics = new Electronics("Telefon", 2_000_000.0, 3);

        System.out.println("Non: " + bread); //Product@2423

        Product[] cart = {product, bread, electronics};

        Register register = new Register();

        double total = register.total(cart);

        System.out.println(total);

        Food bread1 = (Food) bread;

        //Food electronics1 = (Food) electronics;ClassCastException
        if (bread1 instanceof Food) {

        }

    }
}
