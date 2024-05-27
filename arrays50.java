package ExerciseGroup2;
import java.util.Random;
import java.util.stream.*;
import java.util.Scanner;

public class arrays50 {
    public static void main (String[] args){
        int numberInput;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[50];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*50);
            System.out.print(arr[i] + " ");
        }
        System.out.println("Enter a number from 1-100 to be looked for in the array: ");
        numberInput = sc.nextInt();

        searchArray(arr, numberInput);

        

    }

    public static void searchArray(int arr[], int numberInput){
        
        boolean isFound = false;
        int index = -1;
        for(int i = 0; i < arr.length; i++){    
            if(arr[i] == numberInput){    
                isFound = true;
                index = i;
                i = arr.length;
            }   

            else{
                isFound = false;
            } 
        }
        if(isFound == true) {
            System.out.println("Found at index: " + index + "\n");
        }
        else{
            System.out.println("Number not found in the array.\n");
        }
    }

    

}

