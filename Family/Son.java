package OOPS.Family;

public class Son extends Parent {

    Son(double weight,double height)
    {
        super(weight, height);
    }

    public void FemaleGenes() {
        System.out.println("SFemale Genes");
    }

    @Override
    public void maleGenes() {
        System.out.println("Smale Genes");
    }
    public void OwnGenes()
    {
        System.out.println("his/her SGenes");
    }
}
