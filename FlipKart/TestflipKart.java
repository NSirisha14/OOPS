package OOPS.FlipKart;

public class TestflipKart {
    public static void main(String[] args)
    {
        User user=new EndUser();
        user.displayCurrentOrders();
        user.displayOrders();
        User user1=new DeliveryBoy();
        user1.displayOrders();
        user1.displayCurrentOrders();
    }
}
