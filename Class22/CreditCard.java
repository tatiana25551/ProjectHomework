package Class22;
//Create a class CreditCard and define variable balance and interest.
// Create an instance method that will calculate interest based on the given balance.
//Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
//Call the method by creating an object of each of the three classes.
public class CreditCard {
  double balance;
  double interest;

  double calculateInterest(double balance, double interest) {
    balance = 1000;
    interest = 15;
    return ((balance * interest / 100)/12);

  }
}
class Visa extends CreditCard{
}
class AX extends CreditCard {
  double calculateInterest(double balance, double interest) {
    balance =4000;
    interest = 20;
    return ((balance * interest / 100)/12);
  }
}
class CreditCardTester{
  public static void main(String[]args){

    CreditCard cc=new CreditCard();
    System.out.println(cc.calculateInterest(1000,15));
    Visa vc=new Visa();
    System.out.println(vc.calculateInterest(1000,15));
    AX amex=new AX();
    System.out.println(amex.calculateInterest(4000,20));

  }

}

