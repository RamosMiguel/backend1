/*
 Implementar un programa que le pida dos números enteros al 
usuario y determine si ambos o alguno de ellos es mayor a 25.
 */
package guia3Encuentro45y6;

import java.util.Scanner;

/**
 *
 * @author Mininos
 */
public class ejercicio6 {
    public static void main(String[] args) {
        int num1,num2;
        Scanner leer= new Scanner (System.in);
        
        System.out.println("ingresde un numero");
        num1= leer.nextInt();
        System.out.println("ingresde otro numero");
        num2= leer.nextInt();
        
        if(num1>25 && num2>25){
            System.out.println("ambos numero son mayores a 25");
        }else if(num1>25){
            System.out.println("el primer numero es mayor a 25");
        }else if(num2>25){
            System.out.println("el segundo numero es mayor a 25");
        }else{
            System.out.println("ningun numero es mayor a 25");
        }
    }
}
