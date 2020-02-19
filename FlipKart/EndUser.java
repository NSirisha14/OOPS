package OOPS.FlipKart;

public class EndUser  extends User{


    @Override
    public void displayOrders() {
    System.out.println("display orders of the end user");
    }

    @Override
    public void displayCurrentOrders() {
        System.out.println("display current orders of the end user");
    }
    public void pay()
    {
        System.out.println("payment of the end user");
    }
}
