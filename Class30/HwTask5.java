package Class30;

import java.util.ArrayList;
import java.util.List;

/*Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers*/
public class HwTask5 {
    public static void main(String[] args) {

        List<Integer>numbers=new ArrayList<>();
        numbers.add(99);
        numbers.add(88);
        numbers.add(77);
        numbers.add(99);
        numbers.add(66);
        numbers.add(77);

        int sum=0;

        for (Integer num:numbers){
            sum+=num;
        }
        System.out.println(sum);
    }
}
