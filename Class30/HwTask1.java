package Class30;
/*Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.*/

import java.util.Map;
import java.util.TreeMap;

public class HwTask1 {
     public static void main(String[] args) {

    TreeMap<Integer,String>items=new TreeMap<>();
    items.put(7569,"Printer");
    items.put(5639,"TV");
    items.put(44112,"Camera");
    items.put(779966,"Ipad");

    var entrySet=items.entrySet();
         for (var entry : entrySet
         ) {
             System.out.println(entry.getKey() + "= " + entry.getValue());
         }


     }
}
