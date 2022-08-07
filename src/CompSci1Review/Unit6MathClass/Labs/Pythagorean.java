package CompSci1Review.Unit6MathClass.Labs;
import java.util.Scanner;
public class Pythagorean
{
    public static void main(String[] args)
    {
        int a = 0;
        int b = 0;
        double c = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter side 1 -->");   // prompt
        a = keyboard.nextInt();                 // read a's length
        System.out.print("Enter side 2 -->");   // prompt
        b = keyboard.nextInt();                 // read b's length

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println();
        System.out.println("The hypotenuse of the triangle = " + Math.round(c));

    }
}
