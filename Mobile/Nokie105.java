package OOPS.Mobile;

public class Nokie105 extends Mobile implements mobileKeyBoard{
    Nokie105(double length,double breadth,String serialnumber,double memory)
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
    public void KeyBoardFunctionality() {
        System.out.println("mobile keyboard implementation");
    }
}
