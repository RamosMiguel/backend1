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
public class ejercicio14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String equipo[] = new String[12];
        
        for (int i = 0; i < 12; i++) {
            equipo[i]=leer.next();
        }
        System.out.println("mi equipo");
        for (int i = 0; i < 12; i++) {
            System.out.println( equipo[i]); 
        }
        
    }
}
