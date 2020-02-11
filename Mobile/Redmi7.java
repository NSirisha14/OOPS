package OOPS.Mobile;

public class Redmi7 extends Redmi implements fingerPrint{
    Redmi7(double length,double breadth,String serialnumber,double memory)
    {
        super(length, breadth, serialnumber, memory);
    }

    @Override
    public void increaseVolume() {
        System.out.println("Implementation of increaseVolume");
    }

    @Override
    public void decreaseVolume() {
        super.decreaseVolume();
    }
    public void touchscreen() {
        super.touchscreen();
    }
    public void fingerPrint()
    {
        System.out.println("fingerprint implementation");
    }

}
