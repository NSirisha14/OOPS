/*
    This class extends Meal class and implements the cook method in Meal class
*/

public class Burger extends Meal
{
    double burgerRadius;
    boolean isVeg;
    Burger(double burgerRadius,boolean isVeg)
    {
        this.burgerRadius = burgerRadius;
        this.isVeg = isVeg;
    }
    double getburgerRadius()
    {
        return this.burgerRadius;
    }
    boolean getisVeg()
    {
        return this.isVeg;
    }
    void setburgerRadius(double burgerRadius)
    {
        this.burgerRadius = burgerRadius;
    }
    void setisVeg(boolean isVeg)
    {
        this.isVeg = isVeg;
    }
    public void cook()
    {
        System.out.println("Burger is ready!");
    }
}