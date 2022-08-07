package CompSci1Review.Unit18ObjectArrays;

public class ArrayParameters
{
    /*
    Array Parameters
Arrays can be passed as parameters to other methods. The arrays are passed using pass-by-reference.

public class Demo
{
    public void method1()
    {
       int[] nums = {10,20,30,40,50};

       method2(nums);
       printArray(nums);
    }

    public void method2(int[] nums2)
    {
       printArray(nums2);
       nums2[0] = 500;
       printArray(nums2);
    }

    public void printArray(int[] array)
    {
        for(int i=0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Demo app = new Demo();
        app.method1();
    }
}

An array is defined in method1 using an initializer list. The array is then passed as a parameter to method2.
 In method2 the array is passed to another method named printArray so that the contents of the array can be displayed.
 Also in method2 index [0] of the array is changed to 500.

The output demonstrates that the array is passed using pass-by-reference.
 When the array is printed in method1 the change made to index [0] is displayed.
     */
}
