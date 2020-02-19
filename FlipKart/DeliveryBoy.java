package OOPS.FlipKart;

public class DeliveryBoy extends User {

    @Override
    public void displayOrders() {
        System.out.println("display orders that the deliveryBoy had delivered");
    }

    @Override
    public void displayCurrentOrders() {
        System.out.println("display current orders that the deliveryBoy has to be delivered");
    }
}
