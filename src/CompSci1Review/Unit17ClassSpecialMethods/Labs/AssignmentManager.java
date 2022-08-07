package CompSci1Review.Unit17ClassSpecialMethods.Labs;

public class AssignmentManager
{
    public static void main(String[] args)
    {

        Assignment assignment = new Assignment();
        Assignment assignment1 = new Assignment("Test", "Chapter 1 Test", 95);
        Assignment assignment2 = new Assignment("Quiz", "Chapter 1 Quiz", 83);
        Assignment assignment3 = new Assignment("Test", "Chapter 1 Test", 75);

        System.out.println("/**************************************/\n" +
                "/*     Test Default Constructor       */\n" +
                "/*     and Accessor methods           */\n" +
                "/**************************************/\n");
        System.out.print("Type         : " + assignment.getType());
        System.out.print("\nName         : " + assignment.getName());
        System.out.print("\nScore        : " + assignment.getScore());
        System.out.print("\nLetter Grade : " + assignment.getLetterGrade());
        System.out.println("\n");
        System.out.println("/**************************************/\n" +
                "/*     Test 2nd Constructor           */\n" +
                "/*     and Accessor methods           */\n" +
                "/**************************************/\n");
        System.out.print("Type         : " + assignment1.getType());
        System.out.print("\nName         : " + assignment1.getName());
        System.out.print("\nScore        : " + assignment1.getScore());
        System.out.print("\nLetter Grade : " + assignment1.getLetterGrade());
        System.out.println();

        System.out.print("\nType         : " + assignment2.getType());
        System.out.print("\nName         : " + assignment2.getName());
        System.out.print("\nScore        : " + assignment2.getScore());
        System.out.print("\nLetter Grade : " + assignment2.getLetterGrade());
        System.out.println("\n");

        System.out.println("/**************************************/\n" +
                "/*     Test Mutator methods           */\n" +
                "/*     and Accessor methods           */\n" +
                "/**************************************/\n");
        System.out.print("Type         : " + assignment3.getType());
        System.out.print("\nName         : " + assignment3.getName());
        System.out.print("\nScore        : " + assignment3.getScore());
        System.out.print("\nLetter Grade : " + assignment3.getLetterGrade());
        System.out.println();
        assignment3.setType("Quiz");
        assignment3.setName("Chapter 1 Quiz");
        assignment3.setScore(30);
        System.out.print("\nType         : " + assignment3.getType());
        System.out.print("\nName         : " + assignment3.getName());
        System.out.print("\nScore        : " + assignment3.getScore());
        System.out.print("\nLetter Grade : " + assignment3.getLetterGrade());
        System.out.println("\n");
    }
}
