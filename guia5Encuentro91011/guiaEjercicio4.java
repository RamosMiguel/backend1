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
public class guiaEjercicio4 {
    public static void main(String[] args) {
        int[][] matriz= new int[3][3];
        
        
        llenarAutomatico(matriz);
        
        mostrarMatriz(matriz);
        
        trasponerMatriz(matriz);
        
        mostrarMatriz(matriz);
    }

    private static void llenarAutomatico(int[][] matriz) {
        for (int[] vector:matriz) {
            for (int j = 0; j < vector.length; j++) {
                vector[j]=(int)(Math.random()*10);
                
                
            }
 
        }
    }

    private static void mostrarMatriz(int[][] matriz) {
        for (int[] vector:matriz) {
            for (int j = 0; j < vector.length; j++) {
                System.out.print(" "+ vector[j] +" ");
                
                
            }
            System.out.println("");
        }
        
    }

    private static void trasponerMatriz(int[][] matriz) {
        for (int[] vector:matriz) {
            for (int j = 0; j < vector.length; j++) {
                System.out.print(" "+ vector[j] +" ");
                
                
            }
            System.out.println("");
        }
    
    }
    
    
    
}
