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
public class ejercicioGuia8 {
    public static void main(String[] args) {
        
   
      Scanner leer = new Scanner(System.in);
               int columna;
               int filas;
               int num;
               System.out.println("Escribe un numero:");
               num=leer.nextInt();
               for (columna=1;columna<=num;columna++) {
                   for (filas=1;filas<=num;filas++) {
                       if ((columna>1) && (columna<num) && (filas>1) && (filas<num)) {
                           System.out.print(" ");
                       } else {
                           System.out.print("*");
				}
			}
			
			System.out.println("");
		}
		 System.out.print("");
	}
 }

