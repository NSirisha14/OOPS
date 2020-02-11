package OOPS.BOARD;

public class blackBoard extends Board {

    blackBoard(double length, double breadth, String material) {
        super(length, breadth, material);
    }

    @Override
    public void clean() {
    System.out.println("cleaning or dusting");
    }

    @Override
    public void write() {
        System.out.println("writing");
    }
}
