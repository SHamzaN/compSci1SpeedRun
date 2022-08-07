package CompSci1Review.Unit12Iterationdowhile.labs;

import java.util.*;

public class RepeatMenu
{
    private Scanner keyboard = new Scanner(System.in);

    /* This method displays a menu and waits for the user to make a selection.
     * If the user's selection is not a valid number (not between 1 and 5)
     * the method displays the menu again and allows user to make another
     * selection. This process is repeated until a valid selection is made.
     * @ return the number selection made by the user.
     */
    public int displayMenu()
    {
        int selection = 0;
        System.out.println("      Menu");
        System.out.println("   ==========");
        System.out.println("1.  Dr. Pepper\n" +
                "2.  Coke\n" +
                "3.  Sprite\n" +
                "4.  7-UP\n" +
                "5.  Diet Coke");

        System.out.print("\nSelection: ");

        do
        {
            selection = keyboard.nextInt();
            System.out.println();
         if (!(selection <= 5 && selection >= 1))
         {
             System.out.println("      Menu");
             System.out.println("   ==========");
             System.out.println("1.  Dr. Pepper\n" +
                     "2.  Coke\n" +
                     "3.  Sprite\n" +
                     "4.  7-UP\n" +
                     "5.  Diet Coke");
             System.out.print("\nSelection ");
         }

        }while (!(selection <= 5 && selection >= 1));

        System.out.print("Selection " + selection);
        System.out.println();
         return selection;
    }

    /* This method makes a call to method displayMenu to get the user's
     * number selection. Once user's selection has been retrieved it
     * determines the name of the menu item selected and displays the
     * following message: "You have chosen (selection name)" where
     * selection name is the name of the menu item selected by the user.
     */
    public void printSelection()
    {
        int selection = displayMenu();
        if (selection == 1)
        {
            System.out.println("\nYou have chosen Dr.Pepper");
        }
        else if (selection == 2)
        {
            System.out.println("\nYou have chosen Coke");
        }
        else if (selection == 3)
        {
            System.out.println("\nYou have chosen Sprite");
        }
        else if (selection == 4)
        {
            System.out.println("\nYou have chosen 7-UP");
        }
        else if (selection == 5)
        {
            System.out.println("\nYou have chosen Diet Coke");
        }

    }

    public static void main(String[] args)
    {
        RepeatMenu app = new RepeatMenu();
        app.printSelection();
    }
}
