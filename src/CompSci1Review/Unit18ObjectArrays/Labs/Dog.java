package CompSci1Review.Unit18ObjectArrays.Labs;

public class Dog
{
    // instance variables
        private String name;
        private String breed;

    // constructors
     public Dog()
     {
         name = " ";
         breed = " ";
     }

     public Dog(String n, String b)
     {
         name = n;
         breed = b;
     }
    // accessor methods

    public String getName()
    {
        return name;
    }

    public String getBreed()
    {
        return breed;
    }

    // mutator methods

    public void setName(String name)
    {
        this.name = name;
    }

    public void setBreed(String breed)
    {
        this.breed = breed;
    }


}
