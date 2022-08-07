package CompSci1Review.Unit17ClassSpecialMethods.Labs;

public class MyRectangle
{
    // instance variables
    private int length;     // rectangle's length
    private int width;      // rectangle's width
    // constructor
    public MyRectangle(int l, int w)
    {
        length = l;
        width = w;
    }
    // accessor methods
    public int getLength()
    {
        return length;
    }

    public int getWidth()
    {
        return width;
    }

    // mutator methods
    public void setLength(int l)
    {
        length = l;
    }

    public void setWidth(int w)
    {
        width = w;
    }
    // other methods
    public int getPerimeter()
    {
        return 2 * (length + width);
    }

    public int getArea()
    {
        return length * width;
    }

    public String toString()
    {
        return "\nLength = " + length +
                "\nWidth = " + width +
                "\nPerimeter = " + getPerimeter() +
                "\nArea = " + getArea();
    }
}
