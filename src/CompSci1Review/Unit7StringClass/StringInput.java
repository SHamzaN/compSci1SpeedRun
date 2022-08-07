package CompSci1Review.Unit7StringClass;
import java.util.Scanner;
public class StringInput
{
    public static void main(String[] args)
    {
        /*
        next Method
The first method we will look at is the next method. The next method reads a series of characters until it encounters a delimeter.
A delimeter is a special character that separates one piece of data from another.
It is usually a white space character such as a space, tab, or end-of-line character.
Once a delimeter has been reach the next method combines all of the input characters together into a single string.
         */

        Scanner keyboard = new Scanner(System.in); // instantiate Scanner object
        String str1 = "";
        String str2 = "";

        System.out.print("Enter two words --> ");
        str1 = keyboard.next();           // read until white space encountered
        str2 = keyboard.next();           // read until white space encountered

        System.out.println(str1);
        System.out.println(str2);

        /*
        nextLine Method
The second method used to read strings from the keyboard is the nextLine method.
The nextLine method reads a series of characters from the keyboard until it encounters an end-of-line character then converts the characters to a string.
         */
        Scanner keyboard1 = new Scanner(System.in);   // instantiate Scanner object
        String str;

        System.out.print("Enter a sentence --> ");
        str = keyboard1.nextLine();      // reads until end-of-line marker encountered

        System.out.println();
        System.out.println(str);

        /*
        Removing the End of Line Marker (EOLN)
When users of a program are typing from the keyboard they press the Enter key to signify the end of data entry.
The Scanner methods nextInt, nextDouble, and next will read the data from the keyboard but they do not remove the end of line marker (EOLN) left when the Enter key was pressed after entering the value or values.

         */

        System.out.print("Enter an integer --> ");
        int n = keyboard.nextInt();

        System.out.print("Enter your age -->");
        int age = keyboard.nextInt();                 // nextInt

        System.out.print("Enter your name -->");
        String name = keyboard.nextLine();            // followed by nextLine

        System.out.println("Age = " + age);
        System.out.println("Name = " + name);

        System.out.print("Enter your age -->");
        int age1 = keyboard.nextInt();

        keyboard.nextLine();    // dummy read

        System.out.print("Enter your name -->");
        String name1 = keyboard.nextLine();
    }

}
