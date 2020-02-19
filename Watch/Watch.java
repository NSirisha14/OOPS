package OOPS.Watch;

abstract public class Watch {
    private int size;

    public void setSize(int size) {
        this.size = size;
    }
    public int getSize() {
        return size;
    }
    abstract public void displayTime();
    abstract public void changeTime();
}
