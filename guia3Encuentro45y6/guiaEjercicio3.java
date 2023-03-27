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
public class guiaEjercicio3 {
    public static void main(String[] args) {
        String frase;
        Scanner leer= new Scanner (System.in);
        
        System.out.println("ingrese una frase de 8 caracteres");
        frase= leer.nextLine();
        
        if(frase.length()==8){
            System.out.println("correcto");
        }else{
            System.out.println("incorrecto");
        }
        
        
        
        
    }
}
