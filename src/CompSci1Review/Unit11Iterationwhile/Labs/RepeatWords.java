package CompSci1Review.Unit11Iterationwhile.Labs;

import java.util.Scanner;

public class RepeatWords
{
    public static void main(String[] args)
    {
        String word = "";
        int wordcount = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter words, type (stop or exit) to stop: ");
        System.out.println();

        while (!word.equalsIgnoreCase("stop") && !word.equalsIgnoreCase("exit"))
        {
            word = keyboard.nextLine();
            wordcount++;

        }
        
        System.out.println("\nYou entered " + wordcount + " words.");
    }
}
