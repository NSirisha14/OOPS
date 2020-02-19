package OOPS.HotstarRegister;

public class TestHotstar {
    public static void main(String[] args)
    {
        HotstarRegister hotstarRegister=new VipRegister(200);
        hotstarRegister.register();
        hotstarRegister=new PremiumRegister(300);
        hotstarRegister.register();
    }

}
