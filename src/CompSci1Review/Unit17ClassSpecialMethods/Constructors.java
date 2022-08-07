package CompSci1Review.Unit17ClassSpecialMethods;

public class Constructors
{
    /*
    Constructors
A constructor is a special method within a class that has the same name as the class.
The primary purpose of a constructor is to assign initial values to a class's instance variables.
     */
    /*
Notice that when defining a constructor you do not specify a return type.
     */

      /*
      Multiple Constructors
A class can have more than one constructor.
As an example, the Student class below has two constructors.
The first constructor has no parameters.
 The second constructor has five parameters.

Note: A constructor with no parameters is called the default constructor.
       */

    /*
    class Student
{
   // instance variables
   private String name;     	// Student name
   private int sixWeeks1;       // 1st 6 weeks avg
   private int sixWeeks2;       // 2nd 6 weeks avg
   private int sixWeeks3;       // 3rd 6 weeks avg
   private int exam;            // semester exam

   // constructors
   public Student()
   {
       name = "";           // initialize name to empty string
       sixWeeks1 = 0;       // initialize sixWeeks1 to 0
       sixWeeks2 = 0;       // initialize sixWeeks2 to 0
       sixWeeks3 = 0;       // initialize sixWeeks3 to 0
       exam = 0;            // initialize exam to 0
   }

   public Student(String n, int w1, int w2, int w3, int e)
   {
      name = n;            // initialize name to value in n
      sixWeeks1 = w1;      // initialize sixWeeks1 to value in w1
      sixWeeks2 = w2;      // initialize sixWeeks2 to value in w2
      sixWeeks3 = w3;      // initialize sixWeeks3 to value in w3
      exam = e;            // initialize exam to value in e
   }

   // other methods


     */

    /*
    Providing multiple constructors makes a class more flexible and easier to use.

When using multiple constructors, the parameter list of each constructor within a class must be unique.
Parameter lists must differ by either the number of parameters defined or the parameter type.
     */

    /*
    Invoking a Constructor
Constructors are invoked or called when you "construct" an object using the keyword new.
The code below instantiates three Student objects.
The first line of code uses the Student class's default constructor.
The second and third lines use the Student class's constructor that takes five parameters.
     */

    /*
    Student student1 = new Student();

Student student2 = new Student("Bob", 95, 87, 99, 92);

Student student3 = new Student(name, s1, s2, s3, e);
     */

    /*
    Automatic Constructor
If a class contains no constructors, the Java Virtual Machine(JVM) will automatically provide a default constructor behind the scenes.
 This constructor initializes numeric variables to zero and object variables to null.
If a class contains even one constructor, however, the Java Virtual Machine no longer provides a default constructor automatically.
     */

    /*
    If you don't set an instance variable explicitly in a constructor, it is automatically set to a default value: numbers are set to zero, booleans are set to false, and object references are set to null.
    But it is considered poor programming practice to rely on this.
    Certainly, it makes it harder for someone to understand your code if fields(instance variables) are being initialized invisibly.
     */
 /*
 A constructor has the same name as the class.
A constructor is called with the new operator.
A constructor does not have a return type.
A class can have more than one constructor.
A constructor may take zero, one, or more parameters.
If your class does not have a constructor, Java will provide a default constructor for you.
  */



}
