package OOPS.Television;

public class SmartTelevision extends NormalTelevision {
    @Override
    public void increaseVolume() {
        System.out.println("increase volume in smart television");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("decrease volume in smart television");
    }

    @Override
    public void channelTunning() {
        System.out.println("used for channel changing in smart television");
    }
    public void wifiConnection()
    {
        System.out.println("wifi connection in smart television");
    }
}
