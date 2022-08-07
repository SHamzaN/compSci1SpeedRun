package CompSci1Review.Unit18ObjectArrays.Labs;

public class Birthday
{
    private String name;
    private String bDay;

    public Birthday(String n, String b)
    {
        name = n;
        bDay = b;
    }

    public String getName()
    {
        return name;
    }

    public String getbDay()
    {
        return bDay;
    }

    public String toString()
    {
        return "\nEnter name = " + name +
                "\nEnter Bday = " + bDay +
                "\n";
    }
}
