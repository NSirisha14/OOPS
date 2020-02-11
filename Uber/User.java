package OOPS.Uber;

abstract public class User {
    private String password;
    private String id;
    private String location;
    public String getId() {
        return id;
    }
    public String getLocation() {
        return location;
    }
    public String getPassword() {
        return password;
    }
    abstract public void displayRide();
}
