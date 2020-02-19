package OOPS.Spectacles;

abstract public class Spectacles{
    private String frame;
    private String glass;

    public void setFrame(String frame) {
        this.frame = frame;
    }
    public String getFrame() {
        return frame;
    }
    public void setGlass(String glass) {
        this.glass = glass;
    }
    public String getGlass() {
        return glass;
    }
    abstract public void changeGlass();

}
