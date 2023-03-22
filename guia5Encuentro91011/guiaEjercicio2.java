/*
Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios 
y le pida al usuario un número a buscar en el vector. El programa mostrará 
dónde se encuentra el numero y si se encuentra repetido
 */
package guia5Encuentro91011;

import java.util.Scanner;

/**
 *
 * @author Mininos
 */
public class guiaEjercicio2 {
    public static void main(String[] args) {
        int n,num;
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese un numero");
        n=leer.nextInt();
        
        int[] vector= new int[n];
        
        llenar(vector);
        
        System.out.println("ingrese el numero que desea buscar ");
        num=leer.nextInt();
        
        buscar(vector,num);
        
    }

    private static void llenar(int[] vector) {
        int tam=vector.length;
         for (int i = 0; i < tam; i++) {
            vector[i]=(int)Math.random()*10+1;
        }
    
    }

     private static void buscar(int[] vector, int num) {
        boolean resp= false;
        
        System.out.println("Buscando numero... ");
        
        for (int i = 0; i < vector.length; i++) {
            
            if (vector[i] == num) {
                System.out.println("esta en la posicion: (" + i +")");
                resp = true;
            } 
        } 
        
         if (! resp){
             System.out.println("no se ha encontrado");
         }
        
    }

    private static void mostrar(int[] vector) {
        for (int num : vector) {
            System.out.println(num);
        }
    }
}
