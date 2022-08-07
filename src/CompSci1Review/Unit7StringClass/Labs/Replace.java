package CompSci1Review.Unit7StringClass.Labs;

import java.util.Scanner;
public class Replace
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a string --> ");
        String word = keyboard.nextLine();

        int index = word.indexOf('a');

        System.out.println("\n" );
        System.out.println(word.substring(0,index) + '*' + word.substring(index + 1) );
    }
}
