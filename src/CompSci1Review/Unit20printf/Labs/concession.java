package CompSci1Review.Unit20printf.Labs;

import java.util.*;

public class concession
{
    private int burgers = 0;
    private int hotdogs = 0;
    private int chips = 0;
    private int candy = 0;
    private int drinks = 0;

    private double burgersTotal = 0;
    private double hotdogsTotal = 0;
    private double chipsTotal = 0;
    private double candyTotal = 0;
    private double drinksTotal = 0;
    private double grandTotal = 0;

    /* This method prompts the user to enter in the number of
     * items sold for each food type.
     */
    public void enterPurchases()
    {
        System.out.println("       Purchases\n" +
                "------------------------");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("burgers -->");
      burgers =  keyboard.nextInt();
        System.out.print("hot dogs -->");
         hotdogs = keyboard.nextInt();
        System.out.print("chips -->");
        chips = keyboard.nextInt();
        System.out.print("candy -->");
         candy = keyboard.nextInt();
        System.out.print("drinks -->");
       drinks = keyboard.nextInt();


    }

    /* This method calculates the total amount purchased for
     * each food type. It also calculates the total cost of
     * all the food purchase.
     */
    public void calculateTotals()
    {
        burgersTotal += burgers * 2;
        hotdogsTotal += hotdogs * 1.50;
        chipsTotal += chips * .50;
        candyTotal += candy;
        drinksTotal += drinks;
        grandTotal += burgersTotal + hotdogsTotal + chipsTotal + candyTotal + drinksTotal;

    }

    /* This method prints a receipt showing the totals for
     * food type purchased along with the total cost of all
     * the food.
     */
    public void printReceipt()
    {
        System.out.println("\n         Receipt");
        System.out.println("------------------------");
        if(burgers >= 1)
        {
            System.out.format("burgers         %.2f" , burgersTotal);
        }
         if(hotdogs >= 1)
        {
            System.out.printf("\nhotdogs         %.2f", hotdogsTotal);
        }
         if(chips >= 1)
        {
            System.out.format("\nchips           %.2f" , chipsTotal);
        }
         if(candy >= 1)
        {
            System.out.printf("\ncandy           %.2f" , candyTotal);
        }
         if(drinks >= 1)
        {
            System.out.format("\ndrinks          %.2f" ,drinksTotal);
        }

             System.out.println("\n------------------------");
             System.out.printf("grand total    %.2f" ,grandTotal);


    }

    public static void main(String[] args)
    {
        concession app = new concession();
        app.enterPurchases();
        app.calculateTotals();
        app.printReceipt();
    }
}