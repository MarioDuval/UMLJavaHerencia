package newsales;

import java.math.BigDecimal;

public class CreditCardPayment extends Payment{
    private int cardNumber;

    public CreditCardPayment(int cardNumber, int amount) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    /*public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }*/

    public boolean authorize() {
        return false;
    }



    public void DetailPayment() {
        System.out.println("Credit Card Payment : amount - " + this.amount + ", Credit Card Number :" + this.cardNumber + " authorize : " + authorize());
    }
}
