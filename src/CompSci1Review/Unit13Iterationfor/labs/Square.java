package CompSci1Review.Unit13Iterationfor.labs;

import java.util.*;

public class Square
{
    private String word = "";   // string input by user

    /* This method prompts the user to enter a string. The user's
     * response is stored in the instance variable word.
     */
    public void readString()
    {
        System.out.print("Enter word -->");
        Scanner keyboard = new Scanner(System.in);
        word = keyboard.nextLine();
    }

    /* This method returns a string of spaces equal to the
     * length - 2.
     * @ return a string containing spaces
     * @ param length the number of spaces needed
     */
    public String getSpace(int length)
    {
       String sp = "";
      for (int i = 0; i < length; i++)
          sp += " ";


       return sp;
    }

    /* This method displays the instance variable word
     * in a square pattern.
     */
    public void printSquare()
    {
        System.out.println(word);
        int last = word.length()-1;
        for (int i = 0; i < word.length(); i++)
        {
            System.out.println(word.substring(i, i + 1) + getSpace(word.length()) + word.charAt(word.length() - i - 1));

        }

        System.out.println(word);

    }

    public static void main(String[] args)
    {
        Square app = new Square();
        app.readString();
        app.printSquare();
    }
}

