package CompSci1Review.Unit7StringClass;

public class StringClass
{
    public static void main(String[] args)
    {
        /*
        Strings are sequences of characters, such as "Hello" or "have a nice day". Java does not have a built-in string type.
        (Recall the eight primitive types: boolean, byte, char, double, float, long, int, short.)
        Instead, the standard Java library contains a predefined class called, naturally enough, String.
         String objects are unique in that there are two ways they can be created or instantiated.
         The first method uses the new operator and is the same technique used to instantiate other Java objects.
         */

        //Method 1 - Instantiating String Object
        String str = new String();   // instantiate String object
        str = "Good Morning";        // assign string value to String object
        System.out.println(str);
        System.out.println();
        //Method 2 - Instantiating String Object
        String str1;              // declare String object
        str1 = "Good Morning";    // assign string value to String object
        System.out.println(str1);

        //Method 3 - Instantiating String Object
        String str3 = "Good Morning";   // initialize String object with string value
        System.out.println(str3);

        /*
        Since the String class is used in most Java programs, the designers of Java decided to allow programmers the ability to instantiate String objects without having to use the new operator.
         However, it must be understood, that String is a class, not a primitive data type, therefore String objects can be sent messages.
        Below are a few examples of String methods that can be used to communicate with String objects:
         */
        str.length();
        str.substring(0,4);
        str.equals("married");
        str.indexOf(".");

        //Concatenation
        String firstName = "John";
        String lastName = "Wayne";
        String fullName = firstName + " " + lastName;

        int age = 13;
        String rating = "PG" + age;
        int answer = 128;
        System.out.println("The answer is " + answer);
      /*
      A substring is defined as a string that is part of a longer string.
       In Java, you can extract a substring from a larger string with the substring method of the String class.
       */
        String fruit = "watermelon";
        String s = fruit.substring(0,5);

        String fruit1 = "watermelon";
        String s1 = fruit1.substring(5,10);

        String fruit2 = "watermelon";
        String s2 = fruit2.substring(5);    // only need 1 parameter

        String fruit3 = "watermelon";
        String s3 = fruit3.substring(0,1);  // extracts 1st character

        /*
        String Editing
The String class provides a useful method named length that will tell you how many characters are in a string.
In Java terminology, you are retrieving the string's length.
         */

        /*
        Strings are Immutable
The String class provides no methods that let you change a character in an existing string.
If you want to turn fruit into "Watermelon" with a capital 'W', you cannot directly change the first position of fruit into a 'W'.
How are you going to modify the string?
In Java it is quite easy: take the substring that you want to keep, and then concatenate it with the characters that you want to replace.

         */
//        fruit4 = "W" + fruit4.substring(1,10);   // fruit.substring(1,10) = "atermelon"
//        fruit5 = "W" + fruit5.substring(1, fruit.length());

        /*
        Searching a String
The String class provides a method named indexOf that will allow you to search for an individual character or substring within a string.
 If the search is successful the method returns the index(position) of the character or substring within the string.

Example 1
         */

        String str2 = "friend";
        int index = str2.indexOf("e");
        System.out.println("Index = " + index);

        String str4 = "friend";
        int index1 = str4.indexOf("x");
        System.out.println("Index = " + index1);

        String str5 = "airplane";
        int index2 = str5.indexOf("air");
        System.out.println("Index = " + index2);

        String str6 = "airplane";
        int index3 = str6.indexOf("a", 1);
        System.out.println("Index = " + index3);

    }
}
