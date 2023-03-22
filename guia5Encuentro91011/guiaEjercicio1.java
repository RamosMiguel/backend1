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
public class guiaEjercicio1 {
    public static void main(String[] args) {
        int[] lista= new int[100];
        
        rellenar(lista);
        
        mostrar(lista);
        
    }

    private static void rellenar(int[] lista) {
       int tam=lista.length;
        System.out.println(tam);
        for (int i = 0; i < tam; i++) {
            lista[i]=i;
        }
    
    }

    private static void mostrar(int[] lista) {
        int tam=lista.length;
        
        for (int i = tam-1; i > 0; i--) {
             System.out.println(lista[i]);
        }
    
    }
}
