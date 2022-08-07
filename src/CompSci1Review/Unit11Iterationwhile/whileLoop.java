package CompSci1Review.Unit11Iterationwhile;

import java.util.Scanner;

public class whileLoop
{
    /*
    Java while Statement
Java also has a while statement that follows the same structure as the Jeroo while loop.
However, the condition of the Java while loop is not restricted to using only sensor methods which makes it much more versatile.

Java while loops can be classified into two categories: counter-controlled loops and sentinel-controlled loops.
     */

    /*
    Counter-Controlled Loop
A counter-controlled loop is a loop that repeats a predetermined number of times.
The condition of this type of loop is controlled by a counter variable.
 A counter is a variable that keeps count of the number of times a loop is executed.
Look at the following illustration which demonstrates a counter-controlled loop.
     */

    /*
    Sentinel-Controlled Loop
A sentinel-controlled loop is a loop that executes an undetermined number of times.
To stop the loop, a user enters a value, called a sentinel, which causes the loop's condition to become false.
     */

    //Infinite Loop
    //A common mistake that beginner programmers make with counter-controlled loops is they forget to increment the counter variable within the body of the while loop.
    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);

        int cntr = 0;//loop control variable
        //controls how many times the while loop executes
        //Also referred to as counter variable
        while(cntr < 5)
        {
            System.out.print(cntr + " ");
            cntr++;
        }

        //That was a Counter-Controlled Loop

        //A sentinel is a value that controls when a loop stops execution.
        //In this example the value is stop
        System.out.println();
        String str = "";
        while(!str.equals("stop"))
        {
            str = keyboard.nextLine();
        }

        //That was a Sentinel-Controlled Loop

        int cntr1 = 0;
        while(cntr1 < 100)
        {
            System.out.println("Hello");
           cntr1++;
        }

        //That was an infinite loop

        int count = 1;
        int sum = 0;
        while (count <= 10)
        {
            sum += count;
            count++;
        }
        System.out.println(sum);


        System.out.println();
        int cntr2 = 0;
        while(cntr2 < 100)
        {
            System.out.print(cntr2 + " ");
            cntr2 += 10;
        }

        System.out.println();
        int grade = -1;
        while(grade < 0 || grade > 100)
        {
            System.out.print("Enter grade --> ");
            grade = keyboard.nextInt();
        }
    }
}
