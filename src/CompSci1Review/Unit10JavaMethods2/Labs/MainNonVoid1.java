package CompSci1Review.Unit10JavaMethods2.Labs;

public class MainNonVoid1
{
    public static void main(String[] args)
    {
        NonVoid1 app = new NonVoid1();

        System.out.println();
        System.out.println("Test average method");
        System.out.println("===================");
        System.out.println("The average of 50 and 100 is " + app.average(50, 100));
        System.out.println("The average of 1271 and 5446 is " + app.average(1271, 5446));

        System.out.println();
        System.out.println("Test randomInt method");
        System.out.println("=====================");
        System.out.println("An integer random number in range of [1..3] = " + app.randomInt(3));
        System.out.println("An integer random number in range of [1..50] = " + app.randomInt(50));

        System.out.println();
        System.out.println("Test isVowel method");
        System.out.println("===================");
        System.out.println("The letter e is a vowel = " + app.isVowel("e"));
        System.out.println("The letter k is a vowel = " + app.isVowel("k"));
        System.out.println("The letter A is a vowel = " + app.isVowel("A"));

        System.out.println();
        System.out.println("Test weather method");
        System.out.println("==========================");
        System.out.println(app.weather(32) + " when the temperature is 32 degrees");
        System.out.println(app.weather(78) + " when the temperature is 78 degrees");


        System.out.println();
        System.out.println("Test getLetterGrade method");
        System.out.println("==========================");
        System.out.println("A score of 75 = " + app.getLetterGrade(75));
        System.out.println("A score of 89 = " + app.getLetterGrade(89));


        System.out.println();
        System.out.println("Test isWholeNumber method");
        System.out.println("=========================");
        System.out.println("The number 100 is a whole number =  " + app.isWholeNumber(100));
        System.out.println("The number -25 is a whole number =  " + app.isWholeNumber(-25));


    }
}
