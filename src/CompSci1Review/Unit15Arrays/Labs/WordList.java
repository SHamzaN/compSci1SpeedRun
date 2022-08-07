package CompSci1Review.Unit15Arrays.Labs;

import java.util.*;

public class WordList
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
      String words[] = new String[10];

//        words[0] = keyboard.nextLine();
//        words[1] = keyboard.nextLine();
//        words[2] = keyboard.nextLine();
//        words[3] = keyboard.nextLine();
//        words[4] = keyboard.nextLine();
//        words[5] = keyboard.nextLine();
//        words[6] = keyboard.nextLine();
//        words[7] = keyboard.nextLine();
//        words[8] = keyboard.nextLine();
//        words[9] = keyboard.nextLine();

        System.out.println("Enter 10 words:");
        for(int i = 0; i < 10; i++)
        {
            words[i] = keyboard.nextLine();

        }
        System.out.println();

        for (int i = 0; i < words.length; i++)
        {
            System.out.println(words[i]);
        }
    }
}