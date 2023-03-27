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
public class guiaEjercicio1 {
    public static void main(String[] args) {
        int num;
        Scanner leer= new Scanner (System.in);
        
        System.out.println("ingrese un numero");
        num=leer.nextInt();
        
        if(num % 2==0){
            System.out.println("el numero ingresado es par");
        }else{
            System.out.println("el numero ingresado es impar");
        }
    }
}
