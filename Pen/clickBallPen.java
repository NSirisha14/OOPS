package OOPS.Pen;

public class clickBallPen extends ballpen implements click{
   clickBallPen(String material,String colour)
    {
        super(material,colour);
    }
    public void click()
    {
        System.out.println(" clicked ");
    }

    @Override
    public void purpose() {
        System.out.println("to write");
    }
}
