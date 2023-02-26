package Class29;
//Create a Set of cities in which you want to make sure that insertion order is maintained.
//Then remove any city that starts with “A”;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {

        Set<String> cities = new LinkedHashSet<>();

        cities.add("Alabama");
        cities.add("Miami");
        cities.add("London");
        cities.add("Paris");
        cities.add("Antalya");
        cities.add("San Diego");


        for(Iterator<String> it = cities.iterator(); it.hasNext(); ) {
            String city = it.next();
            if(city.startsWith("A")){
                it.remove();
            }
        }
        System.out.println(cities);
    }
}
