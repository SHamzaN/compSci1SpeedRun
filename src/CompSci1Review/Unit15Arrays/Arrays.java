package CompSci1Review.Unit15Arrays;

public class Arrays
{
  /*
  int[] tests = new int[20];   // declare and initialize an array
int sum = 0, avg = 0;

for(int i = 0; i < 20; i++)
{
   tests[i] = keyboard.nextInt();     // input test scores
   sum += tests[i];                   // sum test scores
}
avg = sum / 20;                       // compute class average
   */

    /*
    What is an Array
In computer science, a data structure is a group of data elements grouped together under one name.
Data structures are used for storing and organizing data so that it can be used efficiently.
The first data structure we will look at is called an array.

An array is a data structure that stores a collection of individual values that are of the same data type.
Arrays are useful because instead of having to separately store related information in different variables, you can store them - as a collection - in just one variable.
     */

    /*
    Declaring an Array
To declare an array variable you use the following format

int[] tests;    // Declare an integer array variable
First it must be understood that the array variable is not the array. It is only the place holder for the array. In the code above, the array has not yet been defined.
We will see in a moment that to create the array itself we must specify its type and how many elements it is to contain.
To declare an array variable you must include square brackets[] between the data type and variable name.
     */

    /*
    Defining an Array
Once you have declared an array variable, you can define an array that it will reference with code like the following

tests = new int[10];    // Define an array of 10 integers
This statement creates an array that will store 10 values of type int, and records a reference to the array in the variable tests.
The reference is simply where the array is in memory.
     */

    /*
    Initializing an Array
Just like with other variables you can both declare the variable and initialize the array with a single statement

The following illustration demonstrates how to declare and initialize an array.

Initializer List
An initializer list allows you to declare an array and assign values to each of its elements in a single statement. Look at the following example.

int[] array = {1, 3, 5, 7, 11, 13, 15};
The code creates an array of size 7 and assigns each of the elements the following values

Index
0
1
2
3
4
5
6
Element
1
3
5
7
11
13
17
Here is an example of a string array that uses an initializer list to assign values to each of its elements.

String[] flag = {"red", "white", "blue"};
The code creates an array of size 3 and assigns each of the elements the following values

Index
0
1
2
Element
"red"
"white"
"blue"

     */

    /*
    Common Error
A common error that programmers make when using arrays is an IndexOutOfBounds Exception.
This error occurs when you attempt to index an element of an array that does not exist.
Look at the following example.

int[] array = new int[3];
array[3] = 99;   // This line causes an IndexOutOfBounds Exception
In this code I declare an int array of size 3. I then attempt to assign a value to element 3 of the array which does not exist.
Remember the indexes of an array range from 0 up to the size of the array - 1.
In this example the range is [0-2].
 Therefore this code causes an error because I am attempting to use memory that is not assigned to me.
     */
}
