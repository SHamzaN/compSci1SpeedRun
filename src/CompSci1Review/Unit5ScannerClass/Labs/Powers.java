package CompSci1Review.Unit5ScannerClass.Labs;

import java.util.Scanner;

public class Powers
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter an integer--> ");
        int num = keyboard.nextInt();

        int square = num * num;
        int cube = (int) Math.pow(num, 3);
        int fourthpower = (int) Math.pow(num,4);

        System.out.println();
        System.out.println("The Square = " + square);
        System.out.println("The Cube = " + cube);
        System.out.println("The Fourth Power = " + fourthpower);
    }
}
