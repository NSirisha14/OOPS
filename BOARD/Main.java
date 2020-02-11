package OOPS.BOARD;



public class Main {
     public static void main(String[] args)
        {
            Board s=new markerBoard(4,4,"material");
            s.write();
            s.clean();

            s=new blackBoard(4,4,"material");
            s.write();
            s.clean();

        }
    }
