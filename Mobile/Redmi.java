package OOPS.Mobile;

public class Redmi extends Mobile implements touchScreen{
    Redmi(double length,double breadth,String serialnumber,double memory)
    {
        super(length, breadth, serialnumber, memory);
    }

    @Override
    public void increaseVolume() {
        System.out.println("Implementation of increaseVolume");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("Implementation of decreaseVolume");
    }

    @Override
    public void touchscreen() {
        System.out.println("Implementation of touchScreen");
    }


}
