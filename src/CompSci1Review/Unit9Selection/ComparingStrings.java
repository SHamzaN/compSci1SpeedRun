package CompSci1Review.Unit9Selection;

public class ComparingStrings
{
    /*
    equals Method
In Java, strings are not primitive data; they are objects. Only primitive data can test relationships using the relational operators (==, !=, <, <=, >, >=).
 To test the relationship between objects requires the use of methods.
For example, to test whether two strings are equal to each other, you must use the String class's equals method.
     */

    /*
    equalsIgnoreCase Method
    To ignore the letter case, use the equalsIgnoreCase method.
     */

    /*
compareTo Method
    If two strings are not identical to each other, you still may want to know the relationship between them.
    The compareTo method compares strings in dictionary order
     */
    public static void main(String[] args)
    {
        String color = "red";
        if(color.equals("red"))   // use equals method to test for string equality
        {
            System.out.println("The color is red");
        }

        String color1 = "blue";
        String color2 = "blue";
        if(color1 == color2)
        {
            System.out.println("The colors are the same");
        }
        else
        {
            System.out.println("The colors are different");
        }

        String color3 = "blue";
        String color4 = new String("blue");
        if(color3 == color4)
        {
            System.out.println("The colors are the same");
        }
        else
        {
            System.out.println("The colors are different");
        }

//        if(str1.equalsIgnoreCase(str2))
//        {
//            // body
//        }

       // str1.compareTo(str2) < 0
       // str1.compareTo(str2) > 0
        //str1.compareTo(str2) == 0

        String s1 = "apple";
        String s2 = "orange";

        if(s1.compareTo(s2) < 0)
        {
            System.out.println(s1 + " is less than " + s2);
        }
        else
        {
            System.out.println(s2 + " is less than " + s1);
        }
    }
}
