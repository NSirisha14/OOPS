/*
    This class extends bottle class and provides an implementation for deliver method
*/
public class Softdrink extends Bottle
{
    Softdrink(String company,String content)
    {
        super(company,content);
    }
    public void deliver()
    {
        System.out.println("Softdrink is ready!");
    }
}