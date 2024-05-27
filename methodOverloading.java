package ExerciseGroup2;

import java.util.Scanner;

public class methodOverloading {
        public static void main (String [] args){
            double firstInputD;
            double secondInputD; 
            double tempD;

    
            Scanner sc = new Scanner(System.in);
            System.out.println("WELCOME TO CALCULATOR");
            System.out.println("Enter your first number: ");
            firstInputD = sc.nextInt();
            System.out.println("Enter your second number: ");
            secondInputD = sc.nextInt();

            tempD = addTwoNumbers(firstInputD, secondInputD);
            System.out.println("The sum is " +tempD);
    
            tempD = subtractTwoNumbers(firstInputD, secondInputD);
            System.out.println("The difference is " +tempD);
    
            tempD = multiplyTwoNumbers(firstInputD, secondInputD);
            System.out.println("The product is " +tempD);
    
            tempD = divideTwoNumbers(firstInputD, secondInputD);
            System.out.println("The quotient is " +tempD);
        }
    
        public static double addTwoNumbers( double firstInputD, double secondInputD){
            return firstInputD + secondInputD;
        }
    
        public static double subtractTwoNumbers( double firstInputD, double secondInputD){
            return firstInputD - secondInputD;
        }
    
        public static double multiplyTwoNumbers ( double firstInputD, double secondInputD){
            return firstInputD * secondInputD;
        }
    
        public static double divideTwoNumbers (double firstInputD, double secondInputD){
            return firstInputD / secondInputD;
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
    
        public static double divideTwoNumbers (int firstInputD, int secondInputD){
            return firstInputD / secondInputD;
        }
    
    
    
}
