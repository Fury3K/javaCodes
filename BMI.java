/*
=====================================================================================================================================
  FILE        : BMI.java
  AUTHOR      : Nathan John G. Orlanes
  DESCRIPTION : A  program that  Ask for a person's weight in kilograms and height in meters, then compute the BMI
                (Body Mass Index) by dividing the weight by the square of the height. Using the result,
                display both the BMI and Interpretation.
  COPYRIGHT   : 9/20/22
=====================================================================================================================================
*/

package ExcerciseGroup1.ExcerciseGroup2;
import java.util.Scanner;

public class BMI {
    public static void main(String[] args){
       int n = 2;
       float weight = 0;
       float height = 0;
       double BMI;
       Scanner in = new Scanner(System.in);

       for (int i = 1; i <=n; i++){
            System.out.println("Enter your height(m): ");
            height = in.nextFloat();
            if(height < 3.5 && height > 0.3)
            {
                i++;
                System.out.println("Enter your weight(kg): ");
                weight = in.nextFloat();
                if (weight < 500 && weight > 3){
                    i++;
                }
                else{
                    System.out.println("Invalid Input");
                    i--;
                }
            }
            else{
                System.out.println("Invalid Input");
                i--;
            }
       }

       BMI = weight/Math.pow(height,height);
       System.out.println("BMI: " +BMI);

       if (BMI < 18.5)
       {
        System.out.println("You are Underweight");
       }
       else if (BMI >= 18.5 && BMI <25.0 )
       {
        System.out.println("You are Normal");
       }
       else if (BMI >= 25.0 && BMI < 30.0)
       {
        System.out.println("You are Overweight");
       }
       else
       {
        System.out.println("You are Obese");
       }

    }


    
}
