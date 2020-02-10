package OOPS.Laptop;

abstract public class Laptop implements KeyBoard {
    private double length;
    private  double breadth;
    private String serialnumber;
    private String Memory;
    private int volume;
    Laptop(double length,double breadth,String serialnumber,String Memory)
    {
        this.length=length;
        this.breadth=breadth;
        this.serialnumber=serialnumber;
        this.Memory=Memory;
    }

    public double getBreadth() {
        return breadth;
    }

    public double getLength() {
        return length;
    }

    public String getMemory() {
        return Memory;
    }

    public String getSerialnumber() {
        return serialnumber;
    }
    public void write()
    {
        System.out.println(" to write the content");
    }

    @Override
    public void decreaseVolume() {

        System.out.println("decrease Volume");
    }

    @Override
    public void increaseVolume() {

        System.out.println("increase Volume");
    }
}
