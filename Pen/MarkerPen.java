package OOPS.Pen;

public class MarkerPen extends pen{
    MarkerPen(String material,String colour)
    {
        super(material,colour);
    }

    @Override
    public void purpose() {
       System.out.println("to highlight");
    }
}

interface click
{
    public void click();
}
