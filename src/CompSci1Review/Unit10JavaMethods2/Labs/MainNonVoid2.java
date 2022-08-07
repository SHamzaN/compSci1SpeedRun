package CompSci1Review.Unit10JavaMethods2.Labs;

public class MainNonVoid2
{
    public static void main(String[] args)
    {
        NonVoid2 app = new NonVoid2();

        System.out.println("Test square method");
        System.out.println("==================");
        System.out.println("The square of 5 is " + app.square(5));
        System.out.println("The square of 12 is " + app.square(12));

        System.out.println();
        System.out.println("Test sumThree method");
        System.out.println("====================");
        System.out.println("The sum of 10, 20, 30 is " + app.sumThree(10, 20, 30));
        System.out.println("The sum of 15, 100, 75 is " + app.sumThree(15, 100, 75));

        System.out.println();
        System.out.println("Test smaller method");
        System.out.println("====================");
        System.out.println("Which is smaller 10 or 35? " + app.smaller(10, 35));
        System.out.println("Which is smaller 100 or 50? " + app.smaller(100, 50));

        System.out.println();
        System.out.println("Test fortuneCookie method");
        System.out.println("=========================");
        System.out.println("Your fortune cookie says - " + app.fortuneCookie());
        System.out.println("Your fortune cookie says - " + app.fortuneCookie());

        System.out.println();
        System.out.println("Test season method");
        System.out.println("===================");
        System.out.println("The month of March is in the " + app.season(3));
        System.out.println("The month of July is in the " + app.season(7));

        System.out.println();
        System.out.println("Test evenOdd method");
        System.out.println("===================");
        System.out.println("The number 84 is " + app.evenOdd(84));
        System.out.println("The number 27 is " + app.evenOdd(27));
    }
}
