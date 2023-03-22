/*
Realizar un algoritmo que llene un vector de tamaño N con valores 
aleatorios y le pida al usuario un número a buscar en el vector. 
El programa mostrará dónde se encuentra el numero y si se encuentra
repetido
 */
package backend1.guia5Encuentro91011;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class guiaEjercicio2 {
    public static void main(String[] args) {
        int num;
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese la dimencion del vector");
         int[] vector= new int[leer.nextInt()];
         
         llenarAutomatico(vector);
         
         System.out.println("ingrese el numero que desea buscar");
         num= leer.nextInt();
         
         buscarNumero(vector,num);
         
         
         
    }

   private static void llenarAutomatico(int[] vector) {
        for (int i=0;i<vector.length;i++) {
            vector[i]=(int)(Math.random()*10+1);
        }
        
    } 

    private static void buscarNumero(int[] vector, int num) {
        boolean bandera=false;
        System.out.println("iniciando busqueda ");
        for (int i=0;i<vector.length;i++) {
            if(vector[i]==num){
                System.out.println("el numero esta en la posicion: "+i);
                bandera=true;
            }
        }
        
        if(!bandera){
             System.out.println("el numero no esta en la lista " );
                
        }
    
    
    
    }
    
}
