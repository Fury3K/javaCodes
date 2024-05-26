/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activity12;

/**
 *
 * @author L12X17W33
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class Activity12 {

    public static void main(String[] args) {
        GenericClass<Integer> intobj=new GenericClass<>();
        GenericClass<Double> doubleobj=new GenericClass<>();
        
        Scanner sc=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("#,###.00");
        
        do{
        try{
             System.out.print("Enter integer value: ");
             int i=sc.nextInt();
             intobj.setData(i);
        
             System.out.println("Generic Class returns: "+intobj.getData());
             break;
        }catch(Exception e){
            System.out.println("invalid only put the correct data type"+e);
            sc.next();
        }
        }while(true);
          do{
        try{
             System.out.print("Enter Double value: ");
             double d=sc.nextDouble();
             doubleobj.setData(d);
        
             System.out.println("Generic Class returns: "+df.format(doubleobj.getData()));
break;
        }catch(Exception e){
            System.out.println("invalid only put the correct data type"+e);
            sc.next();
        }
        }while(true);
    }
}
