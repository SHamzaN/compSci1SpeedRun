package CompSci1Review.Unit16ClassDecomposition;

public class Encapsulation
{
    /*
    Encapsulation
In the last lesson we learned that encapsulation is the process of combining variables and methods in a single package called a class.
Another aspect of encapsulation is the principle of information hiding.
With information hiding objects hide their data (instance variables) from other classes by allowing access to the data only through the methods defined within the class.
Encapsulation therefore guarantees the integrity of the data contained in the object by controlling how the data is accessed and modified.
     */

    /*
    Benefits of Encapsulation
It simplifies the interaction between objects.
Allows a class to hide the internal details of how an object does something.
A class can change its internal implementation without hurting the overall functionality of the system.
Prevents code (data) from accidental corruption due to programming errors.
     */

    /*
    Visibility Modifiers
In Java, we create object encapsulation using visibility modifiers. They control whether other classes can "see" what's "inside" an object.
The reserved words public and private are visibility modifiers that can be applied to the variables and methods of a class.
If a member of a class has public visibility, it can be "seen" (read and perhaps changed) from outside the object.
If a member of a class has private visibility, it can be used anywhere inside but not outside the class definition.
     */

    /*
    public class Die
{
    // variable declarations (instance variables)
    private int faceValue;

    // method declarations
    public void roll()
    {
        faceValue = (int)(Math.random() * 6) + 1;
    }

    public int getFaceValue()
    {
        return faceValue;
    }
}
     */

    /*
    Public variables let code outside the class reach in and read or change the value of the data.
    This violates the encapsulation principle.
    Therefore instance data should be defined with private visibility.
     */

    /*
    These methods are sometimes called service methods. A private method cannot be invoked from outside the class.
    The only purpose of a private method is to help the other methods of the class do their job.
    Therefore they are sometimes called support methods.
     */

    /*
    Constants
Giving constants public visibility is generally considered acceptable because, although their values can be accessed directly, they cannot be changed.
That is because constants are declared using the final modifier.
     */
}
