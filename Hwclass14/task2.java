package Hwclass14;

public class task2 {
    public static void main(String[] args) {


    /*
       Create a String that should be combination of letters, numbers and special characters.
       Find out how many Alphanumeric(abd AZ 284) characters are there in the String
        */
        String str = "rfhjkl75448+*&^(()";
        System.out.println(str.replaceAll("[^A-Za-z0-9]", "").length());
        System.out.println(str);
    }
}