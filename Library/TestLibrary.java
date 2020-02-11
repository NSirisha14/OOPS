package OOPS.Library;

public class TestLibrary {
 public static void main(String[] args)
 {
     LibraryUser lu=new Faculty();
         lu.borrowBooks();
     LibraryUser lu1=new Student();
     lu1.borrowBooks();
 }
}
