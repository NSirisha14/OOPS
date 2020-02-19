package OOPS.Watch;

public class SmartWatch extends Watch {
    @Override
    public void displayTime() {
        System.out.println("Display the time of the smart watch");
    }
    @Override
    public void changeTime() {
        System.out.println("change the time of the smart watch");
    }
    public void displayHeartBeats()
    {
        System.out.println("Display the heart beats in the smart watch");
    }
    public void displayNumberOfSteps()
    {
        System.out.println("Display the number of steps in the smart watch");
    }
}
