package CompSci1Review.Unit8JavaMethods;

import java.util.Scanner;

public class VariableScope
{
     private int a = 1; // variable a is declared at the top of the class
    //Variable a is the scope of the entire class which means its scope is global
    //These variables are usually private
    //They are also called instance variables
    private int sum;
    private Scanner scan;
     public void scopeMethod1()
     {
         int b = 2;//variables declared in methods are called local variables
         //They are also temporary
         if(a < b)
         {
             int c = a + b; //Variable c is also temporary
         }

     }

     public void scopeMethod2()
     {
         int d = a;
     }

    public void method1()
    {
        int sum  = 0;

        sum += 5;
    }
    public static void main(String[] args)
    {
        /*
        Variable Scope
Variable scope identifies which parts of a program can see or use a variable.
A variable exists from the point in a program where it is declared to the end of the block that contains the declaration.
         */
        int num = 25;    // initialized with a value of 25
/*

Data Type	Default Value
int	0
long	0
double	0.0
boolean	false
 */
        String str = "";      // initialized to the empty string

    }
}
