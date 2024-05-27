package ExerciseGroup2;

import java.util.Scanner;

public class arraysMethods{
    public static void main(String[] args) {

        System.out.println("Enter 1st array: ");
        int[] firstArr = populateArray();
        System.out.println("Enter 2nd array: ");
        int[] secondArr = populateArray();
        boolean Found = equals(firstArr, secondArr);
        if(Found == true) {
            System.out.println("Number exists");
        }
        else {
            System.out.println("Number does exist\n");
        }
    }

    public static int[] populateArray() {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        return arr;
    }

    public static boolean equals(int[] firstArr, int[] secondArr) {

        boolean isTrue = false;

        if(firstArr.equals(secondArr)) {
            isTrue = true;
        }
        else {
            isTrue = false;
        }

        return isTrue;
    }

}