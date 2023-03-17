package class33;
//Create a method to check age eligibility that will throw a runtime exception. Method should throw an exception age is less than 16.
public class Task3 {
    public static void checkAgeEligibility(int age) {
        if (age < 16) {
            throw new RuntimeException("Age must be 16 or older.");
        } else {
            System.out.println("Age is eligible.");
        }
    }

    public static void main(String[] args) {
        int age = 15;
        try {
            checkAgeEligibility(age);
        } catch (RuntimeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }







}
