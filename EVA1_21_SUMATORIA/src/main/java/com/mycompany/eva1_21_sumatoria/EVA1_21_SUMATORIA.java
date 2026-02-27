/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_21_sumatoria;

/**
 *
 * @author Angel Vega
 */
public class EVA1_21_SUMATORIA {

    public static void main(String[] args) {
         System.out.println("Sumatoria de 5 : "+sumatoria(5));
    }
    
    public static int sumatoria(int i ){
        
        if (i==0){
            
           return i; 
        }
       
        return i+sumatoria(i-1);
    }
}
