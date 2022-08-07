package CompSci1Review.Unit10JavaMethods2.Labs;

public class MainStringMethods
{
    public static void main(String[] args)
    {
        StringMethods app = new StringMethods();

        System.out.println("Test greeting method");
        System.out.println("====================");
        app.greeting("John");
        app.greeting("Sarah");

        System.out.println();
        System.out.println("Test firstLetter method");
        System.out.println("=======================");
        System.out.println("The first letter of honor is " + app.firstLetter("honor"));
        System.out.println("The first letter of courage is " + app.firstLetter("courage"));

        System.out.println();
        System.out.println("Test merge method");
        System.out.println("=================");
        System.out.println("The merge of faith, hope, love is " + app.merge("faith", "hope", "love"));
        System.out.println("The merge of forgiveness, compassion, mercy is  " + app.merge("forgiveness", "compassion", "mercy"));

        System.out.println();
        System.out.println("Test repeatFirst method");
        System.out.println("=======================");
        System.out.println("Repeat first letter of sacrifice is " + app.repeatFirst("sacrifice"));
        System.out.println("Repeat first letter of commitment is " + app.repeatFirst("commitment"));

        System.out.println();
        System.out.println("Test sameLength method");
        System.out.println("======================");
        System.out.println("Charity and selfless are same length - " + app.sameLength("charity", "selfless"));
        System.out.println("Liberty and freedom are same length - " + app.sameLength("liberty", "freedom"));
    }
}
