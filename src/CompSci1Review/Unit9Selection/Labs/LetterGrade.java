package CompSci1Review.Unit9Selection.Labs;

import java.util.Scanner;

public class LetterGrade
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a Numerical Grade--> ");
        int num = keyboard.nextInt();

        if (num >= 97 && num <= 100)
        {
            System.out.println("Letter Grade = A+");
        }
        else if (num >= 94 && num <= 96)
        {
            System.out.println("Letter Grade = A");
        }
        else if (num >= 90 && num <= 93)
        {
            System.out.println("Letter Grade = A-");
        }
        else if(num >= 87 && num <= 89)
        {
            System.out.println("Letter Grade = B+");
        }
        else if (num >= 84 && num <= 86)
        {
            System.out.println("Letter Grade = B");
        }
        else if (num >= 80 && num <= 83)
        {
            System.out.println("Letter Grade = B-");
        }
        else if (num >= 77 && num <= 79)
        {
            System.out.println("Letter Grade = C+");
        }
        else if(num >= 74 && num <= 76)
        {
            System.out.println("Letter Grade = C");
        }
        else if(num >= 70 && num <= 73)
        {
            System.out.println("Letter Grade = C-");
        }
       else
            System.out.println("Letter Grade = F");
    }
}
