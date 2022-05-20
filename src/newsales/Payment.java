package newsales;

import java.math.BigDecimal;

abstract public class Payment implements IPayment{
    public int amount;

    public Payment(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


}
