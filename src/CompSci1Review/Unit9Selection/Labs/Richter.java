package CompSci1Review.Unit9Selection.Labs;

import java.util.Scanner;

public class Richter
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a magnitude on the Richter scale ==>> ");
        double magnitude = keyboard.nextDouble();

        System.out.println();
        if (magnitude >= 8.0)
        {
            System.out.println("Damage = Most structures fall");
        }
        else if (magnitude >= 7.0)
        {
            System.out.println("Damage = Most buildings destroyed");
        }
        else if (magnitude >= 6.0)
        {
            System.out.println("Damage = Many buildings considerably damaged; some collapse");
        }
        else if (magnitude >= 4.5)
        {
            System.out.println("Damage = Damage to poorly constructed buildings");
        }
        else if (magnitude >= 3.5)
        {
            System.out.println("Damage = Felt by many people, no destruction");
        }
        else if (magnitude >= 0)
        {
            System.out.println("Damage = Generally not felt by people");
        }
        else
            System.out.println("This number is not valid.");
    }
}
