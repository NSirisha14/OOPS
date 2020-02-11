package OOPS.BOARD;

abstract public class Board{
    private double length;
    private double breadth;
    private String material;
    Board(double length,double breadth,String material)
    {
        this.length=length;
        this.breadth=breadth;
        this.material=material;
    }
    public double getLength() {
        return length;
    }
    public double getBreadth() {
        return breadth;
    }
    public String getMaterial() {
        return material;
    }
    abstract public void write();
    abstract public void clean();
}
