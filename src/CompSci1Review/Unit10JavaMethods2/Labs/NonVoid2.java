package CompSci1Review.Unit10JavaMethods2.Labs;

public class NonVoid2
{
    /** @return the square of num
     *  @param num the number to be squared
     */
    public int square(int num)
    {
        return (int) Math.pow(num, 2);
    }

    /** @return the sum of num1, num2, and num3
     *  @param num1 first number in the sum
     *  @param num2 second number in the sum
     *  @param num3 third number in the sum
     */
    public int sumThree(int num1, int num2, int num3)
    {
        return num1 + num2 + num3;
    }

    /** @return the smaller value between num1 and num2
     *  @param num1 first number in minimum comparison
     *  @param num2 second number in minimum comparison
     */
    public int smaller(int num1, int num2)
    {

        if (num1 < num2)
        {
            return num1;
        }
        else
            return num2;
    }

    /** Returns one of five fortune cookie responses chosen at random
     *  If the random number = 0 the method returns "Your future looks bright"
     *  If the random number = 1 the method returns "I see love in your future"
     *  If the random number = 2 the method returns "Maybe you better stay home today"
     *  If the random number = 3 the method returns "You will have fame and fortune"
     *  If the random number = 4 the method returns "Happiness you will have"
     *  @return a string response
     */
    public String fortuneCookie()
    {
        int num = (int)(Math.random() * 5);

        String zero = "Your future looks bright";
        String one = "I see love in your future";
        String two = "Maybe you better stay home today";
        String three = "You will have fame and fortune";
        String four = "Happiness you will have";

        if (num == 0)
        {
            return zero;
        }
        else if (num == 1)
        {
            return one;
        }
        else if(num == 2)
        {
            return two;
        }
        else if(num == 3)
        {
            return three;
        }
        else
       return four;
    }

    /** Returns a response depending upon month's value
     *  if month >= 1 && month <= 3 it returns "winter"
     *  if month >= 4 && month <= 6 it returns "spring"
     *  if month >= 7 && month <= 9 it returns "summer"
     *  if month >= 10 && month <= 12 it returns "fall"
     *  @return a string response
     *  @param month the numerical month of the year
     */
    public String season(int month)
    {
        String winter = "winter";
        String spring = "spring";
        String summer = "summer";
        String fall = "fall";

        if (month >= 1 && month <= 3)
        {
            return winter;
        }
        else if(month >= 4 && month <= 6)
        {
            return spring;
        }
        else if (month >= 7 && month <= 9)
        {
            return summer;
        }
        else
        return fall;
    }

    /** Determines if num is odd or even. If num is even it returns the string "even";
     *  otherwise it returns the string "odd"
     *  @return the string "even" or the string "odd"
     *  @param num number used in comparison
     */
    public String evenOdd(int num)
    {
        String even = "even";
        String odd = "odd";
     if (num % 2 == 0)
     {
         return even;
     }
      else
         return odd;
    }
}