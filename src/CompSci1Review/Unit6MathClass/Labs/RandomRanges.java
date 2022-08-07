package CompSci1Review.Unit6MathClass.Labs;

public class RandomRanges
{
    public static void main(String[] args)
    {
        int random = (int) (Math.random() * 26);
        int random1 = (int) (Math.random() * 3) + 1;
        int random2 = (int) (Math.random() * 51) + 50 ;
        int random3 = (int) (Math.random() * -10) + (-1) ;
        int random4 = (int) (Math.random() * 200) + (-100);
        int num6 = (int)(Math.random() * 26) + 65;
        double random5 =  ((Math.random() * 999) + 1) / 1000.0;


        System.out.println("Random Ranges");
        System.out.println("================");
        System.out.println("1. Range: 0 to 25 = " + random);
        System.out.println("2. Range: 1 to 3 = " + random1);
        System.out.println("3. Range: 50 to 100 = " + random2);
        System.out.println("4. Range: -1 to -10 = " + random3);
        System.out.println("5. Range: -100 to 100 = " + random4);
        System.out.println("6. Range: A to Z = " + (char)num6 );
        System.out.println("7. Range: 0.1 to 1 = " + random5);

    }
}
