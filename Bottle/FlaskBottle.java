package OOPS.Bottle;

public class FlaskBottle extends Bottle implements temperature{
    FlaskBottle(String material,double capacity,String color)
    {
        super(material, capacity, color);
    }
    public void open()
    {
        System.out.println("open the cap for the bottle");
    }
    public void TemperatureMaintained()
    {
        System.out.println("to maintain the temperature in bottle");
    }
}
