package CompSci1Review.Unit5ScannerClass;

import java.util.Scanner;  // Step 1: include an import statement at the top

public class ReadIntegers
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in); // Step 2: instaniate Scanner object
        int num1 = 0, num2 = 0, num3 = 0;

        System.out.print("Enter 1st Number--> ");
        num1 = keyboard.nextInt();                   // Step 3: call nextInt() method
        System.out.print("Enter 2nd Number--> ");    //         and store the results
        num2 = keyboard.nextInt();                   //         in integer variables
        System.out.print("Enter 3rd Number--> ");
        num3 = keyboard.nextInt();

        System.out.println();
        System.out.println("Number 1 = " + num1);  // Step 4: use the integer variables
        System.out.println("Number 2 = " + num2);  //         in your program.
        System.out.println("Number 3 = " + num3);
    }
}
