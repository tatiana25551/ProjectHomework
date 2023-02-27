package Class30;

import java.util.Map;
import java.util.TreeMap;

//In Test Class create a Map that will store key in ascending order. In that map store personId and a Person Object. Print each object details.
public class PersonTester {
    public static void main(String[] args) {

        Map<Integer,Person>person=new TreeMap<>();
        person.put(1,new Person("Olga","Caraman",34,112000.0));
        person.put(2,new Person("James","Hodd",51,75600.0));
        person.put(3,new Person("Todd","Gales",44,51478.0));
        person.put(4,new Person("Gary","Brah",21,28965.0));
        System.out.println(person);

    }
}
