package OOPS.Spectacles;

public class TestSpectacles {
    public static void main(String[] args)
    {
        Spectacles spectacles=new NormalSpectacles();
        spectacles.changeGlass();
        spectacles=new SmartSpectacles();
        spectacles.changeGlass();
        SmartSpectacles smartSpectacles=new SmartSpectacles();
        smartSpectacles.takePicture();
        smartSpectacles.connectBluetooth();
    }
}
