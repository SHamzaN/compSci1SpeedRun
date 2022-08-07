package CompSci1Review.Unit19FileIO;

public class Serialization
{

    /*
    Serialize
Java provides a mechanism, called object serialization where an object can be represented as a sequence of bytes that includes the object's data as well as information about the object's type and the types of data stored in the object.

After a serialized object has been written into a file, it can be read from the file and deserialized that is, the type information and bytes that represent the object and its data can be used to recreate the object in memory.

The classes ObjectInputStream and ObjectOutputStream are high-level streams that contain the methods for serializing and deserializing an object.

The ObjectOutputStream class contains a method named writeObject that serializes an Object and sends it to the output stream.
Similarly, the ObjectInputStream class contains a method named readObject for deserializing an object.
This method retrieves the next Object out of the stream and deserializes it.
The return value is Object, so you will need to cast it to its appropriate data type.

To demonstrate how serialization works in Java, I am going to use two class. The first class named Student will contain information concerning a single student.
The second class named Classroom will maintain an ArrayList of Student objects.
In the program I use serialization to write each Student object in the ArrayList to a file.
After the data is saved to the file I use serialization again to read the data from the file and insert it back into the ArrayList

Student Class
import java.io.Serializable;

public class Student implements Serializable  // make class serializable
{
    private String firstName;
    private String lastName;
    private double average;

    public Student(String f, String l, double a)
    {
        firstName = f;
        lastName = l;
        average = a;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public double getAverage()
    {
        return average;
    }
}

Classroom Class
import java.util.*;
import java.io.*;

public class Classroom
{
    public static String FILENAME = "classroom.dat";  // name of data file
    private ArrayList<Student> students;

    public Classroom()
    {
        students = new ArrayList<Student>();

        // add some students
        students.add(new Student("John", "Wayne", 100));
        students.add(new Student("Stewart", "Jimmy", 92));
        students.add(new Student("Henry", "Fonda", 78));
    }

    public void save()
    {
        FileOutputStream fileID;
        ObjectOutputStream outFile;

        try
        {
            // Create the output stream
            fileID = new FileOutputStream(FILENAME);
            outFile   = new ObjectOutputStream(fileID);

            // Write the ArrayList to the file
            outFile.writeObject(students);

            // Close the file
            outFile.close();
        }
        catch (IOException e)
        {
            System.out.println("Error writing to data file: " + e.getMessage());
        }
    }

    public void load()
    {
        FileInputStream fileID;
        ObjectInputStream inFile;

        try
        {
            // Create a stream for reading in objects
            fileID = new FileInputStream(FILENAME);
            inFile  = new ObjectInputStream(fileID);

            // Read all the objects and put them in the ArrayList
            students = (ArrayList <Student>) inFile.readObject();

            // if students was an array the code would look like this
            // students = (Student[]) inFile.readObject();

            // Close the stream
            inFile.close();
        }
        catch(IOException e)
        {
            System.out.println("Error trying to open file: " + e.getMessage());
        }
        catch(ClassNotFoundException e)  // needed because of cast above
        {
            System.out.println("Error trying to open file: " + e.getMessage());
        }
    }

    public void print()
    {
        for(Student s : students)
        {
            System.out.println(s.getFirstName() + " " + s.getLastName());
            System.out.println(s.getAverage());
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Classroom app = new Classroom();
        app.save();
        app.load();
        app.print();
    }
}.
     */
}
