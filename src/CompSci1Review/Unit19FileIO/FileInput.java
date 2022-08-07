package CompSci1Review.Unit19FileIO;

public class FileInput
{
    /*
    Scanner Class
We have used the Scanner class to read user input from the keyboard.
The Scanner class can also be used to read input from a file on an external storage device such as a hard disk or flash drive.
Conveniently the same methods used to retrieve information from the keyboard can also be used to retrieve information from a file.
Here is a list of the Scanner methods we have used with some additional methods that are more commonly used when reading from a file:


Method
Example
Description
int nextInt()	int n = scan.nextInt();	Returns the next token as an int. If the next token is not an integer, InputMismatchException is thrown.
double nextDouble()	double n = scan.nextDouble();	Returns the next token as a long. If the next token is not a float or is out of range, InputMismatchException is thrown.
String next()	String s = scan.next();	Finds and returns the next complete token from this scanner and returns it as a string; a token is usually ended by whitespace such as a blank or line break. If a token does not exist, NoSuchElementException is thrown.
String nextLine()	String s = scan.nextLine();	Returns the rest of the current line, excluding any line separator at the end.
boolean hasNextInt()	if(scan.hasNextInt())	Returns true if the next token in the scanner can be interpreted as an int value.
boolean hasNextDouble()	if(scan.hasNextDouble())	Returns true if the next token in the scanner can be interpreted as a double value.
boolean hasNextLine()	while(scan.hasNextLine())	Returns true if the scanner has another line in its input; false otherwise.
boolean hasNext()	while(scan.hasNext())	Returns true if the scanner has another token in its input.
     */

    /*
    What is a Token
A token is a series of characters that ends with whitespace. Whitespace includes one of the following: a blank space, a tab character, a carriage return, or an end of the file marker.
The scanner looks for these tokens when it is reading from the input data and is able to segregate them from each other.
As an example, if we read a line that has a series of numbers separated by blanks (whitespace), the scanner will read each number as a separate token.
     */

    /*
    Reading from a File
To read information from a file you will need to do the following

1) Step 1 - Import the Scanner and File classes
import java.util.*;  // needed for Scanner
import java.io.*;    // needed for File and FileNotFoundException

2) Step 2 - Instantiate a Scanner Object for File Input
Scanner scan = new Scanner(new File("myFile.txt"));
Inorder to read from a file you must first tell the Scanner object where the file is located.
This is done by creating a File object and including the name of the file as a parameter.
In the example above, the file is named "myFile.txt".
Since the Scanner class only reads text files the file extension .txt is often used as the file's extension name.
 Another common extension is .dat.

The data file must be located in the same folder as the class file of the program that is reading the file.
If you want the file to be in another folder you can include a path in the filename:
new File("c:\myFolder\myFile.txt");

3) Step 3 - Include Error Checking
One of the main differences between reading from the keyboard and reading from a file is that when you read from a file you must include error checking or what Java refers to as Exception Handling.
 When reading from a file there is the possiblility that the file being read does not exist, is not located in the designated folder, or has been corrupted and cannot be read.
These situations are referred to as exceptions and they must be handled or dealt with in your program or you will get a compiling error.

FileNotFoundException
When reading from a file the Scanner class throws a FileNotFoundException if the file to be read from does not exist.
Your program must handle this exception in one of two ways.
The first method is to place the Scanner code within a try/catch block.
The try-catch block is used to trap run-time errors so that you can deal with them instead allowing the program to terminate.
The second method (the one we will be using) is to place the following code on the line that includes your main method declaration:

public static void main(String[] args) throws IOException
This code tells the compiler that you are not going to deal with the exception yourself, but instead are going to pass it up one level to the method that invoked your method.
In the case of the main method, we are passing the exception to the JVM itself so that it can handle an error if it occurs.
The JVM is then responsible for handling the error and displaying an error message if the specified file could not be read.

4) Step 4 - Use the Scanner methods to Read from the File
If you have done the first three steps correctly then your program is now ready to read the information from the designated file.
The method used to retrieve the information depends upon how the data is going to be used in your program.
If the data being read is needed to perform a calculation or do some type of arithmetic then you will need to read the information as an integer or double; otherwise, the information can simply be read as a string or strings.
     */

    /*
    Integer Input Examples
Method 1 - Read individual Input

This method is used when the file contains a small number of integer values. They are read one at a time just like if you were reading from the keyboard.

int n1 = scan.nextInt();   // reads 1st integer from file
int n2 = scan.nextInt();   // reads 2nd integer from file
int n3 = scan.nextInt();   // reads 3rd integer from file
int n4 = scan.nextInt();   // reads 4th integer from file
int n5 = scan.nextInt();   // reads 5th integer from file

Method 2 – Read all Input

This method is used when file contains a large number of integer values or the actually number of values is not known.
The hasNextInt method returns true as long as there is an integer value in the file that has not been read.
The hasNextInt method is combined with a while loop to read the entire file one integer at a time.

int n=0;
while(scan.hasNextInt())   // reads all the integers from the file
{
   n = scan.nextInt();
}

Double Input Examples
Method 1 - Read individual Input

Scanner scan = new Scanner(new File("myFile.txt"));
double d1 = scan.nextDouble();   // reads a double from file
double d2 = scan.nextDouble();
double d3 = scan.nextDouble();
double d4 = scan.nextDouble();
double d5 = scan.nextDouble();

Method 2 – Read all Input

double d=0;
while(scan.hasNextDouble())   // reads all the doubles from file
{
   d = scan.nextDouble();
}

String Input Examples
Method 1 - Read individual Input

This method is used when you need to a small number of strings that are separated by either spaces or carriage returns (<EOLN> end-of-line markers).

Scanner scan = new Scanner(new File("myFile.txt"));
String s1 = scan.next();   // reads one string from file
String s2 = scan.next();
String s3 = scan.next();
String s4 = scan.next();
String s5 = scan.next();

String Input Examples
Method 1 - Read individual Input

This method is used when you need to a small number of strings that are separated by either spaces or carriage returns (<EOLN> end-of-line markers).

Scanner scan = new Scanner(new File("myFile.txt"));
String s1 = scan.next();   // reads one string from file
String s2 = scan.next();
String s3 = scan.next();
String s4 = scan.next();
String s5 = scan.next();

Method 3– Read all Input Lines

This method is different from method 2 in that it reads an entire line as one string. It disguises the strings by end-of-line marker only.

String s;
while(scan.hasNextLine())
{
   s = scan.nextLine();
}
     */

}
