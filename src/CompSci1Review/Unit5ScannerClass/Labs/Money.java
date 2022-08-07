package CompSci1Review.Unit5ScannerClass.Labs;

import java.util.Scanner;

public class Money
{
        public static void main(String[] args)
        {
            int quarters = 0;      // number of quarters
            int dimes = 0;         // number of dimes
            int nickels = 0;       // number of nickels
            int pennies = 0;       // number of pennies
            int totalCents = 0;    // total cents collected
            int dollars = 0;       // dollar amount
            int cents = 0;         // cents amount

            Scanner keyboard = new Scanner(System.in);

            System.out.print("How many pennies do you have --> " );
            pennies = keyboard.nextInt();
            System.out.print("How many nickels do you have --> ");
            nickels = keyboard.nextInt();
            System.out.print("How many dimes do you have --> ");
            dimes = keyboard.nextInt();
            System.out.print("How many quarters do you have --> ");
            quarters = keyboard.nextInt();

            totalCents = quarters * 25 + dimes * 10 + nickels * 5 + pennies;
             dollars = totalCents / 100;
             cents = totalCents % 100;
            System.out.println();
            System.out.println("Total value = " + dollars + " dollars and " + cents + " cents");

        }

}
