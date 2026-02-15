/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_inmutable;

/**
 *
 * @author eveli
 */
public class EVA1_9_INMUTABLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int[] datos = new int[5];
      
      for(int i = 0; i < datos.length; i++){
          datos[i] = (int)(Math.random()* 100);
    }
      datos =new int[3];
      System.out.print("Cambiar el tamaño del arreglo a 3:"); 
      for(int i = 0; i < datos.length; i++){
          System.out.print("[" + datos[i] + "]");
      } 
      System.out.print("");
    } 
}
    
