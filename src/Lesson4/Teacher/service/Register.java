package Lesson4.Teacher.service;


import Lesson4.Teacher.model.inheritance.Product;

public class Register {
    public double total(Product[] products) {
        double sum = 0;
        for (Product product : products) {
            sum += product.getFinalPrice();
        }
        return sum;
    }
}
