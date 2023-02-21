package class28;
//4)Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.

import java.util.ArrayList;
public class Task4 {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<String>();
        drinks.add("Coffee");
        drinks.add("Soda");
        drinks.add("Gin");
        drinks.add("Tea");
        drinks.add("Milk");

        for (int i = 0; i < drinks.size(); i++) {
            String drink = drinks.get(i);
            if (drink.contains("a") || drink.contains("e")) {
                drinks.set(i, "Water");
            }
        }
        System.out.println("Updated drinks list: " + drinks);
    }
}


