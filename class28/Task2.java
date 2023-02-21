package class28;
//2)Create an arraylist of cars and retrieve all the values using 3 different ways.

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Tesla");
        cars.add("Volvo");
        cars.add("Nissan");
        cars.add("Kia");
        cars.add("Honda");

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        for (String car : cars) {
            System.out.println(car);
        }


        Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
    }
}
