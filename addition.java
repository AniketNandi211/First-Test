import java.util.Scanner;

public class MyClass {
  public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter two numbers to add : ");
    try{
      int fnum = input.nextInt();
      int lnum = input.nextInt();
      System.out.println("The Sum of "+fnum+" and "+lnum+" is "+(fnum+lnum));
    } catch (Exception exception) {
      System.out.println("An unexpected error has occured please give only Integer values");
    }
    finaly {
      System.out.println("Thank you, Have a good day.")
    }
  }
}
