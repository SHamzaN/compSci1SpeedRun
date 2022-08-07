package CompSci1Review.Unit10JavaMethods2;

public class Parameters
{
    /*
    Parameter
A parameter or argument is a value that is passed to a method so that the method can use that value in its processing.
A parameter is located inside the parentheses that follow a method name.
Ex int num = Math.sqrt(16);
                       16 is the parameter
     */

    /*
    A parameter can be a literal value.

Math.sqrt(81)
Math.round(76.9)
str.equals("exit")
     */

    /*
    A parameter can be a variable.

Math.sqrt(num)
Math.round(average)
str.equals(lastName)
     */

    /*
    A parameter can be a mathematical expression.

Math.sqrt(20 + 50 + 11)
Math.round((grade1 + grade2 + grade) / 3)
     */

    /*
    A parameter can be a call to another method.

Math.round(Math.sqrt(35))
Math.max(num3, Math.max(num1, num2))
     */

    /*
    A method can have 0, 1, or more parameters. Multiple parameters are separated by commas.

Math.pow(10, 2)
Math.max(num1, num2)
str.substring(0, str.length()/2)
     */

    /*
    Writing a Method with Parameters
To add parameters to your own method definitions you simply declare one or more variables in the parentheses that follow the method name.
These variable declarations need to include a data type and an identifier name.
     */

    //Parameter Scope
    //The scope of a parameter is limited to the method it is declared in.

    /*
    There are two types of parameters: formal parameters and actual parameters or arguments.
    The parameters in the header of the method declaration are called formal parameters.
    The values passed into a method are called actual parameters or arguments.
     */

    /*
    Helper Methods
A helper method is a method that helps another method perform its task.
These are typically used when a method has to perform a complicated task that is composed of several smaller tasks.
The smaller tasks are often performed by helper methods.
     */
    public double average(int gr1, int gr2, int gr3)
    {
        return (gr1 + gr2 + gr3) / 3.0;
    }

    public void printInfo(String name, int age)
    {
        System.out.println("My name is " + name + " and I am " + age + " years old");
    }

    public double area(double length, double width)
    {
        return length * width;
    }

    public int minimum(int num1, int num2) // formal
    {
        if(num1 < num2)
            return num1;
        else
            return num2;
    }
    public static void main(String[] args)
    {
        Parameters demo = new Parameters();
        System.out.println(demo.average(85,97,76)); // actual
    }
}
