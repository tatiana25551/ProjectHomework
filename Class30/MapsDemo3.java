package Class30;

import java.util.HashMap;

/*Create a map of a building. Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map*/
public class MapsDemo3 {
    public static void main(String[] args) {

        HashMap<Integer, String> buildingMap = new HashMap<>();
        buildingMap.put(1, "Google");
        buildingMap.put(2, "Syntax");
        buildingMap.put(3, "Meta");
        buildingMap.put(4, "Amazon");
        buildingMap.put(5, "Amc");
        buildingMap.put(6, "Firefox");
        buildingMap.put(2, "Syntax");

        System.out.println(buildingMap.size());
        System.out.println(buildingMap.remove(7));
        buildingMap.replace(4,"Shell");
        System.out.println(buildingMap);
    }
}
