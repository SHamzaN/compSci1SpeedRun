package CompSci1Review.Unit19FileIO.Labs;
import java.util.*;  // needed for Scanner
import java.io.*;    // needed for File
public class Gettysburg
{
    public static void main(String[] args) throws IOException
    {
        String str = "";
        Scanner scan = new Scanner(new File("Gettysburg.txt"));

        while(scan.hasNext())
        {
            str = scan.next();
            System.out.print(str + " ");
        }
        System.out.println();

    }
}

