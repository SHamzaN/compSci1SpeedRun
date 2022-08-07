package CompSci1Review.Unit19FileIO;

public class FileOutputExample
{
    /*
    Sample - Write Words
/* This program allows a user to enter words from the keyboard and stores
 * them in an array. When the user is done entering the words they are saved
 * to a data file. If the user runs the program again the words are read from
 * the datafile into the array. The user is then able to add new words to the list.
 */

    /*
    import java.util.*;
import java.io.*;

public class FileOutput
{
    private Scanner scan;
    private PrintWriter writer;
    private File dataFile;

    private String[] words = new String[100];
    private int numWords;

     /* This method attempts to open datafile for reading. If the file exists
     * it reads all of the words and stores them in an array. If the file
     * does not exist it uses PrintWriter to create the file.
     */

    /*
     public void readFile()
    {
       dataFile = new File("names.txt");  // name of datafile

        /* Open the datafile for reading if it exists. If it does not
        * exist use PrintWriter to create the file.
        */

    /*
        try
       {
            scan = new Scanner(dataFile);       // open file for reading

            numWords = scan.nextInt();          // read number of words in list
            scan.nextLine();                    // dummy read
            for(int i = 0; i < numWords; i++)   // read words store in array
            {
                words[i] = scan.nextLine();
            }
            scan.close();                       // close datafile
       }
       catch(IOException e)      // file did not exist so create it
       {
           try
           {
              writer = new PrintWriter(dataFile);   // create datafile
           }
           catch(IOException ex)
           {
               System.out.println("File cannot be created!");
           }
           writer.close();
       }
    }

     /* This method allows the user to enter words until the delimeter -1
     * is typed. The words entered are added to the array.
     */

    /*
     public void enterNames()
    {
        Scanner keyboard = new Scanner(System.in);
        String str = "";

        printNames();

        System.out.println("Enter names (Type -1 to stop)");
        while(!str.equals("-1"))
        {
            str = keyboard.nextLine();
            if(!str.equals("-1"))
            {
                words[numWords] = str;
                numWords++;              // increment arrays logical size
            }
        }
    }

     /* This method displays all the words in the array.*/
    /*
      public void printNames()
    {
        for(int i = 0; i < numWords; i++)
        {
            System.out.println(words[i]);
        }
        System.out.println();
    }

    /* This method writes the integer value that represents the number of
     * words currently in the array(logical size) to the file. It then writes
	 * all of the words to the file with each word on a separate line.
     */

    /*
    public void writeFile()
    {
        try
        {
           writer = new PrintWriter(dataFile);  // open file for writing
        }
        catch(IOException e)
        {
           System.out.println("File cannot be created!");
        }

        writer.println(numWords);             // write number of words in array
        for(int i = 0; i < numWords; i++)     // write words
        {
            writer.println(words[i]);
        }
        writer.flush();                       // flush buffer
        writer.close();                       // close datafile
    }


    public static void main(String[] args)
    {
        FileOutput app = new FileOutput();

        app.readFile();
        app.enterNames();
        app.writeFile();
    }
}

     */

}
