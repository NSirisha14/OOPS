package OOPS.Laptop;


    public class TouchDellLaptop extends DellLaptop implements touchscreen {

        TouchDellLaptop(double length,double breadth,String serialnumber,String Memory)
        {
            super(length, breadth, serialnumber, Memory);
        }
        public void touchscreen()
        {
            System.out.println("screen is operated using touch");
        }



    }


