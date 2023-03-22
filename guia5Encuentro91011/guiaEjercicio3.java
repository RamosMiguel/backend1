/*
 Recorrer un vector de N enteros contabilizando cuántos
números son de 1 dígito, cuántos de 2 dígitos, etcétera 
(hasta 5 dígitos).
 */
package backend1.guia5Encuentro91011;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class guiaEjercicio3 {
    public static void main(String[] args) {
         Scanner leer= new Scanner(System.in);
        System.out.println("ingrese la dimencion del vector");
         int[] vector= new int[leer.nextInt()];
         
        llenarAutomatico(vector);
         
        clasificar(vector);
    }
    
    
    
    private static void llenarAutomatico(int[] vector) {
        for (int i=0;i<vector.length;i++) {
            vector[i]=(int)(Math.random()*99999+1);
        }
        for (int i = 0; i <vector.length; i++) {
            System.out.println( vector[i]);
        }
        
    }

    private static void clasificar(int[] vector) {
        int cifras;
        int[] contador=new int[5]; 
        for (int i = 0; i < vector.length;i++){
            cifras=cantCifras(vector[i]);
            contador[cifras-1]+=1;
        }
        
        for(int i=0;i<contador.length;i++){
            System.out.println("elementos de "+(i+1)+" cifras "+contador[i]);
        }
    
    }

    private static int cantCifras(int num) {
        int cont=1;
        while(num>10){
            num/=10;
            cont++;
        }
        
        return cont;
    }
}
