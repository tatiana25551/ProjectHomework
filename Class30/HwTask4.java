package Class30;


import java.util.LinkedHashSet;
import java.util.Set;

/*Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.*/
public class HwTask4 {
    public static void main(String[] args) {
        Set<String>setCities=new LinkedHashSet<>();
        setCities.add("Paris");
        setCities.add("Miami");
        setCities.add("Milan");
        setCities.add("Boston");
        setCities.add("Prague");

        for (String city:setCities){
            System.out.println(city);
        }

    }
}
