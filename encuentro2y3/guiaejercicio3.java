/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encuentro2y3;

import java.util.Scanner;

/**
 *
 * @author caro
 */
public class guiaejercicio3 {
    public static void main(String[] args) {
       /* Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
*/
       Scanner leer = new Scanner(System.in) ;
       String frase ;
        System.out.println("ingrese una frase");
        frase = leer.nextLine();
        frase = frase.toUpperCase();
        System.out.println( frase );
        frase = frase.toLowerCase();
        System.out.println( frase );       

    }
}
