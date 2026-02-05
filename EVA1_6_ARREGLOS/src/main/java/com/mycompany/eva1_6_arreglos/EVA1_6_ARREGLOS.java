/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_6_arreglos;

/**
 *
 * @author Angel Vega
 */
public class EVA1_6_ARREGLOS {

    public static void main(String[] args) {
      /// String[] cade1, cade2 , cade 3: --> Todos son arreglos
        /// String cade1, cade2[], cade3; --> Solo cade2 es arreglo
        
        int [] datos= new int[10];
        
        //Mensaje de indices
        
        System.out.println(datos);
        datos[0]=100;
        datos[1]=200;
        datos[2]=300;
        datos[9]=1000;
      /// Posicion no existe (la ultima es 9)
        System.out.println("Valor en posicion 0 = " + datos[0]);
            
    }
    
}
//// ARREGLOS:  Son objetos Son inmutables (No úeden cambair de tamaño) -Datos se almacenan secuencialmente -Son de acceso aleatorio -Manejo de indices