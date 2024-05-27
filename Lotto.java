/*
=====================================================================================================================================
  FILE        : Lotto.java
  AUTHOR      : Nathan John G. Orlanes
  DESCRIPTION : A program that randomly generates a two-digit number. Ask the user to enter a two-digit number,
                then display how much the user wins in a lottery
  COPYRIGHT   : 9/20/22
=====================================================================================================================================
*/

package ExcerciseGroup1.ExcerciseGroup2;
import java.util.Scanner;
import java.util.*;

public class Lotto {
    public static void main(String[] args){
        int numberInput;
        int digitInput1;
        int digitInput2;
        int randomDigit1;
        int randomDigit2;
        Random rndm = new Random();
        int random = rndm.nextInt(90)+10;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number with 2 digits: ");
        numberInput = in.nextInt();
        digitInput1 = numberInput / 10;
        digitInput2 = numberInput % 10;

        boolean Exact = random == numberInput;
        boolean TwoMatches = randomDigit1 == digitInput2 && randomDigit2 == digitInput1;
        boolean OneMatch = randomDigit1 == digitInput1 || randomDigit1 == digitInput2 || randomDigit2 == digitInput1 || randomDigit2 == digitInput2;

        if (Exact){
            System.out.println("Exact Order. Claim your 10,000 pesos reward");
        }
        else if (TwoMatches){
            System.out.println("Both numbers match. Claim your 3,000 pesos reward");
        }
        else if (OneMatch){
            System.out.println("One match. Claim your 1,000 pesos reward");
        }
        else{
            System.out.println("No matches, nt");
        }



    }
    
}
/* */