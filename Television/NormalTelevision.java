package OOPS.Television;

public class NormalTelevision implements Remote {
    private double screensize;
    private double length;
    private double breadth;
    public double getBreadth() {
        return breadth;
    }
    public double getLength() {
        return length;
    }
    public double getScreensize() {
        return screensize;
    }

    @Override
    public void increaseVolume() {
     System.out.println("increase volume in normal television");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("decrease volume in normal television");
    }

    @Override
    public void channelTunning() {
        System.out.println("used for channel changing in normal television");
    }
}
