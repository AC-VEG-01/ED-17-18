/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_23_numero_primo;

/**
 *
 * @author Angel Vega
 */
public class EVA1_23_NUMERO_PRIMO {

    public static void main(String[] args) {
    
   System.out.println("El numero 537 es primo?"+ esPrimoNoEficiente(29));
   System.out.println("El numero 537 es primo?"+ esPrimoEficiente(29));
   
    }
    
    public static boolean esPrimoNoEficiente(int numero){
      boolean esPrimo=true;
        
      for (int i=2; i<numero; i++){     
          
          if (numero%i == 0){
          
            esPrimo=false;
            break;
          }
      
       }
      
      return esPrimo; 
    }
    
    public static boolean esPrimoEficiente(int numero){
      boolean esPrimo=true;
             
      int limite = (int)Math.sqrt(numero);
              
      for (int i=2; i<limite; i++){     
          
          if (numero%i == 0){
          
            esPrimo=false;
            break;
          }
         
    }
    return esPrimo;
    }
}


