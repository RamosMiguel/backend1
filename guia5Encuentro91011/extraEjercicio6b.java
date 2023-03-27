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
public class extraEjercicio6b {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[][] sopaDeLetras = new String[20][20];
        String palabra;
        int contador = 0, fila, columna, posicion = 0;

        /*CON ESTAS LINEAS DE CODIGO SE LLENA TODA LA MATRIZ CON NUMEROS DEL 0-9
        for (String[] filas : sopaDeLetras) {
            for (String elementos : filas) {
                elementos = String.valueOf((int) (Math.random() * 10));
                System.out.print(elementos + " ");
            }
            System.out.println("");
        }
        */

        System.out.println("Ingrese 5 palabras de 3-5 caracteres");
        do {
            System.out.print((contador+1) + "º: ");
            palabra = leer.next().toUpperCase();
            while (palabra.length() > 5 || palabra.length() < 3) {
                System.out.println("Ingrese otra palabra que corresponda a las caracteristicas pedidas");
                System.out.print((contador+1) + "º: ");
                palabra = leer.next().toUpperCase();
            }
            //ELECCION DE FILA Y COLUMNA AL AZAR
            fila = (int) (Math.random() * 15);
            columna = (int) (Math.random() * 15);
            //INGRESO DE PALABRA EN LA FILA Y COLUMNA SELECCIONADA AL AZAR
            for (int j = 0; j < 20; j++) {
                if(j < columna || j > ( columna + (palabra.length() - 1) ) ){
                    //SI NO ES DONDE SE DEBE UBICAR LA PALABRA INTRODUCIDA, SE RELLENA CON NUMEROS
                    sopaDeLetras[fila][j] = String.valueOf((int) (Math.random() * 10));
                }else{
                    //SE VA INGRESANDO LA PALABRA LETRA POR LETRA, CON AYUDA DE LA VARIABLE POSICION
                    sopaDeLetras[fila][j] = palabra.substring(posicion,posicion+1);
                    posicion++;
                }                
            } 
            //REINICIO DE LA VARIABLE POSICION PARA QUE LUEGO SE INGRESE LA SIGUIENTE PALABRA CORRECTAMENTE
            posicion = 0;           
            contador++;
        } while (contador < 5);
        
        //LLENAMOS LAS DEMAS FILAS Y COLUMNAS QUE NO TENGAN PALABRAS CON NUMEROS DEL 0-9
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                //AL ESTAR VACIAS LAS FILAS, TIENEN EL VALOR NULL
                if (sopaDeLetras[i][j] == null)
                    sopaDeLetras[i][j] = String.valueOf((int) (Math.random() * 10));
            }
        }

        //MOSTRAMOS LA MATRIZ RESULTANTE, CON LAS PALABRAS QUE INTRODUJIMOS
        System.out.println("---------------------------------------");
        for (String[] filas : sopaDeLetras) {
            for (String elementos : filas) {
                System.out.print(elementos + " ");
            }
            System.out.println("");
        }
        System.out.println("---------------------------------------");
    }
}
