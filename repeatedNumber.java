/*
=====================================================================================================================================
  FILE        : repeatedNumber.java
  AUTHOR      : Nathan John G. Orlanes
  DESCRIPTION : A  program that ask the user for a number repeatedly and add all the inputted numbers until a 0 is inputted,
                in which case, display the sum and end the program.
  COPYRIGHT   : 9/20/22
=====================================================================================================================================
*/

package ExcerciseGroup1.ExcerciseGroup2;
import java.util.Scanner;
import java.util.*;

public class repeatedNumber {
    public static void main(String[] args){
        int numberInput;
        int sum = 0;
        Scanner in = new Scanner(System.in);

        for (int i = 1; i < 2; i++)
        {
            System.out.println("Enter your number: ");
            numberInput = in.nextInt();
            sum += numberInput;
            i--;

            if(numberInput == 0)
            {
                System.out.println("Your total is: " +sum);
                i++;
            }
        }

    }
}
