package CompSci1Review.Unit5ScannerClass.Labs;

import java.util.Scanner;

public class Rectangle
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);


        System.out.print("Enter the Length --> ");
        int num = keyboard.nextInt();
        System.out.print("Enter the Width --> ");
        int num1 = keyboard.nextInt();

        int perimeter = 2 * (num + num1);
        int area = num * num1;
        System.out.println();
        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);
    }
}
