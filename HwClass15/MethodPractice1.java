package HwClass15;
//Create a method that will take 2 parameters as a numbers and prints which number is larger
public class MethodPractice1 {

    int num1;
    int num2;

    int largerNumber(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
}
