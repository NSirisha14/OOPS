package OOPS.Bottle;

public class celloBottle extends Bottle {
    celloBottle(String material,double capacity,String color)
    {
        super(material, capacity, color);
    }
    @Override
    public void open()
    {
        System.out.println("open the cap of the bottle");
    }

}

