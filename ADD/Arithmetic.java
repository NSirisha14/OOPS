package OOPS.ADD;

import java.util.ArrayList;

abstract public class Arithmetic {
    private int x;
    private int y;
 Arithmetic()
 {
     this.x=0;
     this.y=0;
 }
    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        return x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return y;
    }

    abstract public Integer add(int x, int y);

}
