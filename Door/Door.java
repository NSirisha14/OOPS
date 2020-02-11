abstract class Door 
{
 private double length;
 private double breadth;
 private double width;
 private String Material;
 Door(int length,int breadth,int width)
  {
    this.length=length;
    this.breadth=breadth;
    this.width=width;
  }
  public double getLength(double length)
  {
   return length;
   }
  public double getbreadth(double breadth)
  {
   return breadth;
   }
   public double getwidth(double width)
  {
   return width;
   }
abstract public void open();
abstract public void close();
}
 


