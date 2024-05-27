/*
=====================================================================================================================================
  FILE        : uniTuition.java
  AUTHOR      : Nathan John G. Orlanes
  DESCRIPTION : A  program that Ask for the tuition of a university, and ask the percentage with which its tuition
                increases every year. Display in how many years the tuition will be doubled.
  COPYRIGHT   : 9/20/22
=====================================================================================================================================
*/

package ExcerciseGroup1.ExcerciseGroup2;
import java.util.Scanner;
import java.lang.Math;

public class uniTuition {
    public static void main(String[] args){
        float tuition;
        float increase;
        double tuition2;
        int year = 0;
        Scanner in = new Scanner(System.in);

        for (int i = 1; i < 2; i++)
        {
            System.out.println("Enter Tuition: ");
            tuition = in.nextFloat();
            if (tuition >= 0)
            {
                System.out.println("Enter percentage increase every year: ");
                increase = in.nextFloat();
                increase = 1+(increase/100);
                tuition2 = tuition*2;
                while(tuition < tuition2)
                {
                    tuition = tuition * increase;
                    year++;
                }
                System.out.println("Tuition will be doubled in "+year+" years: ₱"+ String.format("%.2f", tuition));
            }
            else
            {
                System.out.println("Invalid Input");
                i--;
            }
        }

    }
    
}
