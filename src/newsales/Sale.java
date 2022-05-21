package newsales;

public class Sale {
    private String id;
    private String description;
    private Payment payment;

    public Sale(String id, String description){
        this.id = id;
        this.description = description;
    }

    public void setPayment(Payment pay){
        this.payment = pay;
    }

    public Payment getPayment(){
        return this.payment;
    }
}
