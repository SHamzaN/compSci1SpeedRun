package CompSci1Review.Unit16ClassDecomposition.Labs;

public class PiggyBank
{
    // instance variables
    private int quarters;   // number of quarters
    private int dimes;      // number of dimes
    private int nickels;    // number of nickels
    private int pennies;    // number of pennies

    // methods
    // increases the number of quarters in the bank by one
    public void insertQuarter()
    {
      quarters += 1;
    }

    // increases the number of dimes in the bank by one
    public void insertDime()
    {
      dimes += 1;
    }

    // increases the number of nickels in the bank by one
    public void insertNickel()
    {
      nickels += 1;
    }

    // increases the number of pennies in the bank by one
    public void insertPenny()
    {
       pennies += 1;
    }

    /* This method returns the total number of cents in the piggy bank
     * @ return total cents in the bank
     */
    public int smashBank()
    {
        int totalCents = quarters * 25 + dimes * 10 + nickels * 5 + pennies;
     return totalCents;
    }
}