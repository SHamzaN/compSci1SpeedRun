package CompSci1Review.Unit8JavaMethods.Labs;

import java.util.Scanner;

public class Help
{


      private double extraPoints;
      private double average;
      private double s1Avg;
      private double s2Avg;
      private double s3Avg;
      private double s4Avg;
      private double s5Avg;
      private double s6Avg;
      private double s7Avg;
      private double s8Avg;
      private double s9Avg;
      private double s10Avg;

    public void getAverages()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("-----------------\n" +
                "   getAverages\n" +
                "-----------------");
        System.out.print("\nLeslie's average -->");
      average = scan.nextDouble();
        System.out.print("\nStudent 1 average -->");
        s1Avg = scan.nextDouble();
        System.out.print("Student 2 average -->");
        s2Avg = scan.nextDouble();
        System.out.print("Student 3 average -->");
        s3Avg = scan.nextDouble();
        System.out.print("Student 4 average -->");
        s4Avg = scan.nextDouble();
        System.out.print("Student 5 average -->");
        s5Avg = scan.nextDouble();
        System.out.print("Student 6 average -->");
        s6Avg = scan.nextDouble();
        System.out.print("Student 7 average -->");
        s7Avg = scan.nextDouble();
        System.out.print("Student 8 average -->");
        s8Avg = scan.nextDouble();
        System.out.print("Student 9 average -->");
        s9Avg = scan.nextDouble();
        System.out.print("Student 10 average -->");
        s10Avg = scan.nextDouble();
     //   System.out.println(average);
    }

    public void calculatePoints()
    {
        System.out.println("-----------------\n" +
                " calculatePoints\n" +
                "-----------------");
        extraPoints += s1Avg - Math.floor(s1Avg);
        extraPoints += s2Avg - Math.floor(s2Avg);
        extraPoints += s3Avg - Math.floor(s3Avg);
        extraPoints += s4Avg - Math.floor(s4Avg);
        extraPoints += s5Avg - Math.floor(s5Avg);
        extraPoints += s6Avg - Math.floor(s6Avg);
        extraPoints += s7Avg - Math.floor(s7Avg);
        extraPoints += s8Avg - Math.floor(s8Avg);
        extraPoints += s9Avg - Math.floor(s9Avg);
        extraPoints += s10Avg - Math.floor(s10Avg);

        average += extraPoints;
    }

    public void printResults()
    {
        System.out.println("-----------------\n" +
                "  printResults\n" +
                "-----------------");
        System.out.println("\nExtra Points = " + extraPoints);
        System.out.println("New Average = " + average);
    }


    public static void main(String[] args)
    {
         Help object = new Help();

         object.getAverages();
        System.out.println("\n");
        object.calculatePoints();
        System.out.println("\n");
        object.printResults();
    }
}
