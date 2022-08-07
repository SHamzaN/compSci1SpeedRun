package CompSci1Review.Unit1NumberSystems.NumberConversionsNotes;

public class NumberConversions
{
    /*
    Binary Number to Decimal
    Ex
    10101101

    128 64 32 16 8 4 2 1
    1   0   1  0 1 1 0 1

    1*1 = 1
    0*2 = 0
    1*4 = 4
    1*8 = 8
    0*16 = 0
    1*32 = 32
    0*64 = 0
    1*128 = 128

    10101101 -> 173 in decimal
     */

    /*
    Binary Number to Octal
    10110101

    4 2 1  4 2 1  4 2 1
    0 1 0  1 1 0  1 0 1
      2      6      5

      10110101 -> 265 in octal

     */

    /*
    Binary Number to Hex
    Ex
    111010110101

    8 4 2 1  8 4 2 1  8 4 2 1
    1 1 1 0  1 0 1 1  0 1 0 1

       E        B        5

       111010110101 -> EB5 in hex

     */

    /*
    Decimal Number to Binary

    Ex
    25

    64 32 16 8 4 2 1

    16 + 8 + 1 = 25

    64 32 16 8 4 2 1
           1 1 0 0 1

           25 -> 11001 in binary
     */

    /*
    Octal Number to Binary
    Ex
    571

    4 2 1  4 2 1  4 2 1
      5       7      1

    4 2 1  4 2 1  4 2 1
    1 0 1  1 1 1  0 0 1
      5      7      1

      571 -> 101111001 in Binary

     */

    /*
    Hex Number to Binary
    Ex
    A6F

    8 4 2 1  8 4 2 1  8 4 2 1
       A        6        F

       8 4 2 1  8 4 2 1  8 4 2 1
       1 0 1 0  0 1 1 0  1 1 1 1
          A        6        F

          A6F -> 101001101111 in Binary

     */
}
