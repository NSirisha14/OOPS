package OOPS.HotstarRegister;

public class PremiumRegister extends HotstarRegister implements Payment{
    private double pay;

    public double getPay() {
        return pay;
    }
    public PremiumRegister(double pay)
    {
        this.pay=pay;
    }
    @Override
    public void pay(double amount) {
        amount=this.pay;
        System.out.println("payment of Premium account "+amount);
    }
    @Override
    public void register() {
        pay(pay);
        System.out.println("Registration for the Premium account successful");
    }


}
