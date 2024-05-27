package ExerciseGroup2;

import java.util.Scanner;

public class calculator_v4 {
        public static void main (String [] args){
            double firstInputD = Double.parseDouble(args[0]);
            double secondInputD =  Double.parseDouble(args[2]);
            String temp = args[1];
            double result = 0;

    
            switch(temp) {
                case "+": {
                    result = addTwoNumbers(firstInputD, secondInputD);
                    break;
                }
                case "-": {
                    result = subtractTwoNumbers(firstInputD, secondInputD);
                    break;
                }
                case "*": {
                    result = multiplyTwoNumbers(firstInputD, secondInputD);
                    break;
                }
                case "/": {
                    result = divideTwoNumbers(firstInputD, secondInputD);
                    break;
                }
                default: {
                    System.out.println("Invalid Input");
                }
            }
            System.out.println("Result = "+ result);
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
    
    
}
