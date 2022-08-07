package CompSci1Review.Unit9Selection.Labs;

import java.util.Scanner;

public class Triangle
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter Side 1 --> ");
        int num1 = keyboard.nextInt();
        System.out.print("Enter Side 2 --> ");
        int num2 = keyboard.nextInt();
        System.out.print("Enter Side 3 --> ");
        int num3 = keyboard.nextInt();

        System.out.println();
        if (num1 == num2 && num2 == num3 && num3 == num1)
        {
            System.out.println("This triangle is an equilateral");
        }
        else if (num1 == num2 || num2 == num3 || num3 == num1)
        {
            System.out.println("This triangle is an isosceles");
        }
        else
            System.out.println("This triangle is a scalene");
    }
}
