package CompSci1Review.Unit17ClassSpecialMethods.Labs;

public class UnitedStates
{
    public static void main(String[] args)
    {
      State blank = new State();
      State tx = new State("Texas", "mockingbird", "bluebonnet", "Texas, Our Texas", "friendship", "pecan");
      State ok = new State("Oklahoma", "scissor-tailed flycatcher","Oklahoma Rose", "Oklahoma", "labor omnia vincit (labor conquers all things)", "redbud");
        System.out.println("****************************");
        System.out.println("  Test Default Constructor");
        System.out.println("****************************");
        System.out.println(blank);     // call toString method
        System.out.println();
        System.out.println("****************************");
        System.out.println("    Test 2nd Constructor");
        System.out.println("****************************");
        System.out.println(tx);       // call toString method
        System.out.println();
        System.out.println("****************************");
        System.out.println("    Test 2nd Constructor");
        System.out.println("****************************");
        System.out.println(ok);      // call toString method
        System.out.println();

    }
}
