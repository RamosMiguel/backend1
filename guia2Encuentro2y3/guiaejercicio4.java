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
public class guiaejercicio4 {
    public static void main(String[] args) {
        
    
    /*Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).
*/
    Scanner leer = new Scanner (System.in);
    int grados;
    System.out.println("ingrese grados centigrados");
    grados =leer.nextInt();
    //int f;
    //f= 32+ (9 * grados / 5);
    //System.out.println(f)
        System.out.println(32+ (9 * grados / 5));
}
}