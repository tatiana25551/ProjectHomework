package Class29;
//How can you remove all duplicates from ArrayList?
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        List<String> aList=new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");
        System.out.println(aList);

        LinkedHashSet<String>uniqueNames=new LinkedHashSet<>(aList);
        System.out.println(uniqueNames);


    }


}
