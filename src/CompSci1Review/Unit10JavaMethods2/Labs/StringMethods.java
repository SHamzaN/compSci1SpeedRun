package CompSci1Review.Unit10JavaMethods2.Labs;

public class StringMethods
{
    /** Prints the parameter name followed by the phrase
     *  " have a nice day!"
     *  @param name the name to be displayed
     */
    public void greeting(String name)
    {
        System.out.println(name + " have a nice day!");
    }

    /** @return the first letter from parameter str
     *  @param str string used to extract first letter from
     */
    public String firstLetter(String str)
    {
      return str.substring(0,1);
    }

    /** @return a string with str1, str2, and str3 merged together
     *  @param str1 first string to be merged
     *  @param str2 second string to be merged
     *  @param str3 third string to be merged
     */
    public String merge(String str1, String str2, String str3)
    {
     return str1+str2+str3;
    }

    /** @return a string that is the first letter of parameter
     *   str repeated three times.
     *  @param str string used to extract first letter from
     */
    public String repeatFirst(String str)
    {
        String repeatFirst = str.substring(0,1);
        return repeatFirst + repeatFirst + repeatFirst;
    }

    /** @return compares the lengths of str1 and str2 and returns
     *   true if they are the same length; otherwise returns false
     *  @param str1 first string to determine length of
     *  @param str2 second string to determine length of
     */
    public boolean sameLength(String str1, String str2)
    {
       if (str1.length() == str2.length())
       {
           return true;
       }
       else
       return false;
    }
}
