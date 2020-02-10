package OOPS.Laptop;

public class DellLaptop extends Laptop{

    DellLaptop(double length,double breadth,String serialnumber,String Memory)
    {
       super(length, breadth, serialnumber, Memory);
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
