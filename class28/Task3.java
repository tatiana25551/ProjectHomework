package class28;

import java.util.ArrayList;
import java.util.Iterator;

//3)Create an arrayList of words. Remove every word that ends with “e”.
public class Task3 {
    public static void main(String[] args) {

        ArrayList<String>words=new ArrayList<>();

        words.add("Car");
        words.add("Apple");
        words.add("College");
        words.add("Spa");
        words.add("Dog");
        words.add("Console");
        Iterator<String>iterator= words.iterator();

        while (iterator.hasNext()){
            String s=iterator.next();
            if (s.endsWith("e")){
                iterator.remove();

            }

        }
        System.out.println(words);
    }
}
