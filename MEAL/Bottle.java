/*
    This is an abstract class and has abstract method deliver;
*/
public abstract class Bottle
{
    String company;
    String content;
    Bottle(String company,String content)
    {
        this.company = company;
        this.content = content;
    }
    String getCompany()
    {
        return this.company;
    }
    String getContent()
    {
        return this.content;
    }
    void setCompany(String company)
    {
        this.company = company;
    }
    void setContent(String content)
    {
        this.content = content;
    }
    public abstract void deliver();
}