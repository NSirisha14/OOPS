/*
    This class is an abstract class which is extended by Pizza and Burger class
*/
public abstract class Meal
{
    String name;
    String getName()
    {
        return this.name;
    }
    void setName(String name)
    {
        this.name = name;
    }
    public abstract void cook();
}