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
public class extraEjercicio7 {
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese el tamaño del vector: ");
        
        int n=leer.nextInt();
        System.out.println("la sucesion de fibonacci es ");
        if(n<=0){
            System.out.print(1);
            System.out.println("");
        }else{
        int[] vector= new int[n];
        int n1=0, n2=1,suma;
         vector[0]=1;
        for (int i = 1; i < n; i++) {
            suma=n1+n2;
            vector[i]=suma;
            n1=n2;
            n2=suma;       
        } 
        
            for (int i = 0; i < n; i++) {
                System.out.print(vector[i]+" - ");  
            }
            System.out.println("");
        }
        
    }
    }
    

