/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javapractice;

/**
 *
 * @author Nathan
 */
import java.util.Scanner;
class BankAccount{
    private double balance = 0.0;
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
}
class DepositAccount extends BankAccount{

}
class SavingsAccount extends BankAccount{
    
}

public class JavaPractice {

    public static void main(String[] args) {
        int choice;
        double depositAmount;
        double withdrawAmount;
        Scanner sc = new Scanner(System.in);
        DepositAccount objDeposit = new DepositAccount();
        SavingsAccount objSavings = new SavingsAccount();
        
        do{
        System.out.println("1 - Deposit");
        System.out.println("2 - Withdraw");
        System.out.println("3 - Balance Inquiry");
        System.out.println("4 - Exit");
        System.out.println("\nChoice: ");
        
        choice = sc.nextInt();
        
        switch(choice){
            case 1:
                System.out.println("\nEnter your deposit amount: ");
                while(!sc.hasNextDouble()){
                    System.out.println("Enter a number!");
                    sc.next();
                }
                depositAmount = sc.nextDouble();
                
                if(depositAmount < 500 ){
                    System.out.println("\nDeposit amount minimum is 500!\n");
                }
                else{
                    objDeposit.setBalance(objDeposit.getBalance()+ depositAmount);
                    objSavings.setBalance(objSavings.getBalance() + depositAmount);
                    System.out.println("\nDeposited!\n");
                }
                break;
                
            case 2: 
                System.out.println("\n Enter your withdraw amount");
                while(!sc.hasNextDouble()){
                    System.out.println("Enter a number!");
                    sc.next();
                }
                withdrawAmount = sc.nextDouble();
                
                if(withdrawAmount % 500 != 0){
                    System.out.println("\nWithdrawals must be divisible by 500s!\n");
                }
                else if(withdrawAmount > objSavings.getBalance()){
                    System.out.println("\nYou do not have enough funds!");
                }
                else{
                    objSavings.setBalance(objSavings.getBalance()- withdrawAmount);
                    System.out.println("Withdrawn " + withdrawAmount);
                }
                break;
                
            case 3:
                System.out.println("\nBalance: " +objSavings.getBalance());
                break;    
        }
        }while(choice != 4);
        
        
        
        
        
    }
}
