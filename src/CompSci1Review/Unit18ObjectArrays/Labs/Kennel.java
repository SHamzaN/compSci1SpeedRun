package CompSci1Review.Unit18ObjectArrays.Labs;

import java.util.*;

public class Kennel
{
    // instance variable
    private Dog[] dogs;     // declare array variable

    // constructor
    public Kennel()
    {
        dogs = new Dog[5];  // instantiate array with length 5
    }

    /* This method allows a user input information about 5 dogs and
     * stores this information in the array dogs.
     */
    public void addDogs()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("************************\n" +
                "*       addDogs        *\n" +
                "************************");
        for (int i = 0; i <= 4; i++)
        {
            System.out.print("Enter dog name -->");
            String name = keyboard.nextLine();
            System.out.print("Enter dog breed -->");
            String breed = keyboard.nextLine();
            System.out.println();
            dogs[i] = new Dog(name,breed);
        }

    }

    /* This method displays the name and breed for each Dog in the array.
     */
    public void printDogs()
    {
        System.out.print("\n" +
                "************************\n" +
                "*      printDogs       *\n" +
                "************************");

        for (int i = 0; i <= 4; i++)
        {
            System.out.print("\nDog name = " + dogs[i].getName());
            System.out.print("\nDog breed = " + dogs[i].getBreed());
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Kennel app = new Kennel();
        app.addDogs();
        app.printDogs();
    }
}
