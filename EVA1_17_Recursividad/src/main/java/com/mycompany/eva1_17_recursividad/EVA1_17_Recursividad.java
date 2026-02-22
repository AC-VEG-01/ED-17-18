/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_17_recursividad;

/**
 *
 * @author Angel Vega
 */
public class EVA1_17_Recursividad {

    public static void main(String[] args) {
     imprimirLista(5);
     System.out.println();
     imprimirListaRec(5);
       System.out.println();
     imprimirListaRecUp(1,5);
    }
    
    public static void imprimirLista(int val) {
          for (int i =val; i>0; i--){
           
            System.out.print(i+" - ");
        }
    }
    public static void imprimirListaUP(int val) {
      for (int i =val; i<=0; i++){
          
            System.out.print(i+" - ");
        }
    }
    
       
   public static void imprimirListaRec(int val) {
     ///Seccion que resuelve el problema.
        System.out.print(val+" - ");
        
     ///Llamada recursiva: el metodo se invoca a si .   
       if (val>1)  
       imprimirListaRec(val-1);
    ///Detener recursividad.    
     }
   
      public static void imprimirListaRecUp(int ini,int val) {
     ///Seccion que resuelve el problema.
        System.out.print(ini+" - ");
        
     ///Llamada recursiva: el metodo se invoca a si .   
       if (ini<val)  {
       imprimirListaRecUp(ini+1,val);
    ///Detener recursividad.    
     }
    
      }
}


