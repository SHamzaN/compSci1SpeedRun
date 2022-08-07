package CompSci1Review.Unit12Iterationdowhile.labs;

public class dowhilePractice
{
       public static void main(String[] args)
       {
           int count = 0;
           do
           {
               System.out.print(count + " ");
              count++;
           }while (count <= 20);

           System.out.println("\n");

           count = 1;
           do
           {
               System.out.print(count + " ");
               count+=2;
           }while (count < 50);

           System.out.println("\n");

          count= 0;

          do
          {
              System.out.print(count + " ");
              count+=10;
          }while (count <= 200);

           System.out.println("\n");

           char character = 'a';

           do
           {
               System.out.print(character + " ");
               character++;
           }while (character <= 'z');
       }
}
