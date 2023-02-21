package class28;
/*6) Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance. Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet has petType attribute. Create 3 objects of the sub classes and store them in ArrayList. Using for loop/advanced for loop/ iterator access all methods of the class.
 Create a Card class that will have interest rate field and card type
  and a constructor that will initialize the fields.
  Create 3 objects of different card and store them into LinkedList.
  Using for loop/advanced for loop/ iterator access all methods of the class.*/
public class Insurance {
public String insuranceName;

public Insurance(String insuranceName) {
    this.insuranceName = insuranceName;
}
    public String getInsuranceName() {
        return this.insuranceName;
    }
     public void getQuote(){
    }
     public  void  cancelInsurance() {
    }
}
class Car extends Insurance {
    String carModel;

    public Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel = carModel;
    }

    public String getCarModel() {
        return carModel;
    }
}
    class Pet extends Insurance {
        String petType;

        public Pet(String insuranceName, String petType) {
            super(insuranceName);
            this.petType = petType;
        }
    }

    class Health extends Insurance {
        public Health(String insuranceName) {
            super(insuranceName);
        }
    }

   class Card {

        private double interestRate;
        private String cardType;

        public Card(double interestRate, String cardType) {
            this.interestRate = interestRate;
            this.cardType = cardType;
        }

        public double getInterestRate() {
            return interestRate;
        }
        public void setInterestRate(double interestRate) {
            this.interestRate = interestRate;
        }
        public String getCardType() {
            return cardType;
        }
        public void setCardType(String cardType) {
            this.cardType = cardType;
        }

    }

