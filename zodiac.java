/*
=====================================================================================================================================
  FILE        : zodiac.java
  AUTHOR      : Nathan John G. Orlanes
  DESCRIPTION : A program that asks for the year and display whether it is a leap year. A year is a leap year if it is
                divisible by 4 but not by 100, or it is divisible by 400.
  COPYRIGHT   : 9/20/22
=====================================================================================================================================
*/

package ExcerciseGroup1.ExcerciseGroup2;
import java.util.Scanner;

public class zodiac {
    public static void main(String[] args){
        int inputYear;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a year: ");
        inputYear = in.nextInt();

        inputYear = inputYear % 12;

        if(inputYear == 0){
            System.out.println("Year of the monkey");
        }
        else if(inputYear == 1){
            System.out.println("Year of the rooster");
        }
        else if(inputYear == 2){
            System.out.println("Year of the dog");
        }
        else if(inputYear == 3){
            System.out.println("Year of the pig");
        }
        else if(inputYear == 4){
            System.out.println("Year of the rat");
        }
        else if(inputYear == 5){
            System.out.println("Year of the ox");
        }
        else if(inputYear == 6){
            System.out.println("Year of the tiger");
        }
        else if(inputYear == 7){
            System.out.println("Year of the rabbit");
        }
        else if(inputYear == 8){
            System.out.println("Year of the dragon");
        }
        else if(inputYear == 9){
            System.out.println("Year of the snake");
        }
        else if(inputYear == 10){
            System.out.println("Year of the horse");
        }
        else if(inputYear == 11){
            System.out.println("Year of the sheep");
        }

    }
    
}
