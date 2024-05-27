/*
=====================================================================================================================================
  FILE        : leapYear.java
  AUTHOR      : Nathan John G. Orlanes
  DESCRIPTION : A program that asks for the year and display whether it is a leap year. A year is a leap year if it is
                divisible by 4 but not by 100, or it is divisible by 400.
  COPYRIGHT   : 9/20/22
=====================================================================================================================================
*/

package ExcerciseGroup1.ExcerciseGroup2;
import java.util.Scanner;

public class leapYear {
    public static void main(String[] args){
        int year;
        Scanner in = new Scanner (System.in);

        for(int i = 1; i <=2; i++)
        {
            System.out.println("Enter Year: ");
            year = in.nextInt();
            if (year <=9999 && year>=1000)
            {
                if(year % 4 == 0)
                {
                    System.out.println("Leap Year!");
                    i++;
                }
                else
                {
                    System.out.println("Not a Leap Year!");
                    i++;
                }
            }
            else
                {
                    System.out.println("Invalid input, please put a valid year!");
                    i--;
                }
        }
    }
}
