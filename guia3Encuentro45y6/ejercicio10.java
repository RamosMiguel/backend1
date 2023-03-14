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
public class ejercicio10 {
    public static void main(String[] args) {
        int num;
           Scanner leer= new Scanner (System.in);
           
          
          for(int i=0;i<4;i++){
              num=leer.nextInt();
              for(int j=0;j<num;j++){
              System.err.print("*");
              
              }
              
              System.err.println("");
              
          }
           
        
    }
}
