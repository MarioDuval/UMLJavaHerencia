package newsales;

import java.util.ArrayList;

public class NewSales {
    public static void main(String[] args) throws Exception {

        ArrayList<Sale> arraySale = new ArrayList<Sale>();

        Sale s1 = new Sale("01", "producto 1");
        Payment p1 = new CashPayment(1000, 1500);
        s1.setPayment(p1);
        //pago en cash pvp = 1000, importe recibido = 1500

        Sale s2 = new Sale("02", "producto 2");
        Payment p2 = new CreditCardPayment(1234567, 3000);
        s2.setPayment(p2);
        //pago en creditCard card Number = 1234567 pvp = 3000

        Sale s3 = new Sale("03", "producto 3");
        Payment p3 = new CashPayment(44000, 53000);
        s3.setPayment(p3);
        //pago en cash pvp = 44000, importe recibido = 53000

        Sale s4 = new Sale("04", "producto 4");
        Payment p4 = new CashPayment(1000, 2000);
        s4.setPayment(p4);
        //pago en cash pvp = 1000, importe recibido = 2000

        arraySale.add(s1);
        arraySale.add(s2);
        arraySale.add(s3);
        arraySale.add(s4);

        arraySale.stream().forEach((p)-> { p.getPayment().DetailPayment();});
    }
}

/*
Cash Payment : amount - 1000, Amount Tendered :1500 Change :500
Credit Card Payment : amount - 3000, Credit Card Number :1234567 authorize : false
Cash Payment : amount - 44000, Amount Tendered :53000 Change :9000
Cash Payment : amount - 1000, Amount Tendered :2000 Change :1000
*/
