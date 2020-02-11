package OOPS.BOARD;

public class markerBoard extends Board  {

    markerBoard(double length,double breadth,String material)
    {
        super(length,breadth,material);
    }
    public void write()
    {
        System.out.println("markerPen writing");
    }


    @Override
    public void clean() {
        System.out.println("markerPen dusting or cleaning");
    }
}
