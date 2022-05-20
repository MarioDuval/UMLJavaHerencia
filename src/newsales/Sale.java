package newsales;

public class Sale {
    private String id;
    private String desc;
    private Payment payment;

    public Sale(String id, String desc){
        this.id = id;
        this.desc = desc;
    }

    public void setPayment(Payment pay){
        this.payment = pay;
    }

    public Payment getPayment(){
        return this.payment;
    }
}
