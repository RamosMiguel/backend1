/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2Encuentro2y3;

import java.util.Scanner;

/**
 *
 * @author caro
 */
public class guiaejercicio2 {
    public static void main(String[] args) {
      /*  Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla.
*/
      Scanner leer = new Scanner(System.in);
       String nombre ;
        System.out.println("ingrese su nombre");
        nombre = leer.next() ;
        System.out.println( "su nombre es : "+ nombre);
        
                    
    }
    
}
