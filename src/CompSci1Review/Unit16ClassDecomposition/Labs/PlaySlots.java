package CompSci1Review.Unit16ClassDecomposition.Labs;

import java.util.Scanner;

public class PlaySlots
{
    public static void main(String[] args)
    {
        SlotMachine slotMachine = new SlotMachine();
        Scanner keyboard = new Scanner(System.in);

        int selection = 0;

        do
        {
            System.out.print("1. Pull Lever 2. Quit -->");
            selection = keyboard.nextInt();

            if (selection == 1)
            {
                slotMachine.pullLever();
                slotMachine.displayRollers();
                slotMachine.displayResults();


            }

            if (slotMachine.getCash() == 0)
            {
                System.out.println("Go home you are broke!");
            }

        }while (selection < 2);


    }
}
