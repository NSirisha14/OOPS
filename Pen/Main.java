package OOPS.Pen;

public class Main {
    public static void main(String[] args) {
        ballpen bp = new ballpen("plastic", "blue");
        bp.purpose();
        MarkerPen gp = new MarkerPen("plastic", "blue");
        gp.purpose();
        clickBallPen cbp = new clickBallPen("plastic", "blue");
        cbp.purpose();
        cbp.click();
    }
}
