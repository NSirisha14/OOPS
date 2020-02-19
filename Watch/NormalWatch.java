package OOPS.Watch;

public class NormalWatch extends Watch {
    @Override
    public void displayTime() {
      System.out.println("Display the time of the normal watch");
    }

    @Override
    public void changeTime() {
        System.out.println("change the time of the normal watch");
    }
}
