package CompSci1Review.Unit7StringClass.Labs;

import java.util.Scanner;

public class FullName
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter first name--> ");
        String firstName = keyboard.nextLine();
        System.out.print("Enter last name--> ");
        String lastName = keyboard.nextLine();

        System.out.println("\n" + lastName + ", " + firstName);
    }
}
