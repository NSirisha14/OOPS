package OOPS.FlipKart;

abstract public class User {
    private String UserName;
    private String password;
    private String location;

    public void setLocation(String location) {
        this.location = location;
    }
    public String getLocation() {
        return location;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
    public void setUserName(String userName) {
        UserName = userName;
    }
    public String getUserName() {
        return UserName;
    }

    abstract public void displayOrders();
    abstract public void displayCurrentOrders();
}
