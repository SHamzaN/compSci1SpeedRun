package CompSci1Review.Unit20printf;

public class printf
{
    /*
    printf
When writing data to a console window you have used both the print and println statements.
Java offers another option for printing to the console window call printf (short for print formatting).
This method provides alot more flexibility in how information is displayed on the screen.
In this unit you will learn how to use the printf method to display information on the console window.
     */

    /*
    printf Form
The way that a printf statement is constructed is different from the way you would do a print and println. Here is the form of the printf statement:
A printf statement has two parts: the formatting string and the data to be printed.
The formatting string uses special commands to describe how the data will appear on the screen.
The number of data items that a printf statement can print is virtually limitless. To distinguish between each data item the printf uses commas.
     */

    /*
    Formatting String
The formatting string uses special commands to describe how the data will appear on the screen. A command is made up of several parts.

% sign - the percent sign must precede all formatting commands.
Format Flags - used to apply special formatting to the data. We will limit our dicussion to only one flag, the hyphen (-).
The hyphen flag is used to cause the data to left align, instead of right align, which is the default.
Column Width - specifies how many columns on the screen the data will occupy.
Format Type - specifies what type of data the command refers (int, float, string, etc.).
There are many format types. We will limit our discussion to only four:
Format Type	Description
d	integer (decimal)
f	floating-point
s	string
n	newline

Programming Note:
if the data being printed will occupy more space than specified by the column width specifier (%8d),
the column width specifier will be ignored and the data will occupy as many spaces as necessary.
     */

    /*
    Format Type - n
The n format type is used to embed newline commands within the formatting string.

The following example

  System.out.printf("%5d", 100);
  System.out.printf("%5d", 200);

  To make the two numbers appear on separate lines you have to add a %n command

  System.out.printf("%5d%n", 100);
  System.out.printf("%5d", 200);

  or

  System.out.printf("%5d%n%n", 100);
  System.out.printf("%5d", 200);
     */
}
