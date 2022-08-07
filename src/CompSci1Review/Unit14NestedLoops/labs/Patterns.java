package CompSci1Review.Unit14NestedLoops.labs;

import java.util.Scanner;
public class Patterns
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a number --> ");
        int astericks = keyboard.nextInt();

         for (int i = 0; i < astericks; i++)
         {
             for (int j = 0; j < i; j++)
             {
                     System.out.print("*" + " ");
             }
             System.out.println();
         }

        for (int i = 0; i < astericks; i++)
        {
           for (int j = astericks; j > i; j--)
           {
               System.out.print("*" + " ");
           }
            System.out.println();
        }

    }
}
