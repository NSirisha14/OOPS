package OOPS.Family;

public class Parent implements grandParent{
    private double weight;
    private double height;
Parent(double weight,double height)
{
    this.weight=weight;
    this.height=height;
}
    public double getHeight() {
        return height;
    }
    public double getWeight() {
        return weight;
    }

    @Override
    public void FemaleGenes() {
       System.out.println("Female Genes");
    }

    @Override
    public void maleGenes() {
        System.out.println("male Genes");
    }
    public void OwnGenes()
    {
        System.out.println("his/her Genes");
    }
}
