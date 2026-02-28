/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_22_fibonacci;

/**
 *
 * @author Angel Vega
 */
public class EVA1_22_FIBONACCI {

    public static void main(String[] args) {
        System.out.println("Fibonnaci en posicion de 8:" + fibonacci(8));
 
    }
    public static int fibonacci(int i){
          if (i <=1) {
            return i;
        }
        return fibonacci(i - 1) + fibonacci(i - 2); 
    }
    }
