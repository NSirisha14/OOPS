package OOPS.Watch;

public class TestWatch {
    public static void main(String[] args)
    {
        Watch watch=new NormalWatch();
        watch.displayTime();
        watch.changeTime();
        watch=new SmartWatch();
        watch.displayTime();
        watch.changeTime();
        SmartWatch smartWatch=new SmartWatch();
        smartWatch.displayHeartBeats();
        smartWatch.displayNumberOfSteps();
    }
}
