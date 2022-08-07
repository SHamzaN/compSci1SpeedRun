package CompSci1Review.Unit19FileIO.Labs;
import java.util.*;  // needed for Scanner
import java.io.*;    // needed for File
public class ReadInts
{
    //CompScience-One-Review
    public static void main(String[] args) throws IOException
    {
        int num = 0;
        Scanner scan = new Scanner(new File("Integers.txt"));
        int count = 0;
        int sum = 0;
        while(scan.hasNextInt())
        {
            num = scan.nextInt();
            System.out.print(num + " ");
            count++;
            sum += num;

        }

        System.out.println("\n");

        System.out.println("Count = " + count);
        System.out.println("Sum = " + sum);
    }
}
