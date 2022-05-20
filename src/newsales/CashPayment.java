package newsales;

public class CashPayment extends Payment{
    private int amountTendered;

    public CashPayment(int amount, int amountTendered) {
        super(amount);
        this.amountTendered = amountTendered;
    }

    /*public int getAmountTendered() {
        return amountTendered;
    }*/

    public void setAmountTendered(int amountTendered) {
        this.amountTendered = amountTendered;
    }

    public int calcChange() {
        return this.amountTendered - this.amount;
    }

    public void DetailPayment(){
        System.out.println("Cash Payment : amount - " + this.amount + ", Amount Tendered :" + this.amountTendered + " Change :" + calcChange());
    }
}
