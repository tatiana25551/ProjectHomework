package Class30;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapsDemo8 {
    public static void main(String[] args) {

        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("Ukraine", "Kiev");
        countries.put("France", "Paris");
        countries.put("Scotland", "Edinburgh");
        countries.put("USA", "Washington DC");

        //  Set<Map.Entry<String,String>>=countries.entrySet();

        var entrySet = countries.entrySet();
        for (var entry : entrySet
        ) {

            System.out.println(entry.getKey() + "= " + entry.getValue());

        }
        var iterator=countries.entrySet().iterator();

        while (iterator.hasNext()){

            var entry=iterator.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
