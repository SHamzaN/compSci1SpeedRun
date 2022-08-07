package CompSci1Review.Unit19FileIO.Labs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

public class RandomStates
{
    static String[] states = new String[50];
    static int numStates;
    public static void main(String[] args) throws IOException
    {
        Scanner keyboard = new Scanner (System.in);
        Scanner scan = new Scanner(new File("States.txt"));
        while (scan.hasNextLine() == true) {

            states[numStates] = scan.nextLine();
            System.out.println(states[numStates]);
            numStates++;
        }
        while(true)
        {
            String randState = states[(int)(Math.random() * 50)];
            System.out.println("\n" + randState);
            System.out.println("Press <Enter> to generate new random state -->");
            keyboard.nextLine();   // user must press <Enter> key to continue
        }
    }
}
