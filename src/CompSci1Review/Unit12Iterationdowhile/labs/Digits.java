package CompSci1Review.Unit12Iterationdowhile.labs;

import java.util.*;

public class Digits
{
    /* This method continually divides parameter num
     * by 10 as long as num is greater than 0. The
     * number of divisions performed equals the number
     * of digits in num.
     * @ return the count of the number of digits in num
     * @ param num the number to be divided
     */
    public int getDigitCount(int num)
    {
        int count = 0;

        do
        {
             num /= 10;
             count++;

        }while (num > 0);

          return count;
    }

    /* This method continually divides parameter num
     * by 10 as long as num is greater than 0. Before
     * each division operation, it calculates and prints
     * the remainder of num divided by 10.
     */
    public void printDigits(int num)
    {

        do
        {
            num %= 10;
            System.out.println(num);
            num /= 10;

        }while (num > 0);


    }

    /* This method prompts the user to enter a number.
     * It then makes a call to methods getDigitCount
     * and printDigits using the number entered by
     * the user as a parameter for both.
     */
    public void manager()
    {
        Scanner keyboard = new Scanner(System.in);
        int number = 0;

        System.out.print("Enter number -->");
        number = keyboard.nextInt();

        System.out.println();
        System.out.println("Digit Count = " + getDigitCount(number));
        System.out.println();
        System.out.println("Digits");
        System.out.println("------");
        printDigits(number);
    }

    public static void main(String[] args)
    {
        Digits app = new Digits();
        app.manager();
    }
}
