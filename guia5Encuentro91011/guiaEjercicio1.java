/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend1.guia5Encuentro91011;

/**
 *
 * @author Miguel
 */
public class guiaEjercicio1 {
    public static void main(String[] args) {
        int[] vector= new int[100];
        
        llenar(vector);
        
        mostrar(vector);
        
        
    }

    private static void llenar(int[] vector) {
        int cont=1;
         
        for (int i = 0; i < vector.length; i++) {
            vector[i]=i+1;
        }
 
    
    
    }

    private static void mostrar(int[] vector) {
        
        for (int i = vector.length-1; i >=0; i--) {
            System.out.println(vector[i]);
        }
    
    }
}
