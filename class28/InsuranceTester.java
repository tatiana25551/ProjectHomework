package class28;

import java.util.ArrayList;
import java.util.LinkedList;

public class InsuranceTester {
    public static void main(String[] args) {
        ArrayList<Insurance> insuranceList = new ArrayList<>();

        Car carInsurance = new Car("StateFarm", "Volvo");
        Pet petInsurance = new Pet("Optima", "Corgi");
        Health healthInsurance = new Health("Anthem");

        insuranceList.add(carInsurance);
        insuranceList.add(petInsurance);
        insuranceList.add(healthInsurance);

        for (Insurance i : insuranceList) {
            i.getQuote();
            i.cancelInsurance();
        }

        LinkedList<Card> cardList = new LinkedList<>();


        Card masterCard = new Card(12.7, "MasterCard");
        Card amexCard = new Card(21.3,"Amex");
        Card visaCard = new Card(11.1, "Visa");

        cardList.add(visaCard);
        cardList.add(masterCard);
        cardList.add(amexCard);

        for (Card c : cardList) {
            System.out.println();

            System.out.println("Interest rate: " + c.getInterestRate());
            System.out.println("Card type: " + c.getCardType());
        }
    }
}
