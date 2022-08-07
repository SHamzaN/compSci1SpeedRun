package CompSci1Review.Unit19FileIO;

public class FileOutput
{
    /*
    PrintWriter
Java provides a class named PrintWriter that can be used to write data to a file.

Here is a list of the commonly used methods.

Method	Example	Description
print	writer.print(num);	Writes the variable num to the file.
println	writer.println(str);	Writes the variable str to the file then terminates the line(adds newline marker to the file).
flush	writer.flush();	Empties the stream buffer. This causes any data left in stream buffer to be written to the file.
close	writer.close();	Closes the stream and releases any system resources associated with it.

import java.io.*;  // Step 1: import PrintWriter

public class PrintWriterDemo1
{
    private PrintWriter writer;   // Step 2: declare PrintWriter variable

    public PrintWriterDemo1()
    {
        // Step 3: Need try-catch block to trap I/O errors
        try
        {
            // Step 4: instantiate PrinterWriter object; parameter is
                        //             a File object which includes the name of data file
            writer = new PrintWriter(new File("outFile.dat"));
        }
        catch(IOException e)
        {
            System.out.println("File I/O Error");
        }

        // Step 5: write data to file using println method
        writer.println("John Wayne");
        writer.println("216 South 2nd Street");
        writer.println("Winterset, Iowa");

        System.out.println("Data written to file ...");
        writer.flush();   // Step 6: flush stream buffer
        writer.close();   // Step 7: close PrintWriter

        // *** Note ***
        // If file does not exist it will be created
        // If file does exist data will be erased before new data is add
    }

    public static void main(String[] args)
    {
        new PrintWriterDemo1();
    }
}

Let's look at each step used to write the data to a file.

Step 1 - import PrintWriter class
import java.io.*;
Step 2 - declare PrintWriter object variable
private PrintWriter writer;
Step 3 - use try-catch block to trap I/O errors
try
{

}
catch(IOException e)
{
   System.out.println("File I/O Error");
}
The try-catch block allows you to deal with run-time errors that occur instead of allowing the computer to terminate your program.
In the try section you place code that could possible cause a run-time error (Ex. file cannot be created).
If an error does occur in the try section then your program will then execute the catch section.
The parameter of the catch section is an object that contains details about the type of error that occurred.
Typically in the catch section you include code that displays a message on the screen notifying the user that an error occurred.

Step 4 - Instantiate PrinterWriter object
writer = new PrintWriter(new File("outFile.dat"));
When instantiating a PrintWriter object you include a File object that takes as a parameter the name of the data file.
This code must be placed inside the try section of a try-catch block.

Step 5 - Write the data to the file
writer.println("John Wayne");
writer.println("216 South 2nd Street");
writer.println("Winterset, Iowa");
Write the data to the file using one of the PrintWriter methods.

Step 6 - Flush the output stream buffer
writer.flush();
Data that is to written to a file is not sent directly to the file, instead the data is sent to a temporary memory location called a buffer.
The buffer then sends the data to the file in larger chunks.
This makes writing to the file more efficient sents the program does not have to access the file as often.

The flush method empties the buffer sending any data remaining on the buffer to the file. This method should always be called before you close the stream.

Step 7 - Close the PrintWriter
writer.close();
This method closes the stream and releases any system resources associated with it (Ex. destroys the buffer).


     */
}
