/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_11_arreglo_objectos;

/**
 *
 * @author Angel Vega
 */
public class EVA1_11_ARREGLO_OBJECTOS {

    public static void main(String[] args) {
      
        Ejemplo[] arreglo=new Ejemplo [2];
        System.out.println(arreglo);
        //arreglo.---> nos permite acceder al arreglo.
        //Creamos cada obj
        arreglo[0]=new Ejemplo();
        arreglo[1]=new Ejemplo();
        
        System.out.println(arreglo[0]);
        System.out.println(arreglo[1]);
        System.out.println(arreglo[0].val);
        System.out.println(arreglo[1].val);
        // arreglo[0].val=10;
        
           }
}
    
    
    class Ejemplo{
    
     int val=5;    
    
    }


