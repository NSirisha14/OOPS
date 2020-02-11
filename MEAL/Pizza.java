/*
    This class extends Meal class and implements the cook method in Meal class
*/
public class Pizza extends Meal
{
    double pizzaRadius;
    double noOfSlices;
    boolean isVeg;
    Pizza(double pizzaRadius,double noOfSlices,boolean isVeg)
    {
        this.pizzaRadius = pizzaRadius;
        this.noOfSlices = noOfSlices;
        this.isVeg = isVeg;
    }
    double getPizzaRadius()
    {
        return this.pizzaRadius;
    }
    double getNoOfSlices()
    {
        return this.noOfSlices;
    }
    boolean getisVeg()
    {
        return this.isVeg;
    }
    void setPizzaRadius(double pizzaRadius)
    {
        this.pizzaRadius = pizzaRadius;
    }
    void setNoOfSlices(double noOfSlices)
    {
        this.noOfSlices = noOfSlices;
    }
    void setisVeg(boolean isVeg)
    {
        this.isVeg = isVeg;
    }
    public void cook()
    {
        System.out.println("Pizza is ready!");
    }
}