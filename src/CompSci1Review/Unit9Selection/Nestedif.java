package CompSci1Review.Unit9Selection;

public class Nestedif
{

    /*
    Nested if
The statement executed as the result of an if statement could be another if statement.
This situation is called a nested if.
It lets us make another decision after getting the results of a previous decision.
     */
    public static void main(String[] args)
    {
        int num1 = 20;
        int num2 = 15;
        int num3 = 37;
        int min = 0;

        if(num1 < num2)
        {
            if(num1 < num3)
                min = num1;
            else
                min = num3;
        }
        else
        {
            if(num2 < num3)
                min = num2;
            else
                min = num3;
        }

//        if(temp > 100)
//            System.out.println("It is very hot");
//        else if(temp > 90)
//            System.out.println("It is hot");
//        else if(temp > 80)
//            System.out.println("It is very warm");
//        else if(temp > 70)
//            System.out.println("It is warm");
//        else if(temp > 60)
//            System.out.println("It is cool");
//        else if(temp > 50)
//            System.out.println("It is very cool");
//        else if(temp > 40)
//            System.out.println("It is cold");
//        else if(temp > 30)
//            System.out.println("It is very cold");
//        else
//            System.out.println("It is freezing");
    }
}
