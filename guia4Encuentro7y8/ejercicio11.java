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
public class ejercicio11 {
    public static void main(String[] args) {
        
        String frase;
        Scanner leer= new Scanner(System.in);
        
        System.out.println("ingrese una frase");
        frase=leer.next();
        
        frase=codificar(frase);
        
        System.out.println(frase);

        
        
    }

    public static String codificar(String frase) {
        int inicio=0;
    String palabra=frase.substring(inicio,inicio+1 );
       String nuevaFrase="";
    while(!palabra.equals(".")){
        switch (palabra) {
            case "a":{
                palabra="@";
                break;
            }
            case "e":{
                palabra="#";
                break;
            }
            case "i":{
                palabra="$";
                break;
            }
            case "o":{
                palabra="%";
                break;
            }
            case "u":{
                palabra="*";
                break;
            }
                
                
            default:{
            break;
            }
        }
        nuevaFrase=nuevaFrase.concat(palabra);
        inicio++;
        palabra=frase.substring(inicio,inicio+1 );
    }
    nuevaFrase=nuevaFrase.concat(".");
    return nuevaFrase;
    }
}
