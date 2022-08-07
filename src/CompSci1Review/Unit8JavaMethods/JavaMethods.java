package CompSci1Review.Unit8JavaMethods;
import java.util.Scanner;
public class JavaMethods
{
    public static void main(String[] args)
    {
        //Java method ex
        /*
        keyboard.nextInt()
keyboard.nextDouble()
Math.sqrt(81)
Math.random()
str1.equals(str2)
str.length()
         */

        /*
        Create Java Methods
Creating a method in Java is similar to the process we used to create a method in Jeroo.
 To create a Java method, you must write a definition, which consists of a header and a body.
 The method header, which appears at the beginning of a method definition, lists several important things about the method, including the method's name.
The method body is a collection of statements that are performed when the method is executed.
         */

        //ex

    }

    public void readInteger()
    {
        Scanner keyboard = new Scanner(System.in);
        int num;
        System.out.println("Enter integer-->");
        num = keyboard.nextInt();
    }
    //public is the methods access modifier
    //An access modifier describes where the method can be seen and used
    //It can be public,private or protected

    //void describes a methods return type

    //readInteger is just the name of the method

    //Inside the curly braces {} is the methods body which consists of lines of code
}
