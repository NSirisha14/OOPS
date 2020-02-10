package OOPS.Simple;

public class Square {
    private double side;
    Square()
    {
        this.side=0;
    }

   Square(double side)
   {
     this.side=side;
   }
    public void setSide(double side) {
        this.side =side;
    }
    public double getSide() {
        return side;
    }
    public double area()
    {
        return side*side;
    }
    public double perimeter()
    {
        return 4*side;
    }
}
