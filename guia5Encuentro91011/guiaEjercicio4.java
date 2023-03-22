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
public class guiaEjercicio4 {
    public static void main(String[] args) {
        int dim=3;
        int[][] matriz= new  int[dim][dim];
        
        rellenarAutomatico(matriz,dim);
        
        mostarMatriz(matriz,dim);
        
        mostrarTranspuesta(matriz,dim);
    }

    private static void rellenarAutomatico(int[][] matriz, int dim) {
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                matriz[i][j]=(int)(Math.random()*10);
                
            }
        }
    }

    private static void mostarMatriz(int[][] matriz,int dim) {
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                System.out.print(" "+matriz[i][j]+" ");
                
            }
            System.out.println(" ");
        }
        
    }

    private static void mostrarTranspuesta(int[][] matriz, int dim) {
        System.out.println(" ");
        System.out.println("matriz transpuesta");
        System.out.println(" ");
        
        for (int j = 0; j < dim; j++) {
            for (int i = 0; i < dim; i++) {
                System.out.print(" "+matriz[i][j]+" ");
                
            }
            System.out.println(" ");
        }
    
    }
}
