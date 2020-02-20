package OOPS.Computer;

public class TestMain {
    public static void main(String[] args)
    {
        Computer computer=new Computer();
        computer.click();
        Computer computer1=new Laptop();
        computer1.click();
        Laptop laptop=new Laptop();
        laptop.buildInSpeakers();
        laptop.touchpad();
        laptop.click();
    }
}

