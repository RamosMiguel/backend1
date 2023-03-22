/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4Encuentro7y8;

import java.util.Scanner;

/**
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
* las personas ingresadas por teclado e indique si son mayores o menores de edad. 
* Después de cada persona, el programa debe preguntarle al usuario si quiere seguir 
* mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
public class guiaEjercicio2 {
    public static void main(String[] args) {
        String nombre,op;
        int edad;
         Scanner leer = new Scanner(System.in);
        
        do{
            System.out.println("ingrese un nombre");
            nombre= leer.next();
            
            System.out.println("ingrese la edad");
            edad= leer.nextInt();
            
            System.out.println(nombre);
            if(edad>=18){
                System.out.println("es mayor de edad");
            }else{
                System.out.println("es menor de edad");
            }
            
            System.out.println("desea seguir ingresando datos? si/no");
            op= leer.next();
        
        }while(!op.equals("no"));
        
        System.out.println("GRACIAS POR USAR ESTE PROGRAMA");
        
    }
}
