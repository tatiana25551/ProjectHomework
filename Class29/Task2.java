package Class29;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*Create a Set collection in which you need to add names of the countries.
//In this set we want all objects to be sorted in alphabetical order.Using 2 different ways retrieve all elements from set.
 */
public class Task2 {
    public static void main(String[] args) {

        Set<String> countries = new TreeSet<String>();
        countries.add("Ukraine");
        countries.add("Canada");
        countries.add("Prague");
        countries.add("Iceland");
        countries.add("Turkey");


        for (String country : countries) {
            System.out.println(country);
        }

        Iterator<String> iterator = countries.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}


