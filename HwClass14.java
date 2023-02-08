public class HwClass14 {
    public static void main(String[] args) {

        //1) Create a String that will hold a sentence. Write a program to get a new String without any spaces.
        String str=" I love January";
        String newStr=str.replaceAll(" ","");
        System.out.println(newStr);
    }
}

