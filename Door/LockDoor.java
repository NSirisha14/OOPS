class LockDoor extends Door implements Idoor,IlockDoor
{

LockDoor(int length,int breadth,int width)
{
 super(length,breadth,width);
}
  public void open()
   {
   System.out.println("open");
   }
   public void close()
   {
    System.out.println("close");
   }

   public void Lock()
   {
    System.out.println("Lock");
   }
   public void Lock(String password)
  {
   System.out.println("Locked with password");
  }

   public void unLock()
   {
    System.out.println("UnLock");
   }
   
   public void UnLock(String password)
  {
   System.out.println("UnLocked with password");
  }

}
