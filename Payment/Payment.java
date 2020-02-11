package OOPS.Payment;

abstract public class Payment {
    private String accountId;
    private String password;
 public Payment()
    {
        this.accountId=null;
        this.password=null;
    }
    public Payment(String accountId,String password)
    {
        this.accountId=null;
        this.password=null;
    }
    public String getPassword() {
        return password;
    }
    public String getAccountId() {
        return accountId;
    }
    abstract public void amountPayment();

}
