package CompSci1Review.Unit18ObjectArrays.Labs;

public class Book
{
    // instance variables
    private String studentName;
    private String bookNumber;
    // constructors
    public Book(String sN, String bN)
    {
        studentName = sN;
        bookNumber = bN;
    }
    // accessor methods

    public String getStudentName()
    {
        return studentName;
    }

    public String getBookNumber()
    {
        return bookNumber;
    }

    // toString method
     public String toString()
     {
         return "Student Name = " + studentName +
                 "\nBook Number = " + bookNumber +
                 "\n";
     }
}
