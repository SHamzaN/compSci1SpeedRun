package CompSci1Review.Unit8JavaMethods;

import java.util.*;

public class SlopeCalculator
{
    private Scanner keyboard = new Scanner(System.in);
    private double slope = 0;
    private int x1 = 0;
    private int y1 = 0;
    private int x2 = 0;
    private int y2 = 0;


    // Precondition: none
    // Postcondition: values of two points have been
    //     retrieved from keyboard
    public void getPoints()
    {
        System.out.println("/********************/");
        System.out.println("     getPoints");
        System.out.println("/********************/");
        System.out.println();

        System.out.print("Enter x1 --> ");
        x1 = keyboard.nextInt();

        System.out.print("Enter y1 --> ");
        y1 = keyboard.nextInt();

        System.out.print("Enter x2 --> ");
        x2 = keyboard.nextInt();

        System.out.print("Enter y2 --> ");
        y2 = keyboard.nextInt();
    }

    // Precondition: none
    // Postcondition: slope has been calculated
    public void calculateSlope()
    {
        System.out.println();
        System.out.println("/********************/");
        System.out.println("   calculateSlope");
        System.out.println("/********************/");
        System.out.println();

        slope = (double)(y2 - y1) / (x2 - x1);
    }

    // Precondition: none
    // Postcondition: displayed slope
    public void printResults()
    {
        System.out.println();
        System.out.println("/********************/");
        System.out.println("    printResults");
        System.out.println("/********************/");
        System.out.println();

        System.out.print("Slope of points ("+ x1 + "," + y1 + ") and (" );
        System.out.println(x2 + "," + y2 + ") is " + slope);
    }

    public static void main(String[] args)
    {
        SlopeCalculator app = new SlopeCalculator();
        app.getPoints();
        app.calculateSlope();
        app.printResults();
    }
}

