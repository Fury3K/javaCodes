/*
=====================================================================================================================================
  FILE        : multiplicationTable.java
  AUTHOR      : Nathan John G. Orlanes
  DESCRIPTION : A  program that displays a 20x20 multiplication table
  COPYRIGHT   : 9/20/22
=====================================================================================================================================
*/

package ExcerciseGroup1.ExcerciseGroup2;
import java.util.Scanner;
import java.util.*;

public class multiplicationTable {
    public static void main(String[] args)
    {
        int row;
        int column;

        for(row=1; row<=20; row++)
        {
            for(column=1; column<=20; column++)
            {
                System.out.print(row*column+"\t");
            }
            System.out.println();
        }
    }

    }

