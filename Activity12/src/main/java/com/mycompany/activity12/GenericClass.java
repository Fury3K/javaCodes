/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.activity12;

/**
 *
 * @author L12X17W33
 */
public class GenericClass <T>{
    private T data;
    
    public void setData(T data){
        this.data=data;
    }
    public T getData(){
        return data;
    }
}
