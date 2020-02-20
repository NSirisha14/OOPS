package OOPS.Computer;

public class Computer implements Mouse{
    private double length;
    private  double breadth;
    public double getLength() {
        return length;
    }
    public double getBreadth() {
        return breadth;
    }
    public void click()
    {
        System.out.println("click a certain thing to access");
    }
}
