package CompSci1Review.Unit7StringClass.Labs;

public class FlashLight
{
    public static void main(String[] args)
    {
         String str = "flashlight";

        System.out.println("Part 1");
        System.out.println("=================");
        System.out.println(str);
        System.out.println(str.substring(5));
        System.out.println(str.substring(2,5));
        System.out.println(str.substring(0,1) + str.substring(5));
        System.out.println(str.substring(0, 3) + str.substring(9));
        System.out.println(str.substring(0,1) + str.substring(6,7) + str.substring(9));
        System.out.println(str.substring(4,5) + str.substring(6,9));
        System.out.println(str.substring(7,8) + str.substring(2,3) + str.substring(3,4));
        System.out.println(str.substring(0,1) + str.substring(2,4) + str.substring(9));
        System.out.println(str.substring(3,5) + str.substring(2,3) + str.substring(0,1) + str.substring(9));
        System.out.println("\n");
        System.out.println("Part 2");
        System.out.println("=================");
        System.out.println(str.substring(5) + str.substring(3,4));
        System.out.println(str.substring(5) + "er");
        System.out.println(str.substring(5) + "ning");
        System.out.println("en" + str.substring(5) + "ened");
    }
}
