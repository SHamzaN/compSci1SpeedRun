package CompSci1Review.Unit7StringClass.Labs;
import java.util.Scanner;
public class addressLabel
{
    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter name --> ");
        String name = keyboard.nextLine();
        System.out.print("Enter street address --> ");
        String address = keyboard.nextLine();
        System.out.print("Enter city --> ");
        String city = keyboard.nextLine();
        System.out.print("Enter state --> ");
        String state = keyboard.nextLine();
        System.out.print("Enter zip code --> ");
        int zipCode = keyboard.nextInt();

        System.out.println("\n");
        System.out.println("     Address Label");
        System.out.println("------------------------");
        System.out.println(name);
        System.out.println(address);
        System.out.println(city + ", " + state + " " + zipCode);
    }
}
