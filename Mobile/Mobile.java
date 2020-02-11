package OOPS.Mobile;

abstract public class Mobile {
    private double length;
    private double breadth;
    private String serialnumber;
    private double memory;
    Mobile(double length,double breadth,String serialnumber,double memory)
    {
        this.length=length;
        this.breadth=breadth;
        this.serialnumber=serialnumber;
        this.memory=memory;

    }
    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

    public double getMemory() {
        return memory;
    }
    public String getSerialnumber() {
        return serialnumber;
    }
   abstract public void increaseVolume();
    abstract  public void decreaseVolume();
}
