package CompSci1Review.Unit12Iterationdowhile.labs;

import java.util.*;

public class Largest
{
    private int largest = 0;   // stores current largest number
    private Scanner keyboard = new Scanner(System.in);

    /* This method compares parameter num1 to parameter num2. If num1 is
     * greater than num2 the method returns num1; otherwise it returns
     * num2.
     * @ return the larger of num1 and num2
     * @ param num1 first number in comparison
     * @ param num2 second number in comparison
     */
    public int compare(int num1, int num2)
    {
        if (num1 > num2)
        {
            return num1;
        }
        else
         return num2;
    }

    /* This method prompts the user to enter 10 numbers. As each number
     * is read the method makes a call to compare method so the new input
     * number can be compared to the current largest number. The number
     * returned by the compare method is stored in the instance variable
     * largest.
     */
    public void findLargest()
    {
        System.out.println("Enter 10 numbers");
         int num;
        int count = 0;
        do
        {
            num = keyboard.nextInt();

            largest = compare(num, largest);

            count++;

        }while (count < 10);
    }

    /* This method displays the instance variable largest.
     */
    public void printLargest()
    {
        System.out.println("\nThe Largest Number is " + largest);
    }

    public static void main(String[] args)
    {
        Largest app = new Largest();
        app.findLargest();
        app.printLargest();
    }
}
