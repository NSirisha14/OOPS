package OOPS.Payment;

public class TestPayment {
    public static void main(String[] args)
    {
        Payment p=new CashPayMent();
        p.amountPayment();
        Payment p1=new OnlinePayment();
        p1.amountPayment();
    }
}
