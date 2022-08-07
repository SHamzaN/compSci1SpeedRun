package CompSci1Review.Unit10JavaMethods2;

public class MethodTypes
{
    /*
    Method Types
Recall that a method is simply a block of code that is given a name.
In Java, there are two types of methods that you can write.
These methods are identified by the type of task they perform.
     */

    /*
    In Java, methods that give you something back are called non-void methods.
    In Java, methods that do not give you something back are called void methods.
     */

    /*
    void Methods
Look at the definition of the void method printName.
 Assume two String variables, lastName and firstName, have been defined as instance variables.
     */

//    public void printName()
//    {
//        System.out.println("Lastname = " + lastName);
//        System.out.println("Firstname = " + firstName);
//    }

    /*
    Methods Called by Other Methods
Methods can be called by other methods.
     */

//    public void printName()
//    {
//        printLastName();
//        printFirstName();
//    }
//
//    public void printLastName()
//    {
//        System.out.println("Lastname = " + lastName);
//    }
//
//    public void printFirstName()
//    {
//        System.out.println("Firstname = " + firstName);
//    }

    /*
    A method can return a literal value.
    return 500;
return 98.6;
return "John Wayne";
return true;
     */

    /*
    A method can return the contents of a variable.

return average;
return name;
     */

    /*
    A method can return the result of a mathematical expression.

return 15 * 7 + 20;
return (num1 + num2) / 2;
     */

    /*
    A method can return the result of a boolean expression.

return num > num2;
return num != 0 && num < 1000;
return lastName.equals(name);
     */

    /*
    Calling non-void Methods
The way that a non-void method is called differs from the way that a void method is called in that the call is made from within other Java statements.
Since a non-void method always returns a value, this value has to be stored in a variable, printed, or returned to a Java control structure or another method.
     */

    /*
    Boolean Non-Void Methods
A common type of non-void method is a method that has a return type of boolean. Recall that a boolean value can only be either true or false.
     */

//    public boolean isBigger()
//    {
//        if(num1 > num2)
//            return true;
//        else
//            return false;
//    }

//    public boolean isBigger()
//    {
//        return (num1 > num2);
//    }

    /*
    Programming Note: methods that return a boolean value often have the word "is" placed in front of the method name.
    (Ex. isWater, isJeroo, isBigger)
     */

    /*
    Calling Boolean Non-Void Methods
Boolean non-void methods are called in the same way as other non-void methods.
Their return value needs to be stored in a variable, printed, or returned to a Java control structure or another method.
     */


    public static void main(String[] args)
    {
        MethodTypes app = new MethodTypes();
      //  app.printName();
    }

}
