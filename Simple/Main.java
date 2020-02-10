package OOPS.Simple;

public class Main {
    public static void main(String[] args)
    {
        Square s=new Square(4);
        System.out.println(s.area());
        System.out.println(s.perimeter());

        Square s1=new Square();
        s1.setSide(4);
        System.out.println(s1.area());
        System.out.println(s1.perimeter());
    }
}
