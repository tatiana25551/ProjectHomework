package class33;
// Create a method checkUserName that will throw a runtime exception. Method should throw an exception when entered username is less than 5 characters.
public class Task4 {
    public static void checkUserName(String userName) {
     if (userName.length() < 5) {
        throw new RuntimeException("Username must be at least 5 characters.");
    } else {
        System.out.println("Username is valid.");
    }
}
    public static void main(String[] args) {
        String userName = "abc";
        try {
            checkUserName(userName);
        } catch (RuntimeException e) {
            System.out.println("Exception caught: " + e);
        }
    }

}
