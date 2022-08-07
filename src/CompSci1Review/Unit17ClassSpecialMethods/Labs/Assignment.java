package CompSci1Review.Unit17ClassSpecialMethods.Labs;

public class Assignment
{
    // instance variables
      private String name;
      private String type;
      private int score;
    // constructors
    public Assignment()
    {
        name = "";
        type = "";
        score = 0;
    }

    public Assignment(String t, String n, int s)
    {
        name = n;
        type = t;
        score = s;
    }
    // accessor methods

    public String getName()
    {
        return name;
    }

    public String getType()
    {
        return type;
    }

    public int getScore()
    {
        return score;
    }

    // mutator methods

    public void setName(String name)
    {
        this.name = name;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setScore(int score)
    {
        this.score = score;
    }

    // other methods
    public String getLetterGrade()
    {
        if (score >= 90 && score <= 100)
        {
            return "A";
        }

        else if (score >= 80 && score <= 89)
        {
            return  "B";
        }

        else if (score >= 70 && score <= 79)
        {
            return "C";
        }

        else if (score >= 60 && score <= 69)
        {
            return "D";
        }
        else
            return "F";
    }



}
