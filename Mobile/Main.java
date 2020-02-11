package OOPS.Mobile;

public class Main {
    public static void main(String[] args) {
        Nokie105 nokie = new Nokie105(10, 5, "1234", 10);
        Redmi redmi = new Redmi(15, 8, "1213", 64);
        Redmi7 redmi7 = new Redmi7(15, 8, "1213", 64);
        nokie.KeyBoardFunctionality();
        nokie.increaseVolume();
        redmi.increaseVolume();
        redmi.touchscreen();
        redmi7.fingerPrint();

    }
}
