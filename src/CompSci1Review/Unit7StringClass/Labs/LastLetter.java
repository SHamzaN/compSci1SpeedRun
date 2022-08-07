package CompSci1Review.Unit7StringClass.Labs;
import java.util.Scanner;
public class LastLetter
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String str = "";

        System.out.print("Enter a string --> ");
       str = keyboard.nextLine();
        int len = str.length();
      String lastLetter = str.substring(len -1);
        System.out.println("\nLast letter = " + lastLetter);
    }
}
