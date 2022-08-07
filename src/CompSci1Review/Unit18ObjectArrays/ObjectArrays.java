package CompSci1Review.Unit18ObjectArrays;

public class ObjectArrays
{
    /*
    Arrays can also be used to store objects of classes you define. To demonstrate this we are going to use the Die class implemented in a previous unit.
     */

    /*
    public class Die
{
    // instance variables
    private int faceValue;

    // constructor
    public Die()
    {
        faceValue = 1;
    }

    // accessor method
    public int getFaceValue()
    {
        return faceValue;
    }

    public void roll()
    {
        faceValue = (int)(Math.random() * 6) + 1;
    }
}
     */

    /*
    Yahtzee class
Below is a class named Yahtzee that simulates the rolling of six dice. It accomplishes this by storing each die in an array.

public class Yahtzee
{
    // instance variables
    private Die[] dice;

    // constructor
    public Yahtzee()
    {
       dice = new Die[5];   // initialize array and assign it to dice

       for(int i = 0; i < 5; i++)
       {
          dice[i] = new Die();  // instantiate 5 die objects and
                                // assign them to the array
       }
    }

    public void rollDice()
    {
       for(int i = 0; i < 5; i++)
       {
          Die die = dice[i];   // get reference of die object from
          die.roll();          // array and call method roll
       }
    }

    public void displayDice()
    {
       for(int i = 0; i < 5; i++)
       {
          Die die = dice[i];
          System.out.print(die.getFaceValue() + " ");
       }
       System.out.println();
    }

    public static void main(String[] args)
    {
       Yahtzee app = new Yahtzee();
       app.rollDice();
       app.displayDice();
    }
}
     */

    /*
    Instance Variable
An array object variable is declared with Die as its type. As you can see arrays can store user-defined types.

private  Die[] dice;

Constructor
The constructor starts by initializing the array with a length of 5 and it assigns its reference(memory location) to the variable dice.

dice = new Die[5];

The array elements do not contain Die objects yet so they are assigned a value of null. The keyword null is the default value for an object variable that does not contain an object.

Next the constructor instantiates 5 Die objects and stores their references in the array. Each Die object occupies a different array index.

for(int i = 0; i < 5; i++)
{
   dice[i] = new Die();
}

Each array element is assigned a Die object. The Die constructor initializes the variable faceValue with a value of 1.
     */

    /*
    rollDice Method
The rollDice method uses a for loop to access each Die object within the array.

In the for loop an array index is used to retrieve each Die object and store their reference in the local variable die.
Die die = dice[i];

The rollDice method then calls the roll method for the current Die object.

die.roll();

The roll method assigns a random value to the current Die object's faceValue variable. When the current object's variable changes its value is automatically updated in the array.

Using the for loop, it repeats this process for each Die object in the array.
     */

    /*
    displayDice Method
The displayDice method also uses a for loop to access each Die object within the array.

public void displayDice()
{
   for(int i = 0; i < 5; i++)
   {
      Die die = dice[i];
      System.out.print(die.getFaceValue() + " ");
   }
   System.out.println();
}
In the for loop an array index is used to retrieve each Die object and store their reference in the local variable die.
The faceValue of the Die object currently referenced in the variable die is displayed using the Die class's accessor method.
The for loop repeats this process for each Die object in the array.
     */

    /*
    Alternative Approach - rollDice and displayDice methods
Look at the modified version of the rollDice method.

public void rollDice()
{
   for(int i = 0; i < 5; i++)
   {
      dice[i].roll();
   }
}
The local Die variable is removed and the Die objects in the array are referenced directly. This style makes the local Die variable unnecessary.

This same style can be used in the displayDice method as well.

public void displayDice()
{
   for(int i = 0; i < 5; i++)
   {
      System.out.print(dice[i].getFaceValue() + " ");
   }
   System.out.println();
}
     */
}
