package CompSci1Review.Unit15Arrays;

public class TraversingArrays
{
  /*
  Looping Through An Array (Traversing)
The real benefit of using an array becomes apparent when you use a looping structure, such as a for loop, to access the individual elements within the array.
As an example, suppose we want to create an int array of size 20 and fill each element of the array with a random number in the range of 0 to 99.
We could do the following

int[] nums = new int[20];       // declare and define int array of size 20

nums[0] = (int)(Math.random() * 100);    // assign random values
nums[1] = (int)(Math.random() * 100);
nums[2] = (int)(Math.random() * 100);
nums[3] = (int)(Math.random() * 100);
nums[4] = (int)(Math.random() * 100);
nums[5] = (int)(Math.random() * 100);
nums[6] = (int)(Math.random() * 100);
nums[7] = (int)(Math.random() * 100);
nums[8] = (int)(Math.random() * 100);
nums[9] = (int)(Math.random() * 100);
nums[10] = (int)(Math.random() * 100);
nums[11] = (int)(Math.random() * 100);
nums[12] = (int)(Math.random() * 100);
nums[13] = (int)(Math.random() * 100);
nums[14] = (int)(Math.random() * 100);
nums[15] = (int)(Math.random() * 100);
nums[16] = (int)(Math.random() * 100);
nums[17] = (int)(Math.random() * 100);
nums[18] = (int)(Math.random() * 100);
nums[19] = (int)(Math.random() * 100);

A much better approach would be to use a loop to iterate through all the elements of the array.

int[] nums = new int[20];                // declare and define int array size 20

for(int i = 0; i < 20; i++)
{
   nums[i] = (int)(Math.random()*100);   // assign random values
}
   */

    /*
    The for loop executes 20 times counting from 0 to 19.
    By using the loop control variable, i, as the index into the array we are able to iterate through the entire array one element at a time.

To output the contents of the array we can again use a for loop

for(int i = 0; i< 20; i++)
{
   System.out.println(nums[i]);
}
     */

    /*
    Array Length
Look at the following program segment which creates a double array of size 50, assigns random values to each element of the array, and then calculates the average of the random values.

double[] samples = new double[50];              // An array of 50 double values

for(int i=0; i < 50; i++)
   samples[i] = (int)(Math.random()* 100 + 1);  // generate random values

double average = 0.0;
for(int i=0; i < 50; i++)
  average += samples[i];                        // sum all the elements

average /=50;

The portion of the code above that calculates the average has been updated below to reflect the use of the length variable.

double average = 0.0;
for(int i=0; i < samples.length; i++)
  average += samples[i];                 // sum all the elements

average /=samples.length;

     */

    /*
    Note: the String class has a method named length() that returns the number of characters in the string. Contrast this with the array that uses a variable named length that contains the size of the array.

String method
--------------
int len = str.length();          // call method

array variable
-------------
int len = myArray.length;      // access variableNote: the String class has a method named length() that returns the number of characters in the string. Contrast this with the array that uses a variable named length that contains the size of the array.

String method
--------------
int len = str.length();          // call method

array variable
-------------
int len = myArray.length;      // access variable
     */
}
