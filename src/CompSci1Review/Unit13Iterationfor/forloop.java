package CompSci1Review.Unit13Iterationfor;

public class forloop
{
    /*
    for Statement
Counter-controlled loops are used so frequently that many programming languages (including Java) include a special statement to make them easy to write.
It is called the for statement, and it combines counter intialization, condition test, and counter update into a single expression.
     */

    /*
    for (initialize counter; test counter; update counter)
{
   statement;
   statement;
}

 for (initialize counter; test counter; update counter)
   statement;
     */

    /*
     for (initialize counter; test counter; update counter)
   statement;
     */

    /*
    Example 1
This for statement counts from 0 to 9. Notice that the loop control variable's name is i.
By convention, many programmers name the loop control variable of a for loop i or j. i is short for increment.

for(int i = 0; i < 10; i ++)
{
   System.out.print(i + " ");
}
     */

    /*
    In this example the counter variable is declared as part of the for loop, therefore its scope is the for loop.
    It is a local variable of the for block and only exists within that block.
    Attempting to use the variable outside the for loop would cause a compiling error.
     */

    /*
    Example 3
The loop control variable (counter) does not have to be declared inside the for loop. This example declares the counter variable before the for loop.
int i = 0;
for(i = 10; i >= 0; i --)
{
   System.out.print(i + " ");
}
     */

    /*
    Example 4
A counter variable can be incremented by something other than one. In the following example the counter is incremented by 10.

for(int i = 0; i < 100; i += 10)
{
   System.out.print(i + " ");
}

for(int i = 0; i < 100; i = i + 10)
{
   System.out.print(i + " ");
}
     */
}
