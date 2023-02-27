package Class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapsDemo4 {
    public static void main(String[] args) {

        HashMap<String, Double> makeup = new HashMap<>();
        makeup.put("Lipstick", 50.0);
        makeup.put("Foundation", 40.0);
        makeup.put("Mascara", 70.0);
        makeup.put("eyeliner", 12.2);
        makeup.put("blush", 12.2);

        //to get all the keys we can use keySet method from map interface
        Set<String> allKeys=makeup.keySet();
        System.out.println(allKeys);

        for (String s:allKeys){
            System.out.println(s);
        }


      allKeys.removeIf(x->x.length()>7);
        System.out.println(allKeys);
        System.out.println(makeup);

    }
}
