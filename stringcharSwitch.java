package ExerciseGroup2;
import java.util.Scanner;

public class stringcharSwitch {
    public static void main (String [] args){
        double firstInputD;
        double secondInputD; 
        double tempD;
        char operation;


        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO CALCULATOR");
        System.out.println("Enter your first number: ");
        firstInputD = sc.nextInt();
        System.out.println("Enter the operation / operator: ");
        operation = sc.next().charAt(0);
        System.out.println("Enter your second number: ");
        secondInputD = sc.nextInt();


        if(operation == '+'){
        tempD = addTwoNumbers(firstInputD, secondInputD);
        System.out.println("The sum is " +tempD);
        }

        else if(operation == '-'){
        tempD = subtractTwoNumbers(firstInputD, secondInputD);
        System.out.println("The difference is " +tempD);
        }

        else if(operation == '*'){
        tempD = multiplyTwoNumbers(firstInputD, secondInputD);
        System.out.println("The product is " +tempD);
        }

        else if(operation == '/'){
        tempD = divideTwoNumbers(firstInputD, secondInputD);
        System.out.println("The quotient is " +tempD);
        }

        else{
            System.out.println("Invalid operation/operator!");
        }
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
    

