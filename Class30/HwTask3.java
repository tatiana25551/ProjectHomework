package Class30;

import java.util.Set;
import java.util.TreeMap;

/*3)Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets the highest salary. Output should be in the below format
John Smith=$100000*/
public class HwTask3 {
    public static void main(String[] args) {

        TreeMap<String, Integer> employee = new TreeMap<>();
        employee.put("John Smith", 100000);
        employee.put("Paul Fusco", 45000);
        employee.put("Helen Ramos", 36000);
        employee.put("Jessica Ernest", 27500);

        int highestSalary = 0;
        String highetsPaid=" ";

        var entrySet = employee.entrySet();
        for (var entry : entrySet) {
            if (entry.getValue() > highestSalary) {
                highestSalary = entry.getValue();
                highetsPaid = entry.getKey();
            }
        }
        System.out.println(highetsPaid+" =" +highestSalary);
    }
}
