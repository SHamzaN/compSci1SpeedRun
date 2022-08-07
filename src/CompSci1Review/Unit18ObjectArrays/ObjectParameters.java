package CompSci1Review.Unit18ObjectArrays;

public class ObjectParameters
{
    /*
    Parameters of Primitive Types
When passing variables of primitive types Java uses a technique called pass-by-value.
     */

    /*
    Object Parameters
When passing variables of object types Java uses a technique called pass-by-reference.

The following illustration demonstrates pass-by-reference.
     */

    /*
    When using pass-by-reference a variable that is passed as a parameter to a method cannot be assigned a reference to a different object.

Look at the following example.
public class Test
{
   private int num;

   public void setNum(int n)
   {
      num = n;
   }

   public int getNum()
   {
      return num;
   }
}

public class Demo
{
    public void method1()
    {
       Test obj1 = new Test();

       method2(obj1);
       System.out.println(obj1.getNum());
    }

    public void method2(Test obj2)
    {
       Test obj3 = new Test();
       obj3.setNum(75);

       obj2 = obj3;

       System.out.println(obj2.getNum());
    }

    public static void main(String[] args)
    {
        Demo app = new Demo();
        app.method1();
    }
}

In method2 a second Test object is instantiated and its reference is assigned to the variable obj3.
Using a mutator method the instance variable num of the Test object is assigned a value of 75.
On the next line obj2's reference is changed to point to the object assigned to obj3.
On the next line the num variable of the object referenced by obj2 is displayed.
Notice from the output that 75 is displayed.
This demonstrates that the formal parameter obj2 can be changed to reference a different object.

In method1, after execution returns back from method2, the num variable of the object referenced by obj1 is displayed. Notice from the output that 0 is displayed.
This demonstrates that the reference change made to obj2 in method2 had no affect on obj1.
obj1 still references the same object.
     */

 /*
 Summary
The instance variables of an object passed as a parameter can be modified in a calling method.
The object that an actual parameter references cannot be changed in a calling method.
  */
}
