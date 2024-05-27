/*
=====================================================================================================================================
  FILE        : randomGenerator.java
  AUTHOR      : Nathan John G. Orlanes
  DESCRIPTION : A  program that  Ask the user for a number between 0 and 100, inclusive. Ask this repeatedly until
                the number matches a randomly-generated number. For each iteration, inform the user whether their guess is low or
                high with respect to the randomly-generated number, so that their next guess is more intelligently made.
  COPYRIGHT   : 9/20/22
=====================================================================================================================================
*/

package ExcerciseGroup1.ExcerciseGroup2;
import java.util.Scanner;
import java.util.*;

public class randomGenerator {
    public static void main(String[] args){
        int numberInput;
        Random rndm = new Random();
        int random = rndm.nextInt(99) + 1;
        Scanner in = new Scanner(System.in);
        System.out.println(random);

        for (int i = 1; i <=2; i++)
        {
            System.out.println("Enter a number from 0 to 100: ");
            numberInput = in.nextInt();
            if (numberInput >= 0 && numberInput <= 100)
            {
                if(numberInput > random)
                {
                    System.out.println("High number, try going lower!");
                    i--;
                }
                if(numberInput < random)
                {
                    System.out.println("Low Number, try going higher!");
                    i--;
                }
                else
                {
                    System.out.println("Correct!");
                }
            }
            else
            {
                System.out.print("Invalid Input! Stick from numbers 0 to 100!");
                i--;
            }
        }
    }
}
