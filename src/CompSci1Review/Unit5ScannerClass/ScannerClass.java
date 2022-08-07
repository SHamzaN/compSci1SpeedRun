package CompSci1Review.Unit5ScannerClass;
import java.util.Scanner;
public class ScannerClass
{
    public static void main(String[] args)
    {
        //The Scanner class is a standard Java class that can be used to read user input from the keyboard or a file.
        Scanner keyboard = new Scanner(System.in);

        /*
        nextInt() Method
        The nextInt() method inables users to read integer values from the keyboard.
         */
        /*
        print Statement
It is customary to precede each nextInt in your program with a user prompt.
         */

        System.out.print("Enter the number of games played--> ");    // user prompt
        int games = keyboard.nextInt();

        /*
nextDouble() Method
The nextDouble method is identical to the nextInt method except that it reads floating-point or decimal values from the keyboard instead of integers.
            */


        double num = 0;

        System.out.print("Enter a decimal number --> ");
        num = keyboard.nextDouble();                     // read decimal value from
        // the keyboard
        System.out.println();
        System.out.println("The number entered = " + num);

    }
}
