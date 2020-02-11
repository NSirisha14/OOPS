package OOPS.Zomato;

public class DeliveryPerson extends User {
    @Override
    public void displayOrders() {
        System.out.println("List the orders of driver");
    }

    @Override
    public void displayCurrentOrders() {
        System.out.println(" delivery list of items in current Orders ");
    }
}
