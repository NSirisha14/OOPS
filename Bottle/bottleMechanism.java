package OOPS.Bottle;

public class bottleMechanism {
    public static void main(String[] args) {
        Bottle b = new celloBottle("plastic", 1, "blue");
        Bottle b1 = new FlaskBottle("plastic", 1, "blue");
        b.open();
        b1.open();
        FlaskBottle fb= new FlaskBottle("plastic", 1, "blue");
        fb.TemperatureMaintained();
    }
}
