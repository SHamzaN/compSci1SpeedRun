package CompSci1Review.Unit11Iterationwhile.Labs;

public class Average
{
    // instance variables
    private int posCount = 0;
    private int negCount = 0;
    private int posSum = 0;
    private int negSum = 0;

    /* This method generates a 100 random numbers and determines
     * if each number is positive or negative. If the number is
     * positive it increments posCount by one and increases posSum
     * by the value of the number. If the number is negative it
     * increments negCount by one and increases negSum by the
     * value of the number.
     */
    public void tallyAndSum()
    {

     int num;
     int count = 1;
     while (count <= 100)
     {
         num = generateNumber();
         System.out.print(num + " ");

         if (num > 0)
         {
             posCount++;
             posSum += num;
         }
         else if (num < 0)
         {
             negCount++;
             negSum += num;
         }
         count++;

     }

    }

    /* Calculates an average by dividing the sum by the count
     * @return the average
     * @param sum the sum that is to be averaged
     * @param count the count of the numbers to be averaged
     */
    public double average(int sum, int count)
    {
       return (double) sum / count;
    }

    /* This method prints a summary report displaying the count,
     * sum, and average of the positive and negative numbers.
     */
    public void printSummary()
    {

        System.out.println("\n\n");
        System.out.println("           Summary");
        System.out.println("-------------------------------");
        System.out.println("Positive Numbers     = " + posCount);
        System.out.println("Sum of Positives     = " + posSum);
        System.out.println("Average of Positives = " + average(posSum,posCount));
        System.out.println();
        System.out.println("Negative Numbers     = " + negCount);
        System.out.println("Sum of Negatives     = " + negSum);
        System.out.println("Average of Negatives = " + average(negSum,negCount));
    }

    /* return a random number in the range -1000 to 1000
     */
    public int generateNumber()
    {
        return (int)(Math.random() * 2001) - 1000;
    }

    public static void main(String[] args)
    {

        Average app = new Average();
        app.tallyAndSum();
        app.printSummary();
    }
}
