/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5Encuentro91011;

/**
 *
 * @author Mininos
 */
public class extraEjercicio3 {
    public static void main(String[] args) {
        int dim=5;
        int[] vector= new int[dim];
        
        rellenar(vector);
        
        mostrarVector(vector);
        
        
    }

    private static void rellenar(int[] vector) {
        
        for (int i = 0; i < vector.length; i++) {
            vector[i]=(int)(Math.random()*10+1);
        }
    }

    private static void mostrarVector(int[] vector) {
        for(int num:vector){
            System.out.println(num);
        }
    
    }
}
