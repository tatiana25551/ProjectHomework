package Class30;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsDemo5 {
    public static void main(String[] args) {
        Map<Integer,String> studentsMap=new HashMap<>();

        studentsMap.put(1,"Nezir");
        studentsMap.put(2,"Shah");
        studentsMap.put(3,"Tami");
        studentsMap.put(4,"Aisha");
        studentsMap.put(5,"Gul");
        studentsMap.put(6,"Bahar");
        studentsMap.put(7,"Saba");

       Set<Integer>allkeys=studentsMap.keySet();

      allkeys.removeIf(x->x>2);
        System.out.println(allkeys);
        System.out.println(studentsMap);
    }

}
