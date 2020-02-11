package OOPS.Vehicle;

public class Car extends Vehicle {
    private double curFuel;

    public void setCurFuel(double curFuel) {
        this.curFuel = curFuel;
    }

    public double getCurFuel() {
        return curFuel;
    }

    @Override
    public void moveLeft() {
        System.out.println("moveLeft");
    }

    @Override
    public void moveRight() {
        System.out.println("moveRight");
    }
    public void moveBack()
    {
        System.out.println("move in backward direction");
    }
}
