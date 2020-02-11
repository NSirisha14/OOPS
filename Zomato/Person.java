package OOPS.Zomato;

public class Person extends User {
    private String location;

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public void displayOrders() {
    System.out.println("Passenger list of Orders ");
    }

    @Override
    public void displayCurrentOrders() {
        System.out.println("Passenger list of items in current Orders ");
    }

    public void Payment()
    {
        System.out.println("payment completed");
    }
}
