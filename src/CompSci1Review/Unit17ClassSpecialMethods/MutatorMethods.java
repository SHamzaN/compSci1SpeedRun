package CompSci1Review.Unit17ClassSpecialMethods;

public class MutatorMethods
{
    /*
    Mutator Methods
Methods in a class that allow clients to modify an object's instance variables are called mutator methods.
If the instance variables of a class are defined with the private visibility modifier, then clients who instantiate objects of this class do not have direct access to its instance variables(i.e. cannot use dot notation).
If you wish for clients to have the ability to change the value of a particular instance variable, then you must provide a mutator method for that variable in the class implementation.
     */

    /*
    Look at the Student class again. Five mutator methods have been added.

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

   // accessor methods
   public String getName()
   {
      return name;
   }

   public String getSixWeeks1()
   {
      return sixWeeks1;
   }

   public String getSixWeeks2()
   {
      return sixWeeks2;
   }

   public String getSixWeeks3()
   {
      return sixWeeks3;
   }

   public String getExam()
   {
      return exam;
   }

   // mutator methods
   public void setName(String n)
   {
      name = n;
   }

   public void setSixWeeks1(int s)
   {
      sixWeeks1 = s;
   }

   public void setSixWeeks2(int s)
   {
      sixWeeks2 = s;
   }

   public void setSixWeeks3(int s)
   {
      sixWeeks3 = s;
   }

   public void setExam(int e)
   {
      exam = e;
   }
As an example the following mutator method was defined for the class.

public void setName(String n)
{
   name = n;
}
This method, when called, will change the value of the name instance variable to the value specified by the parameter n.
The method allows clients to "mutate" or change the contents of the variable name.

It you don't want a client to have the ability to modify a particular instance varible don't provide a mutator method for that variable.

Mutator methods are defined with a return type of void since they do not return a value.

Note: A common practice, although not required, is to define mutator methods with the word "set" in front of their name followed by the name of the instance variable they are modifying. (setLength, setWidth, setScore, setName, setTemperature, etc.)
     */

    /*
    Invoking Mutator Methods
The following code shows how mutator methods can be called from client code.

Student student1 = new Student();

System.out.print("Enter Student Name -->");
String name = keyboard.nextLine();
student1.setName(name);

System.out.print("Enter 1st 6 Weeks Avg -->");
int s1 = keyboard.nextInt();
student1.setSixWeeks1(s1);

System.out.print("Enter 2nd 6 Weeks Avg -->");
int s2 = keyboard.nextInt();
student1.setSixWeeks2(s2);

System.out.print("Enter 3rd 6 Weeks Avg -->");
int s3 = keyboard.nextInt();
student1.setSixWeeks3(s3);

System.out.print("Enter Semester Exam -->");
int e = keyboard.nextInt();
student1.setExam(e);
     */
}
