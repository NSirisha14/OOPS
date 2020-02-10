package OOPS.Pen;

abstract public class pen {
   private String material ;
   private String colour;

   pen(String material,String colour)
   {
       this.material=material;
       this.colour=colour;
   }
    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }
    public abstract void purpose();

}
