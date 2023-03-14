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
public class ejercicio9 {
    public static void main(String[] args) {
        int num,suma=0;
        Scanner leer= new Scanner (System.in);
         
        do{
        
            System.out.println("ingrese un numero");
            num=leer.nextInt();
            if(num>0){
            suma=suma+num;
            }
        
        }while(num!=0);
        System.out.println("se capturo un 0");
        System.out.println("la suma de los numero es: "+suma);
    }
 
}
