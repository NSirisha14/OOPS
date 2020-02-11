package OOPS.Uber;

public class TestUber {
    public static void main(String[] args)
    {
        User u=new Driver();
        u.displayRide();
        User user=new Passenger();
        user.displayRide();
        Passenger p=new Passenger();
        p.Payment();
    }
}
