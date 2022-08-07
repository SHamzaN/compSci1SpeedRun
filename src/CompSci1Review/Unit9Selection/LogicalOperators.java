package CompSci1Review.Unit9Selection;

public class LogicalOperators
{
    /*
    Logical Operators
    The logical operators introduced in Jeroo are also used in Java. The table below describes the three logical operators.

Operator	Description	Example	Result
!
NOT
!a
true if a is false and false if a is true
&&
AND
a && b
true if a and b are both true and false otherwise
||
OR
a || b
true if either a or b are true and false otherwise

     */

    /*
    NOT(!) Operator
The ! operator is used to perform the logical NOT operation, which is also called the logical complement. The logical complement of a boolean value gives its opposite value.
 That is, if a boolean variable called found has the value false, then !found is true.
Likewise, if found is true, then !found is false.
The logical NOT operation does not change the value stored in found.
     */

    /*
    AND(&&) Operator
The && operator performs a logical AND operation. The result is true if both operands are true, but false otherwise.
     */

    /*
    OR(||) Operator
The || operator performs a logical OR operation. The result is true if one or the other or both operands are true, but false otherwise.
     */

    /*
    Compound Logical Conditions
A condition can be formed using more than one logical operator.
     */

    /*
Truth Tables
A logical operation can be described by a truth table that lists all the combinations of values for the variables involved in an expression.
Because the logical NOT operator is unary, there are only two possible values for its one operand, true or false.
     */

    /*
    Truth Table for Logical NOT (!)
a	!a
false
true
true
false
Line 1 says when a is false !a is true.
     */

    /*
    Truth Table for Logical AND(&&) and Logical(| |)
a	b	a && b	a || b
false
false
false
false
false
true
false
true
true
false
false
true
true
true
true
true
Line 1 says when a and b are false (a && b) and (a || b) both evaluate to false.
     */

    /*
    Short-Circuit Evaluation
An important characteristic of the && and | | operators is that they are "short-circuited."
That is, if their left operand is enough to decide the boolean result of the operation, the right operand is not evaluated.
 This situation can occur with both operators but for different reasons.
If the left operand of the && operator is false, then the result of the operation will be false no matter what the value of the right operand is.
Likewise, if the left operand of the | | is true, then the result of the operation is true no matter what the value of the right operand is.
     */
    public static void main(String[] args)
    {
//        if(!str.equals("exit"))
//        {
//            System.out.println("We will continue.");
//        }


//        if(num1 > 0 && num2 > 0)
//        {
//            System.out.println("Both numbers are greater than zero");
//        }

//         String firstLetter = str.substring(0,1);
//
//if(firstLetter.equals("a") || firstLetter.equals("A"))
//{
//   System.out.println("The first letter is an a or A.");
//}

//        if(month == 3 || month == 4 || month == 5)
//        {
//            System.out.println("It is spring");
//        }

//        if(count != 0 && total / count > MAX)
//        {
//            System.out.println("Testing.");
//        }
    }
}
