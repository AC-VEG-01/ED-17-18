/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_4_referencias;

/**
 *
 * @author Angel Vega
 */
public class EVA1_4_REFERENCIAS {

    public static void main(String[] args) {
        Prueba prueba= new Prueba(); /// CREANDO UNA INSTANCIA DE PRUEBA
        int x=100;
        System.out.println(x);
        System.out.println(prueba);
        //En java, una variable que guarda en una direccion (Memoria) se llama REFERENCIA.
        /// En otros lenguajes---> Apuntadores
        prueba=null;
        /// Esto solo desconecta la varible de la memeoria  
    }
}
    class Prueba{
    int y= 200;        
    }

/// @ ---> at
///Objeto de tipo prueba
///APUNTADOR --> Direccion REAL de memoria RAM.
///REFERENCIA --> Direccion "Ficticia" de la memoria RAM.
///JVM--> Java Virtual Machine.    
//// ¿Como elimino un objeto de java?.  /// Garbage Colector