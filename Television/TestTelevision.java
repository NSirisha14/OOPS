package OOPS.Television;

public class TestTelevision {
    public static void main(String[] args)
    {
        NormalTelevision normalTelevision=new NormalTelevision();
        normalTelevision.channelTunning();
        normalTelevision=new SmartTelevision();
        normalTelevision.channelTunning();
        SmartTelevision smartTelevision=new SmartTelevision();
        smartTelevision.wifiConnection();
    }
}
