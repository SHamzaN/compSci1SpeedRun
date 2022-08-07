package CompSci1Review.Unit14NestedLoops;

public class nested
{
    /*
    Nested Loops
When a loop is located inside the body of another loop it is said to be nested within another loop.
When you "nest" two loops, the outer loop takes control of the number of complete repetitions of the inner loop.
While all types of loops may be nested, the most commonly nested loops are for loops.
     */

    /*
    for(int r = 0; r < 10; r++)      // outer loop
{
   for(int c = 0; c < 10; c++)   // inner loop
   {

   }
}
     */

    /*
    When working with nested loops, the outer loop changes only after the inner loop is completely finished.
     */

    /*
    Example 2
A factorial of an integer, n, is the product of all the integers from 1 to n. It is written as n!. For example,

5! = 1 x 2 x 3 x 4 x 5 = 120
8! = 1 x 2 x 3 x 4 x 5 x 6 x 7 x 8 = 40320


     */

    public static class Factorial
    {
        public static void main(String[] args)
        {
            long limit = 20;
            long factorial = 1;

            // Loop from 1 to the value of limit
            for(int i =1; i <= limit; i++)                  // outer loop
            {
                factorial = 1;
                for(int factor = 2; factor <= i; factor++)  //  inner loop
                {
                    factorial *= factor;
                }
                System.out.println(i + "!" + " is " + factorial);
            }
        }
    }
}
