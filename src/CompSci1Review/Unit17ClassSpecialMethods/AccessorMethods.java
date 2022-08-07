package CompSci1Review.Unit17ClassSpecialMethods;

public class AccessorMethods
{
     /*
     Private Visibility
Instance variables in a class should be declared with the private visibility modifier as illustrated in the Student class shown below.
      */

    /*
    class Student
{
   // instance variables
   private  String name;     	// Student name
   private  int sixWeeks1;       // 1st 6 weeks avg
   private  int sixWeeks2;       // 2nd 6 weeks avg
   private  int sixWeeks3;       // 3rd 6 weeks avg
   private  int exam;            // semester exam
     */

    /*
    By declaring the variables as private client programs that create objects of the class are not allow to access the instance variables directly by using dot notation:

public static void main(String[] args)
{
   Student student = new Student();      // student object is instantiated

   student.name  = "George Washington";   // Error, this is not allow!
However, client programs often need the ability to see or even modify the contents of the instance variables of an object.
For this reason, classes are often designed with two special types of methods called accessor methods and mutator methods.
In this lesson we cover accessor methods.

Note: A client is a class that uses another class to help it solve a problem.
For example if a class named Classroom instaniates an object of a class named Student, then Classroom is a client of Student.
     */

    /*
    Accessor Methods
Methods defined in a class which allow clients to observe the value of instance variables are called accessor methods.
Recall, once again, that clients do not have direct access to instance variables since instance variables are usually defined with the private visibility modifier.
The only way clients can view the values of instance variables is if there are accessor methods which provide them with this information.

Look at the Student class again. Five accessor methods have been added.
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

     */

    /*
    The purpose of an accessor method is to allow a client "access" to an instance variable so it can see it's contents.

For example, the getName accessor method allows clients access to see the contents of the name instance variable, the getSixWeeks1 accessor method allows clients access to see the contents of the sixWeeks1 instance variable, and so forth.
Accessor methods only allow clients the ability to see variables contents; not modify them.
Accessor methods are declared with a return type that corresponds to the data type of the instance variable that is being accessed.
     */

    /*
    Note: A common practice is to define accessor methods with the word "get" in front of their name followed by the name of the instance variable they are accessing. (getName, getLength, getWidth, getScore, getTemperature, etc.)
Invoking Accessor Methods
The following code shows how accessor methods can be called from client code.

Student student1 = new Student("John Wayne", 100, 95, 88, 92);

System.out.println("Student Name    = " + student1.getName());
System.out.println("1st 6 Weeks Avg = " + student1.getSixWeeks1());
System.out.println("2nd 6 Weeks Avg = " + student1.getSixWeeks2());
System.out.println("3rd 6 Weeks Avg = " + student1.getSixWeeks3());
System.out.println("Semester Exam   = " + student1.getExam());
     */


}
