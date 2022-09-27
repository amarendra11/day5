package day5exp1;

public class day5exp2 {
    public static void main(String[] args) {

    int year = 2022;
    boolean leap = false;
    if (year % 4 == 0) {

        if (year % 100 == 0) {

            if (year % 400 == 0)
                leap = true;
            else
                leap = false;
        }
        else
            leap = true;
    }

    else
    leap = false;

    if (leap)
            System.out.println(year + " is a leap year.");
    else
            System.out.println(year + " is not a leap year.");
  }
 }

