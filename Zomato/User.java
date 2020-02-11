package OOPS.Zomato;

abstract public class User {
    private String password;
    private String id;

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }
    abstract public void displayOrders();
    abstract public void displayCurrentOrders();
}
