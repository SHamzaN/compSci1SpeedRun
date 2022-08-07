package CompSci1Review.Unit4Operators;

public class MoreOperators
{

    public static void main(String[] args)
    {
        //Increment Operator (++): adds 1 to any integer or floating point value.
        //Ex
        int count = 5;
        count++;       // increases count by 1

        //Decrement Operator (--): subtracts 1 from any integer or floating point value
        //Ex
        int count1 = 5;
        count1--;       // decreases count by 1

        //Compound Assignment Operators
        //Several assignment operators in Java combine a basic operation with assignment. For example, the += operator can be used as follows:
        //Ex
        int total = 10;
        total += 5;           // increases total by 5
        //The right-hand side of the assignment operator can be a full expression.
        // The expression on the right-hand side of the operator is evaluated,
        // then that result is added to the current value of the variable on the left-hand side,
        // and that value is stored in the variable.
        //total += (sum - 12) / count; is also total = total + ((sum - 12) / count);

    }
}
