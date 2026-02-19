/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_15_arreglos_multi;

/**
 *
 * @author Angel Vega
 */
public class EVA1_15_ARREGLOS_MULTI {

    public static void main(String[] args) {
        int [][] matriz = new int [3][];
        
        //Tenemos 3 filas(No he especidicado cuantas columnas)
        matriz[0] = new int[5]; ///Estoy creando, dentro de matriz[0] un arreglo de 5 enteros
        matriz[1] = new int[2]; 
        matriz[2] = new int[4]; 
        
        for (int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){   
                matriz[i][j]=(int) (Math.random()*100);
            
            }
        }
        
         for (int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){   
               System.out.print("["+ matriz[i][j]+"]");
            
            }
            System.out.println("");
        }
    }
}
