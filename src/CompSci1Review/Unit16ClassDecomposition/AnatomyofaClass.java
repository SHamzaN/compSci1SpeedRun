package CompSci1Review.Unit16ClassDecomposition;

public class AnatomyofaClass
{
 /*
 Anatomy of a Class
A class describes two characteristics of an object.
First it describes what data an object stores, known as an object's attributes.
In Java, these attributes are defined through one or more instance variables.
 Secondly, it describes what an object does, known as an object's behavior.
 In Java, this behavior is defined through one or more methods.
The process of combining data and behavior into a single class is called encapsulation.
  */

    /*
    public class Die
{
    // instance variables
    private int faceValue;

    // methods
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
    public class RollDice
{
    public static void main(String[] args)
    {
        Die die1 = new Die();
        Die die2 = new Die();

        for(int i=1; i <= 10; i++)
        {
            die1.roll();
            die2.roll();

            System.out.print(die1.getFaceValue() + " ");
            System.out.println(die2.getFaceValue());
        }
    }
}
     */

    /*
    Communication Between Classes
In multi-class programs each class has a specific job to do in helping solve the problem.
It is often necessary for these classes to communicate with each other.
This communication occurs using a two step process.
First one of the classes must initiate the communication by creating an object of another class and storing its reference in an object variable.
     */

    /*
    Association
In OOP terminology this relationship between two classes, where one class uses another, is called Association.
     */

    /*
    Aggregation
The term Aggregation is used to describe a special type of an association.
Aggregation is the relationship between two classes where an object of one class has an object of another.
 Unlike association, aggregation always implies a direction.
     */

    /*
    Aggregation is a "has a" relationship. The school has a principal. The team has a coach. The dog has a tail.
     */
}
