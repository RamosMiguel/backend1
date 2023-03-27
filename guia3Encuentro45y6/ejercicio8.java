/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3Encuentro45y6;

import java.util.Scanner;

/**
 *
 * @author Mininos
 */
public class ejercicio8 {
    public static void main(String[] args) {
        int nota;
        Scanner leer= new Scanner (System.in);
        
        
        do{
            
        System.out.println("ingrese una nota");
        nota=leer.nextInt();
        
        }while (nota<0 || nota>10);
    }
}
