/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_13_arreglos_multi;

/**
 *
 * @author Angel Vega
 */
public class EVA1_13_ARREGLOS_MULTI {
final static int FILAS=5;
final static int COL=3;
    
    public static void main(String[] args) {
        int[][] arreglo = new int[FILAS][COL];// 5 FILAS X 3 COLUMNAS =15 ENTEROS
       
        // ACCESO POR INDICES
        
        // PRIMERA POSICION
        
        arreglo[0][0]=100;
        
        //INTERMEDIA
        
        arreglo[3][1]=500;
        
        // ULTIMA POSICION

        arreglo[4][2]=1600;
        
        
        for(int i=0; i<FILAS; i++){ /// PRIMERA DIMENSION -->FILAS
         
            for(int j=0; j<COL; j++){ // SEGUNDA DIMENSION-->COLUMNAS
                
                arreglo[i][j] = (int) (Math.random()*100);
            
            }
            System.out.println();
        }
        
        // DOS DIMENSIONES --> DOS CICLOS PARA PODER RECORRER EL ARREGLO
        
        for(int i=0; i<FILAS; i++){ /// PRIMERA DIMENSION -->FILAS
         
            for(int j=0; j<COL; j++){ // SEGUNDA DIMENSION-->COLUMNAS
                
                System.out.print("["+ arreglo[i][j]+"]");
            
            }
            System.out.println();
            
        }
         System.out.println("Arreglo:" + arreglo);
         System.out.println("Arreglo[0]:"+ arreglo[0]);
         System.out.println("Arreglo[1]:"+ arreglo[1]);
         System.out.println("Arreglo[2]:"+ arreglo[2]);
         System.out.println("Arreglo[3]:"+ arreglo[3]);
         System.out.println("Arreglo[4]:"+ arreglo[4]);
    }
    
}
