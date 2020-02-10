package OOPS.Laptop;

public class Main {
    public static void main(String[] args) {
        DellLaptop dl = new DellLaptop(15, 10, "1233", "8GB");
        dl.write();
        dl.increaseVolume();
        dl.decreaseVolume();
        TouchDellLaptop tdl = new TouchDellLaptop(15, 10, "1233", "8GB");
        tdl.write();
        tdl.touchscreen();
    }
}