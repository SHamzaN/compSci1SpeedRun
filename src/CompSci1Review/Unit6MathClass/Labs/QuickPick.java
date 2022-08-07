package CompSci1Review.Unit6MathClass.Labs;

public class QuickPick
{
    public static void main(String[] args)
    {

        int random = (int) (Math.random() * 50) + 1;
        int random1 = (int) (Math.random() * 50) + 1;
        int random2 = (int) (Math.random() * 50) + 1;
        int random3 = (int) (Math.random() * 50) + 1;
        int random4 = (int) (Math.random() * 50) + 1;
        int random5 = (int) (Math.random() * 50) + 1;
        System.out.println("Texas Lottery - Quick Pick");
        System.out.println("===========================");
        System.out.println(random + "  " + random1 + "  " + random2 + "  " + random3 + "  " + random4 + "  " + random5);
    }
}
