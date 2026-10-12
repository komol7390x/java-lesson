package Lesson2.Teacher;

public class Car {
    int year; //0
    String name; //null
    String model; // null

    public Car() { //Default Constructor
    }

    public Car(String model, String name, int year) { //Parameterized Constructor
        this.model = model;
        this.name = name;
        this.year = year;
    }

    public Car(String name, int year) {
        this("Chevrolet", name, year);
    }


    public void introduce() {
        System.out.println("Model:\t" + model + "\t\tName:\t" + name + "\t\tYear: " + year);
    }
    //double price;

}
