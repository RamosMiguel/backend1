/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los números
introducidos supere el límite inicial.

 */
package guia3Encuentro45y6;

import java.util.Scanner;

/**
 *
 * @author Mininos
 */
public class guiaEjercicio5 {
    public static void main(String[] args) {
        
        int limite,suma=0,numero;
        Scanner leer= new Scanner (System.in);
        
        System.out.println("por favolr in grese un numero limite");
        limite= leer.nextInt();
        
        do{
            System.out.println("ingrese un numero");
            numero=leer.nextInt();
            suma=suma+numero;
            
        }while(suma<limite);
        
        System.out.println(suma);
        
        
    }
}
