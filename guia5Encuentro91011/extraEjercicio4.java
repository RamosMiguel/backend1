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
public class extraEjercicio4 {
    public static void main(String[] args) {
        int m=10,n=8;
        int [][] matriz= new int [m][n];
        
        rellenar(matriz);
        mostarMatriz(matriz);
        sumar(matriz);
        
    }

    private static void rellenar(int[][] matriz) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8 ;j++) {
                matriz[i][j]=(int)(Math.random()*10+1);
            }
        }
    }

    private static void sumar(int[][] matriz) {
        int suma=0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
               suma+= matriz[i][j];
            }
        }
        System.out.println("la suma de la matriz es "+suma);
    }

    private static void mostarMatriz(int[][] matriz) {
       for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(" "+ matriz[i][j]+" ");
            }
             System.out.println(" ");
        }
    
    }
}
