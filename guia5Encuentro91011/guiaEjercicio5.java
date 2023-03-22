/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5Encuentro91011;

import java.util.Scanner;

/**
 *
 * @author Mininos
 */
public class guiaEjercicio5 {
    public static void main(String[] args) {
        int dim=3;
        int[][] matriz= new  int[dim][dim];
        
        //rellenarAutomatico(matriz,dim);
        rellenarMatriz(matriz,dim);
        
        mostarMatriz(matriz,dim);
        
        if(esAntisimetrica(matriz,dim)){
            System.out.println("es una matriz anticimetrica");
        }else{
            System.out.println("no es una matriz anticimetrica");
       
        }
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

    private static boolean esAntisimetrica(int[][] matriz, int dim) {
        boolean bandera=true;
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                if(i!=j){
                    if(matriz[i][j]!=(matriz[j][i])*(-1)){
                        bandera=false;
                        break;
                    }
                    
                }
                
            }
          
        }
        
        return bandera;
    }

    private static void rellenarMatriz(int[][] matriz, int dim) {
       Scanner leer= new Scanner(System.in);
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                matriz[i][j]=leer.nextInt();
                
            }
        }
    
    
    }
    
    
}
