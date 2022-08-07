package CompSci1Review.Unit17ClassSpecialMethods;

public class toStringMethod
{
    /*
    toString Method
There is another special method often defined by classes called the toString method.
     */

    /*
    Look at the Student class again. A toString method has been included.

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

   public String toString()
   {
      String str="";
      str = "Name:          " + name + "\n" +       // "\n" denotes a newline
            "SixWeeks 1:    " + sixWeeks1 + "\n" +
            "SixWeeks 2:    " + sixWeeks2 + "\n" +
            "SixWeeks 3:    " + sixWeeks3 + "\n" +
            "Semester Exam: " + exam + "\n";
      return str;
   }
}
The purpose of the toString method is provide clients an easy way to print the contents of the instance variables of objects defined within the client program.
It can also be used to print other information within an object such as the results of method calls.

The toString method of an object is activated by enclosing the object name within a print or println statement, as shown below.

Student student = new Student("Abe Lincoln", 90, 95, 100, 87);

System.out.println(student);
     */

    /*
    toString Implementation
Any class can include a toString method in its implementation. The method must use the following format or signature.

public String toString()
{

}
Within the body of the method a string is defined and returned to the print or println method of the client.
 The string is often built using a series of concatenation operators (+) so that the string can include more than one variable.
 Labels are often included within the string to make the output more clear.
 The escape sequence \n is also used to embed new line characters (carriage returns) within the string so that the output can be displayed on multiple lines.

public String toString()
{
      String str="";
      str = "Name:          " + name + "\n" +       // "\n" denotes a newline
            "SixWeeks 1:    " + sixWeeks1 + "\n" +
            "SixWeeks 2:    " + sixWeeks2 + "\n" +
            "SixWeeks 3:    " + sixWeeks3 + "\n" +
            "Semester Exam: " + exam;
      return str;
}
Here is another version of the toString method that does not declared a local String variable, instead it builds the string on the return line.

public String toString()
{
     return "Name:          " + name + "\n" +
            "SixWeeks 1:    " + sixWeeks1 + "\n" +
            "SixWeeks 2:    " + sixWeeks2 + "\n" +
            "SixWeeks 3:    " + sixWeeks3 + "\n" +
            "Semester Exam: " + exam;
}
Here is a third version of the toString method that uses methods to retrieve the values for the string.

public String toString()
{
     return "Name:          " + getName() + "\n" +
            "SixWeeks 1:    " + getSixWeeks1() + "\n" +
            "SixWeeks 2:    " + getSixWeeks2() + "\n" +
            "SixWeeks 3:    " + getSixWeeks3() + "\n" +
            "Semester Exam: " + getExam();
}
     */
}
