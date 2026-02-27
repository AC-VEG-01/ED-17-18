/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_20_potencia;

/**
 *
 * @author bisonte
 */
public class EVA1_20_POTENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Potencia de 2 elevado al cubo : "+elevarPotencia(2,3));
    }
    
    public static int elevarPotencia(int i,int j){
        
        if (j==1){
            
          return i;
         
        
        }
         return i * elevarPotencia(i,j-1);
          
    }
    
}
