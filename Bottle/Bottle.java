package OOPS.Bottle;

abstract public class Bottle {
   private String material;
   private double capacity;
   private String color;
   Bottle(String material,double capacity,String color)
   {
       this.material=material;
       this.capacity=capacity;
       this.color=color;
   }
   abstract public void open();
}
