package OOPS.Uber;

public class Passenger extends User {
    @Override
    public void displayRide() {
    System.out.println("Passenger list of rides ");
    }
    public void Payment()
    {
        System.out.println("payment completed");
    }
    public void giveRating() {
        System.out.println(" rating given to driver");
    }
}
