import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
  //   Dog d = new Dog("poodle", "lala", "brown", 10);
  //   Dog myDog = new Dog(); 







    // Uncomment and complete the code below to test your Plane class
    Scanner sc = new Scanner(System.in);
    String input = "";
    Plane p = new Plane(1000);
    while (!input.equals("q"))
    {
      System.out.println(p);
      System.out.println("Type \"u\" to move upwards, \"d\" to move downwards, \"n\" for new Plane, \"q\" to quit.");
      // System.out.println(print the plane's location and uncomment);
      input = sc.nextLine();

      if (input.equals("u"))
      {
        p.upward();
      }
      else if (input.equals("d"))
      {
        p.downward();
      }
      else if (input.equals("n"))
      {
        System.out.println("Starting location for a new plane?");
        int location = sc.nextInt();
        sc.nextLine(); // consume the ENTER key left behind by nextInt()
        p = // create new plane at proper location
      }
      else if (input.equals("q"))
      {
        System.out.println("Thank you for using plane simulator");
      }
      else
      {
        System.out.println("Invalid input");
      }
    }
  }
}
