/*
    This is the main class
*/
public class Restaurant
{
    public static void main(String args[])
    {
        Meal meal = new Pizza(8.0,3,true);
        meal.cook();
        meal = new Burger(8.0,false);
        meal.cook();
        Bottle bottle = new Softdrink("Mazza","Cooldrink");
        bottle.deliver();
    }
}