/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_12_copia_arreglos;

/**
 *
 * @author Angel Vega
 */
public class EVA1_12_COPIA_ARREGLOS {

public static void main(String[] args) {
      
        Ejemplo[] arreglo=new Ejemplo [2];
        System.out.println("Arreglo="+arreglo);
        //arreglo.---> nos permite acceder al arreglo.
        //Creamos cada obj
        arreglo[0]=new Ejemplo();
        arreglo[1]=new Ejemplo();
        
        System.out.println("Arreglo[0]="+arreglo[0]);
        System.out.println("Arreglo[1]="+arreglo[1]);
        System.out.println("Arreglo[0]="+arreglo[0].val);
        System.out.println("Arreglo[1]="+arreglo[1].val);
          
       // Ejemplo[] copia= arreglo; // NO FUNCIONA, SOLO DUPLICA LA DIRECCION.
    
        Ejemplo[]copia=new Ejemplo[2];
        
        //Posicion por posicion copiar un arreglo al otro:
        
        //copia[0]= arreglo[0];
        //copia[1]= arreglo[1];
        copia[0]=new  Ejemplo();
        copia[1]=new  Ejemplo();
        //Ahora si, hay que trasnferir la info de un objeto a otro (siempre y cuando esa info no sean objetos tambien)
        copia[0].val=arreglo[0].val;
        copia[1].val=arreglo[1].val;
         System.out.println("Copia="+copia);
         System.out.println("Copia[0]="+copia[0]);
         System.out.println("Copia[1]="+copia[1]);
        
           }

}
    
    
    class Ejemplo{
    
     int val=5;    
    
    }