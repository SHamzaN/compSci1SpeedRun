package CompSci1Review.Unit20printf.Labs;

public class printfPractice
{
    public void method1()
    {
        int benchPress = 280;
        int squats = 395;

        // insert code below this line
        System.out.printf("%-20s%d%n","Bench Press", benchPress);
        System.out.printf("%-20s%d%n","Squats",squats);

    }

    public void method2()
    {
        double width = 10.74829;
        double length = 5.125;

        // insert code below this line
        System.out.printf("%-12s%.2f%n","width =",width);
        System.out.printf("%-13s%.2f","length  =",length);
    }

    public void method3()
    {

        System.out.printf("%7d%n", (int) (Math.random() * 201));
        System.out.printf("%7d%n", (int) (Math.random() * 201));
        System.out.printf("%7d%n", (int) (Math.random() * 201));
        System.out.printf("%7d%n", (int) (Math.random() * 201));
        System.out.printf("%7d%n", (int) (Math.random() * 201));
        System.out.printf("%7d%n", (int) (Math.random() * 201));
        System.out.printf("%7d%n", (int) (Math.random() * 201));
        System.out.printf("%7d%n", (int) (Math.random() * 201));
        System.out.printf("%7d%n", (int) (Math.random() * 201));
        System.out.printf("%7d%n", (int) (Math.random() * 201));
        System.out.printf("%7d%n", (int) (Math.random() * 201));
        System.out.printf("%7d%n", (int) (Math.random() * 201));
        System.out.printf("%7d%n", (int) (Math.random() * 201));
        System.out.printf("%7d%n", (int) (Math.random() * 201));
        System.out.printf("%7d", (int) (Math.random() * 201));


    }

    public static void main(String[] args)
    {
        printfPractice app = new printfPractice();

        System.out.println("    Method 1");
        System.out.println("----------------");
        System.out.println();
        app.method1();          // call Method1
        System.out.println();
        System.out.println("    Method 2");
        System.out.println("----------------");
        System.out.println();
        app.method2();         // call Method2
        System.out.println();
        System.out.println("    Method 3");
        System.out.println("----------------");
        System.out.println();
        app.method3();        // call Method3
    }
}
