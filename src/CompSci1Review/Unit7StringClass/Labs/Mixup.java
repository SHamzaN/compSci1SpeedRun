package CompSci1Review.Unit7StringClass.Labs;
import java.util.Scanner;
public class Mixup
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a string --> ");
        String word = keyboard.nextLine();

        String mixedUpWordPart1 = word.substring(word.length() / 2);
        String mixedUpWordPart2 = word.substring(0, word.length()/2);
        System.out.println("\nMixed up string = " + mixedUpWordPart1 + mixedUpWordPart2);
    }
}
