/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4Encuentro7y8;

import java.util.Scanner;

/**
 *
 * @author Mininos
 */
public class NewClass {
    public static void main(String[] args) {
        int num1,num2,op;
        Scanner leer = new Scanner(System.in);
        
         System.out.println("ingrese dos numero");
         num1= leer.nextInt();
         num2= leer.nextInt();
        do{
            System.out.println("elija una opcion");
            System.out.println("1-sumar");
            System.out.println("2-restar");
            System.out.println("3-multiplicar");
            System.out.println("4-dividir");
            System.out.println("5-salir");
            
            op=leer.nextInt();
            
            switch (op) {
                case 1:{
                    System.out.println("la suma de lso numeros es "+sumar(num1,num2) );
                    break;
                }
                
                case 2:{
                    System.out.println("la suma de lso numeros es "+restar(num1,num2) );
                    break;
                }
                case 3:{
                    System.out.println("la suma de lso numeros es "+multiplicar(num1,num2) );
                    break;
                }
                case 4:{
                     System.out.println("la suma de lso numeros es "+dividir(num1,num2) );
                    break;
                }
                case 5:{
                    System.out.println("fin del programa");
                   break;
                }
                
                default:{
                    System.out.println("la opcion que ingreso es incorrecta");
                 break;} 
            }
            
        }while(op!=5);
    }

    public static int sumar(int num1, int num2) {
        return num1+num2;
    }

    private static int restar(int num1, int num2) {
        return num1-num2;
    }

    private static int multiplicar(int num1, int num2) {
       return num1*num2;
    }

    private static int dividir(int num1, int num2) {
        return num1/num2;
    }
}
