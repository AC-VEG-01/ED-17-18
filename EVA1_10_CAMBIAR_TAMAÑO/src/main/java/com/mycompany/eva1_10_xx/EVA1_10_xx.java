/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_10_xx;

/**
 *
 * @author Angel Vega
 */
public class EVA1_10_xx {
  
       
        
     
            
    public static void main(String[] args) {
        
         int[] datos= new int[5];//---> 4 Gigas
         int[] aux=new int[3];
           
         for(int i=0; i < datos.length; i++){
            
            datos[i]= (int)(Math.random()* 100);
           
        }
         
         for(int i=0; i < aux.length; i++){
            
            aux[i]=datos[i];
           
        }
         
         for(int i=0; i < aux.length; i++){
            datos=aux;
            System.out.print("[ "+datos[i]+" ]");
     
           
         }
    }
}


