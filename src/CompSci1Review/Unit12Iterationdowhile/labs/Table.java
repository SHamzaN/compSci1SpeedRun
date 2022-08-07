package CompSci1Review.Unit12Iterationdowhile.labs;

import java.util.*;

public class Table
{
    private Scanner keyboard = new Scanner(System.in);

    /* This method prompts the user to input an integer value which
     * represents the number of rows in a table.
     * @ return number of rows entered by the user
     */
    public int inputNumRows()
    {
        System.out.print("Enter number of rows --> ");
        int input = keyboard.nextInt();
        return input;
    }

    /* This method displays a table of values from 1 up to the value
     * of parameter rows. On each row of the table the method
     * displays the product of 10 times the row number, the product of 100
     * times the row number, and the product of 1000 times the row
     * number.
     * @param rows the number of rows in the table
     */
    public void displayTable(int rows)
    {
        System.out.println("\n  N  10*N   100*N   1000*N");
        System.out.println("----------------------------");
         int counter = 1;
        do
        {
            System.out.println("  " + counter + "   " + counter * 10 + "     " + counter * 100 + "     " + counter * 1000);
            counter++;
        }while (counter <= rows);
    }

    public static void main(String[] args)
    {
        Table app = new Table();
        app.displayTable(app.inputNumRows());
    }
}
