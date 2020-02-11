package OOPS.Vehicle;

abstract public class Vehicle {
    private double speed;
    private int noOfGears;

    public void setNoOfGears(int noOfGears) {
        this.noOfGears = noOfGears;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }
    public int getNoOfGears() {
        return noOfGears;
    }
    abstract public void moveLeft();
 abstract public void moveRight();

}
