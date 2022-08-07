package CompSci1Review.Unit15Arrays.Labs;

import java.util.*;

public class Reverse
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
       int [] nums = new int[20];

        System.out.println("Enter 20 integers.");
        for(int i = 0; i < 20; i++)
        {
            System.out.print("Num " + (i + 1) + " --> ");
            nums[i] = keyboard.nextInt();
        }
        System.out.println();

        for (int i = 0; i < nums.length; i++)
        {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\n");

        for (int i = nums.length-1; i >= 0 ; i--)
        {
            System.out.print(nums[i] + " ");
        }
    }
}