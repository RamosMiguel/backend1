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
public class guiaEjercicio4 {
    public static void main(String[] args) {
        String frase,letra;
        Scanner leer= new Scanner (System.in);
        
        
        
        System.err.println("ingrese una palabra o frase");
        frase=leer.nextLine();
        letra=frase.substring(0, 1);
        
        if(letra.equalsIgnoreCase("a")){
            System.out.println("correcto");
        }else{
            System.out.println("incorrecto");
        }
        
        
        
        
        
        
    }
    
}
