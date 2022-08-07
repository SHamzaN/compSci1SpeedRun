package CompSci1Review.Unit11Iterationwhile.Labs;

import java.util.*;

public class ExamScores
{
    // instance variables
    private int score = 0;    // used to store the current score entered by user
    private int a = 0;        // count of the number of a's
    private int b = 0;        // count of the number of b's
    private int c = 0;        // count of the number of c's
    private int d = 0;        // count of the number of d's
    private int f = 0;        // count of the number of f's
    private Scanner keyboard = new Scanner(System.in);


    /* This method allows a user to enter scores until the sentinel value -1
       is encountered. As scores are being entered it tallies the
       number of As, Bs, Cs, Ds, and Fs and stores the values in the instance
       variables a, b, c, d, f.
     */
    public void inputAndTally()
    {
        System.out.println("Enter scores. Type -1 to stop.");

      int count = 0;
        while (!(score == -1))
        {
            score = keyboard.nextInt();

            if (score >= 90 && score <= 100)
            {
                a++;
            }
            else if (score >= 80 && score <= 89)
            {
                b++;
            }
            else if (score >= 70 && score <= 79)
            {
                c++;
            }
            else if (score >= 60 && score <= 69)
            {
                d++;
            }
            else if (score >= 0 && score <= 59)
            {
                f++;
            }
            count++;
        }
      score = count;

    }

    /* This method calculates the total number of scores input by the user
    /*   by summing the tally variables a,b,c,d,f.
    /* @return total number of scores entered
     */
    public int getTotalScores()
    {
        System.out.println("Total number of grades = " + score);
        System.out.println("Number of A's = " + a);
        System.out.println("Number of B's = " + b);
        System.out.println("Number of C's = " + c);
        System.out.println("Number of D's = " + d);
        System.out.println("Number of F's = " + f);

       return score;

    }

    /* Prints a summary report including the total number of scores
       entered and the tallies of the As, Bs, Cs, Ds, and Fs.
     */
    public void printSummary()
    {
        System.out.println();
        System.out.println("============================");
        System.out.println("       Summary Report");
        System.out.println("============================");
       getTotalScores();
    }

    public static void main(String[] args)
    {
        ExamScores app = new ExamScores();
        app.inputAndTally();
        app.printSummary();
    }
}
