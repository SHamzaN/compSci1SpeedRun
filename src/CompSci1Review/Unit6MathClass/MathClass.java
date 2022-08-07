package CompSci1Review.Unit6MathClass;

public class MathClass
{
    public static void main(String[] args)
    {
        //The next Java standard class we will look at is the Math class which provides a range of common mathematical methods.
        /*

Method	What It Does
int abs(int x)	returns the absolute value of integer x
double abs(double x)	returns the absolute value of a double x
int max(int a, int b)	returns the greater of a and b
int min(int a, int b)	returns the lesser of a and b
double pow(double base, double exponent)	returns the base raised to the exponent
double random()	returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0
long round(double x)	returns x rounded to the nearest whole number. (Note: return value must be cast to an int before assignment to an int variable)
double sqrt(double x)	returns the square root of x

         */
        /*
        Programming Note: Notice that two methods in the table are called abs.
        They are distinguished from each other by the fact that one takes an integer and the other takes a double parameter.
        Using the same name for two different methods is called method overloading.
         */

        int n = 0;
        double d = 0;
        n = Math.abs(-17);          // n = 17
        d = Math.abs(-39.65);       // d = 39.65
        d = Math.pow(10, 3);        // d = 1000.0
        n = (int)Math.round(3.52);  // n = 4
        n = Math.max(25, 50);       // n = 50
        n = Math.min(25, 50);       // n = 25
        d = Math.sqrt(81);          // d = 9.0
        System.out.println(Math.sqrt(25));      // Math is a class

        /*
        random Method
        One implementation of Java's random number generator is the random method in the Math class.
        This method creates random floating point values greater than or equal to 0 and less than 1 (0 <= n < 1).
        However, this range can be modified through casting, multiplication, division, subtraction, and addition.

         */
        double r1 = Math.random();
        System.out.println("Random 1  (0 <= r1 < 1)      = " + r1);

        int r2 = (int)(Math.random() * 10);
        System.out.println("Random 2  (0 <= r2 < 10)     = " + r2);

        int r3 = (int)(Math.random() * 50);
        System.out.println("Random 3  (0 <= r3 < 50)     = " + r3);

        int r4 = (int)(Math.random() * 10) + 5;
        System.out.println("Random 4  (5 <= r4 < 15)     = " + r4);

        int r5 = (int)(Math.random() * 1000) + 500;
        System.out.println("Random 5  (500 <= r5 < 1500) = " + r5);

        double r6 = (int)(Math.random() * 10) / 10.0;
        System.out.println("Random 6  ( 0 <= r6 < 1)     = " + r6);// displayed to a 10th
    }
}
