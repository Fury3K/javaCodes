package ExerciseGroup2;
import java.util.Scanner;

public class methods {
    public static void main (String [] args){
        int firstInput;
        int secondInput;
        int temp;
        double tempD;

        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO CALCULATOR");
        System.out.println("Enter your first number: ");
        firstInput = sc.nextInt();
        System.out.println("Enter your second number: ");
        secondInput = sc.nextInt();

        double firstInputD = Double.valueOf(firstInput);
        double secondInputD = Double.valueOf(secondInput);

        temp = addTwoNumbers(firstInput, secondInput);
        System.out.println("The sum is " +temp);

        temp = subtractTwoNumbers(firstInput, secondInput);
        System.out.println("The difference is " +temp);

        temp = multiplyTwoNumbers(firstInput, secondInput);
        System.out.println("The product is " +temp);

        tempD = divideTwoNumbers(firstInputD, secondInputD);
        System.out.println("The quotient is " +tempD);
    }

    public static int addTwoNumbers( int firstInput, int secondInput){
        return firstInput + secondInput;
    }

    public static int subtractTwoNumbers( int firstInput, int secondInput){
        return firstInput - secondInput;
    }

    public static int multiplyTwoNumbers ( int firstInput, int secondInput){
        return firstInput * secondInput;
    }

    public static double divideTwoNumbers (double firstInputD, double secondInputD){
        return firstInputD / secondInputD;
    }


    
}
