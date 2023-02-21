package class28;

//5)Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList.

import java.util.ArrayList;
public class Task5 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i = 2; i <= 500; i = i + 2) {
          numbers.add(i);
        }

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 5 == 0) {
               numbers.remove(i);
            }
        }
        System.out.println(numbers);

    }
}
