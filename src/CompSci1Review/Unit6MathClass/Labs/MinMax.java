package CompSci1Review.Unit6MathClass.Labs;
import java.util.Scanner;
public class MinMax
{
    public static void main(String[] args)
    {
        int first = 0;
        int second  = 0;
        int third = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter 1st Integer -- > ");
        first = keyboard.nextInt();
        System.out.print("Enter 2nd Integer --> ");
        second = keyboard.nextInt();
        System.out.print("Enter 3rd Integer --> ");
        third = keyboard.nextInt();

        int min = Math.min(first,second);
        int min2 = Math.min(min,third);
        int max = Math.max(first,second);
        int max2 = Math.max(max,third);
        System.out.println("\n");
        System.out.println("Smallest = " + min2);
        System.out.println("Largest = " + max2);
    }
}
