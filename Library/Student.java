package OOPS.Library;

public class Student extends LibraryUser {

    @Override
    public void borrowBooks() {
      System.out.println("borrow books by student");
    }

    public void returnBooks() {
        System.out.println("return books by student");
    }
}
