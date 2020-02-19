package OOPS.HotstarRegister;

public class VipRegister extends HotstarRegister implements Payment {
    private double pay;
    public double getPay() {
        return pay;
    }
    public VipRegister(double pay)
  {
      this.pay=pay;
  }
    @Override
    public void pay(double amount) {
        amount=this.pay;
         System.out.println("payment of vip account "+amount);
    }
    @Override
    public void register() {
        pay(pay);
        System.out.println("registration for the vip account successful");
    }

}
