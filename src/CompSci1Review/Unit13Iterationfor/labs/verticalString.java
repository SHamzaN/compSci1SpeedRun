package CompSci1Review.Unit13Iterationfor.labs;

import java.util.Scanner;
public class verticalString
{
    public static void main(String[] args)
    {
        System.out.print("Enter a string -->");
        Scanner keyboard = new Scanner(System.in);
        String word = keyboard.nextLine();

        for (int i = 0; i < word.length(); i++)
        {
            System.out.println(word.substring(i,i + 1));
        }
    }
}
