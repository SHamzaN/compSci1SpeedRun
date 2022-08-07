package CompSci1Review.Unit8JavaMethods.Labs;

import java.util.Scanner;

public class GradeNeeded
{

    private double sixWeeks1;
    private double sixWeeks2;
    private double sixWeeks3;
    private double semesterAvgGoal;
    private double gradeNeeded;


    public void getData()
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("-----------------\n" +
                "   getData\n" +
                "-----------------");
        System.out.print("\nEnter desired semester average -->");
        semesterAvgGoal  = scan.nextDouble();
        System.out.print("Enter 1st six weeks average -->");
        sixWeeks1  = scan.nextDouble();
        System.out.print("Enter 2nd six weeks average -->");
        sixWeeks2  = scan.nextDouble();
        System.out.print("Enter 3rd six weeks average -->");
        sixWeeks3 = scan.nextDouble();
    }

    public void calculateGradeNeeded()
    {
        System.out.println("----------------------\n" +
                " calculateGradeNeeded\n" +
                "----------------------");
        gradeNeeded = (semesterAvgGoal - (0.8 * (sixWeeks1 + sixWeeks2 + sixWeeks3) / 3)) / 0.2;

    }

    public void printResults()
    {
        System.out.println("-----------------\n" +
                "  printResults\n" +
                "-----------------");
        System.out.println("\nSemester Average Goal = " + semesterAvgGoal);
        System.out.println("Grade Needed to Achieve Goal = " + gradeNeeded);
    }

    public static void main(String[] args)
    {
          GradeNeeded object = new GradeNeeded();
          object.getData();
        System.out.println("\n");
        object.calculateGradeNeeded();
        System.out.println("\n");
        object.printResults();
    }
}
