package CompSci1Review.Unit15Arrays;

public class LogicalSize
{
 /*
 Logical Size vs Physical Size
When creating (instantiating) an array you are required to give it a size.
 This size value represents the physical size of the array.
 The physical size is the total number of elements(cells) in the array.

 Note: Once an array is instantiated, its physical size cannot be changed.
  */

    /*
    Sometimes when you use an array in a program you don't know exactly how big the array needs to be.
    Since you are required to give an array a size, you simply make it big enough so that it will always have enough room to meet the needs of the program.
    For example, if you needed an array to store the names of students who showed up for after school tutorials you might declare an array like the following

String[] tutorials = new String[100];   // 100 is the physical size of the array

Since you don't know how many students will actually attend the tutorials you make the array size 100 knowing that this many students will never attend.
The array's size is bigger than the maximum number of students who are projected to attend tutorials, therefore the array will always have enough room to meet the needs of the program.

In our example, since you are not going to use all 100 elements of the array you need to be able to keep track of how many names are actually added to the array.
This can be done by creating a counter variable. Look at example again. It has been modified to included a counter variable.

String[] tutorials = new String[100];   // 100 is the physical size of the array
int numStudents = 0;

String[] tutorials = new String[100];   // 100 is the physical size of the array
int numStudents = 0;                    // counter - logical size of the array
The counter variable numStudents job is to keep track of how many students are added to the array.
This counter variable represents the logical size of the array.
The logical size of an array is the current number of elements in the array that are occupied.
For example, if twelve students showed up for tutorials the numStudents variable would contain the value 12. The logical size of the array is 12.
The physical size of the array is 100.
     */


}
