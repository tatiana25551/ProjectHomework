package class28;
/*1) Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that*/
import java.util.ArrayList;
public class Task1 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();
        names.add("Tanya");
        names.add("Eli");
        names.add("Max");
        names.add("Alex");
        names.add("Michelle");

        System.out.println(names.isEmpty());

        System.out.println(names.contains("Eli"));

        for (String name:names){
            System.out.println(name);
        }
    }
}
