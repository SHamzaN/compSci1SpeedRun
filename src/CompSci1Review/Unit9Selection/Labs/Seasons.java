package CompSci1Review.Unit9Selection.Labs;

import java.util.Scanner;

public class Seasons
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a Season --> ");
        String season = keyboard.nextLine();
        System.out.println();

        if (season.equalsIgnoreCase("winter"))
        {
            System.out.println("Season: " + season);
            System.out.println("  Meteorological:");
            System.out.println("    December 20 - March 20");
            System.out.println(" Astronomical:");
            System.out.println("    Winter Solstice - Vernal Equinox");
        }

        else if (season.equalsIgnoreCase("spring"))
        {
            System.out.println("Season: " + season);
            System.out.println("  Meteorological:");
            System.out.println("    March 20 - June 21");
            System.out.println("  Astronomical:");
            System.out.println("    Vernal Equinox - Summer Solstice");
        }
        else if (season.equalsIgnoreCase("summer"))
        {
            System.out.println("Season: " + season);
            System.out.println("  Meteorological:");
            System.out.println("    June 21 - September 22");
            System.out.println("  Astronomical:");
            System.out.println("    Summer Solstice - Autumnal  Equinox");
        }
        else if (season.equalsIgnoreCase("fall"))
        {
            System.out.println("Season: " + season);
            System.out.println("  Meteorological:");
            System.out.println("    September 22 - November 30");
            System.out.println("  Astronomical:");
            System.out.println("    Autumnal Equinox - Winter Solstice ");
        }
    }
}
