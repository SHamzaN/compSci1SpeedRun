package CompSci1Review.Unit4Operators;

public class SampleProgram
{
    public static void main(String[] args)
    {
        // declare and initialize variables
        int num1 = 20;
        int num2 = 5;
        int num3 = 2;
        int result1 = 0;
        int result2 = 0;
        int result3 = 0;
        int result4 = 0;

        // do calculations
        result1 = num1 + num2 + num3;
        result2 = num1 * num2 / num3;
        result3 = (num1 + num3) / 11;
        result4 = (num1 - num2) * num3;

        // print results
        System.out.println("Result 1 = " + result1);
        System.out.println("Result 2 = " + result2);
        System.out.println("Result 3 = " + result3);
        System.out.println("Result 4 = " + result4);

        //Remainder Operator(%)
        //Java also has another arithmetic operation: the remainder operator (%) also called the modulus operator.
        // The remainder operator returns the remainder after dividing the second operand into the first

        //Division Operator(/)
        //As you might expect, if either or both operands to any numeric operator are floating point values, the result is a floating point value.
        // However, the division operator produces results that are somewhat more complicated.
        // If both operands are integers, the / operator performs integer division, meaning that any fractional part of the result is discarded.
        // If one or the other or both operands are floating point values, the / operator performs floating point division, and the fractional part of the result is kept

        /*
        1() grouping not applicable
        2 *  multiplication
          /  division            left to right
          %  remainder

        3 + addition
          - subtraction         left to right

        4 = assignment right to left

         */
    }
}


