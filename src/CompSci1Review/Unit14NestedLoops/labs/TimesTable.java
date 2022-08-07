package CompSci1Review.Unit14NestedLoops.labs;

public class TimesTable
{
     public static void main(String[] args)
     {
        int i;
        int j;

         for ( i = 1; i <= 10; i++)
         {
                for ( j = 1; j <= 10; j++)
                {
                    System.out.print(i * j + "  ");
                }
             System.out.println();
         }
     }
}
