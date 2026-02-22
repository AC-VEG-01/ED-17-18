/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_16_califas;

import java.util.Scanner;

/**
 *
 * @author Angel Vega
 */
public class EVA1_16_CALIFAS {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int[][]grupos;
        System.out.println("¿Cuantos grupos tiene la escuela?");
        int cant = input.nextInt();
        grupos= new int [cant][];
        
        for(int i=0; i< grupos.length; i++){
          System.out.println("¿Cuantos estudiantes tiene el grupo"+ (i+1)+"?");
          int estudiantes=input.nextInt();
          grupos[i]=new int[estudiantes];
        }
        ///Capturar calificaciones:
       for(int i=0; i< grupos.length; i++){
          System.out.println("+++++++++GRUPO"+ (i+1)+"+++++++++++++");
          for(int j=0; j< grupos[i].length; j++){
          System.out.println("Calificacion del estudiante "+(j+1)+":");
          int califa =input.nextInt();
          grupos[i][j]=califa;
          input.nextLine();
         
        }
        
        }
       ////IMPRIMIR CALIFICACIONES
    
         for(int i=0; i< grupos.length; i++){
             System.out.println("+++++++++CALIFICACIONES DEL GRUPO"+ (i+1)+"+++++++++++++");
            
            for(int j=0; j< grupos[i].length; j++){
                System.out.println("Calificacion del estudiante "+(j+1)+":"+grupos[i][j]);
      
            }
           
        }
         ////////// IMPRIMIR PROMEDIO
          for(int i=0; i< grupos.length; i++){
             System.out.println("+++++++++PROMEDIO DEL GRUPO "+ (i+1)+"+++++++++++++");
             double promedio=0;
             double total=0;
            
             for(int j=0; j< grupos[i].length; j++){
                total=grupos[i].length;
                promedio+=grupos[i][j];
                
                if (j==grupos[i].length-1){
                 System.out.println("GRUPO "+(i+1)+": "+promedio/total);
                
                }
             }
           
        }
    }
}
    

          
    


