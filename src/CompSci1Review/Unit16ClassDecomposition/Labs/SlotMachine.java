package CompSci1Review.Unit16ClassDecomposition.Labs;

public class SlotMachine
{
    // constants
    public final int CHERRIES = 0;
    public final int APPLE = 1;
    public final int ORANGE = 2;
    public final int LEMON = 3;
    public final int BANANA = 4;

    // instance variables
    private int roller1;
    private int roller2;
    private int roller3;
    private int cash = 50;     // $50 is the amount of money you start with

    // methods
    /* This method randomly selects a fruit for each of the three rollers.
     */
    public void pullLever()
    {
         int random = (int) ((Math.random() * 4) + 1);
        int random1 = (int) ((Math.random() * 4) + 1);
        int random2 = (int) ((Math.random() * 4) + 1);

        roller1 = random;
        roller2 = random1;
        roller3 = random2;
    }

    /* This method displays the type of fruit contained in each roller.
     */
    public void displayRollers()
    {
           if (roller1 == CHERRIES)
           {
               System.out.print("Cherries ");
           }
           else if (roller1 == APPLE)
           {
               System.out.print("Apple ");
           }
           else if (roller1 == ORANGE)
           {
               System.out.print("Orange ");
           }
           else if (roller1 == LEMON)
           {
               System.out.print("Lemon ");
           }
           else if (roller1 == BANANA)
           {
               System.out.print("Banana ");
           }

            if (roller2 == CHERRIES)
           {
               System.out.print("Cherries ");
           }
            else if (roller2 == APPLE)
            {
                System.out.print("Apple ");
            }
            else if (roller2 == ORANGE)
            {
                System.out.print("Orange ");
            }
            else if (roller2 == LEMON)
            {
                System.out.print("Lemon ");
            }
            else if (roller2 == BANANA)
            {
                System.out.print("Banana ");
            }

        if (roller3 == CHERRIES)
        {
            System.out.print("Cherries ");
        }
        else if (roller3 == APPLE)
        {
            System.out.print("Apple ");
        }
        else if (roller3 == ORANGE)
        {
            System.out.print("Orange ");
        }
        else if (roller3 == LEMON)
        {
            System.out.print("Lemon ");
        }
        else if (roller3 == BANANA)
        {
            System.out.print("Banana ");
        }

    }
    /* This method determines the amount of pay off when there is a winner
     * @ return the amount of payoff
     */
    private int getPayOff()
    {
        int random = (int) (Math.random() * 10);

        if (random >= 0 && random < 6)
        {
            return (int) (Math.random() * 11) + 1;
        }

        else if (random >= 6 && random < 9)
        {
            return (int) (Math.random() * 101) + 11;
        }
     else
     return  1000;
    }

    /* This method displays the results of pulling the lever.
     */
    public void displayResults()
    {
        cash -= 1;
        if (roller1 != roller2 && roller2 != roller3)
        {
            System.out.println("No winner. Please try again.");
            System.out.println("cash = $" + cash);
            System.out.println("\n---------------------------------------\n");
        }
       else if (roller1 == roller2 && roller2 == roller3)
        {
            System.out.println("""
                    \n************************
                             Winner
                    ************************""");
            System.out.println("\nYou won $" + getPayOff());
            int cash = getCash() + getPayOff();
            System.out.println("cash = $" + cash);
            System.out.println("\n---------------------------------------'\n");
        }
    }

    // returns the amount of cash you current have
    public int getCash()
    {
        return cash;
    }
}
