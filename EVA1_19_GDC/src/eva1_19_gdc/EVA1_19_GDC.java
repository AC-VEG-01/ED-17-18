/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_gdc;

/**
 *
 * @author bisonte
 */
public class EVA1_19_GDC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("MAXIMO COMUN DIVISIOR DE 180 Y 48: " + maximoComun(180 ,48));
   
               
    }
    public static int maximoComun(int i ,int j){
        
        //////Como resuelvo.
        //////Llamada recursiva.
        //////Detener recursividad.
    
    int resuiduo=i%j;
        
    if (resuiduo>0){
        
        return maximoComun(j ,resuiduo); 
    }else{
            
    return j;  
    
    }
    
    
    

}
}

