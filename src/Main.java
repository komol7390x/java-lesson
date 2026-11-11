import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("BMW");
        cars.add("Mazda");
        cars.add("Volvo");
        cars.add("Ford");

        Collections.sort(cars,Collections.reverseOrder());
        for (String car : cars) {
            System.out.println(car);
        }

    }
}
