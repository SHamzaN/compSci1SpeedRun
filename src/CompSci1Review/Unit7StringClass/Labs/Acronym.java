package CompSci1Review.Unit7StringClass.Labs;
import java.util.Scanner;
public class Acronym
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter 3 words --> ");
        String word1 = keyboard.next();
        String word2 = keyboard.next();
        String word3 = keyboard.next();

        String acronym = word1.substring(0,1) + word2.substring(0,1) + word3.substring(0,1);
        System.out.println("\nNew word = " + acronym);
    }
}
