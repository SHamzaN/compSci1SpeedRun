package CompSci1Review.Unit10JavaMethods2.Labs;

public class NonVoid1
{
    /** @return the average of num1 and num2
     *  @param num1 first number in average
     *  @param num2 second number in average
     */
    public double average(double num1, double num2)
    {
        double avg = (num1 + num2) / 2;
        return avg;
    }

    /** @return the average of num1 and num2
     *  @param num1 first number in average
     *  @param num2 second number in average
     */
//    public double average(double num1, double num2)
//    {
//        return (num1 + num2) / 2;
//    }
    //Another way for average

    /** @return an integer random number in the range of [1..range] inclusive
     *  @param range the upper bounds of generated random number
     */
    public int randomInt(int range)
    {
        return (int)(Math.random() * range) + 1;
    }

    /** Determines if ch is a vowel. If ch is a vowel it
     *  returns true; otherwise it returns false.
     *  @return true or false
     *  @param ch the string to be tested
     */
    public boolean isVowel(String ch)
    {
        if(ch.equalsIgnoreCase("a") || ch.equalsIgnoreCase("e") ||
                ch.equalsIgnoreCase("i") || ch.equalsIgnoreCase("o") ||
                ch.equalsIgnoreCase("u"))
            return true;
        else
            return false;
    }

    /** Returns a response depending upon temp's value.
     *  If temp >= 85 it returns the string "It's hot".
     *  If temp >= 65 it returns the string "It's warm".
     *  If temp >= 45 it returns the string "It's cool".
     *  If temp < 45 it rteturns the string "It's cold".
     *  @return a string response
     *  @param temp the temperature input
     */
    public String weather(int temp)
    {
        if(temp >= 85)
            return "It's hot";
        else if(temp >= 65)
            return "It's warm";
        else if(temp >= 45)
            return "It's cool";
        else
            return "It's cold";
    }

    /** Determines the letter grade for grade
     *  @return a string value of "A", "B", "C", or "F"
     *  @param grade the grade that needs to be converted into a letter grade
     */
    public String getLetterGrade(int grade)
    {
        if(grade >= 90 && grade <= 100)
            return "A";
        if(grade >= 80 && grade < 90)
            return "B";
        if(grade >= 70 && grade < 80)
            return "C";

        return "F";
    }

    /** Determines if num is a whole number. If num is a whole number it
     *  returns true; otherwise it returns false.
     *  @return true or false
     *  @param num the number in the comparison
     */
    public boolean isWholeNumber(int num)
    {
        return (num >= 0);
    }
}
