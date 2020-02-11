package OOPS.Family;

public class Main {
    public static void main(String[] args)
    {
        Parent p=new Parent(60,5.5);
        p.maleGenes();
        p.FemaleGenes();
        p.OwnGenes();
        p=new Son(70,5.7);

        p.FemaleGenes();
        p.OwnGenes();
        p.maleGenes();
    }
}
