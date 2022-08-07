package CompSci1Review.Unit7StringClass;

public class StringConversion
{
    public static void main(String[] args)
    {
        /*
        Integer Class
It is sometimes necessary in your programs to convert a string to another type such as int or double.
Java provides a class named Integer that has methods for this purpose.
As an example, suppose you want to convert the string "35" to an integer.
         */

        String age = "35";
        int num = Integer.parseInt(age);  // the string stored in age is
        // converted to an integer value

        /*
        Double Class
The same conversion can be applied to doubles as well using the Double class's parseDouble method
         */

        String taxrate = "8.75";
        double num1 = Double.parseDouble(taxrate);  // the string stored in taxrate is
        // converted to a double


    }
}
