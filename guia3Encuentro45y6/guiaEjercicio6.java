/*
Realizar un programa que pida dos números enteros 
positivos por teclado y muestre por pantalla el 
siguiente menú:El usuario deberá elegir una opción y el
programa deberá mostrar el resultado por pantalla y luego 
volver al menú. El programa deberá ejecutarse hasta que se
elija la opción 5. Tener en cuenta que, si el usuario 
selecciona la opción 5, en vez de salir del programa 
directamente, se debe mostrar el siguiente mensaje de 
confirmación: ¿Está seguro que desea salir del programa (S/N)? 
Si el usuario selecciona el carácter ‘S’ se sale del programa,
caso contrario se vuelve a mostrar el menú.

 */
package guia3Encuentro45y6;

import java.util.Scanner;

/**
 *
 * @author Mininos
 */
public class guiaEjercicio6 {
    public static void main(String[] args) {
        int num1,num2,op;
        String salida="";
        Scanner leer= new Scanner (System.in);
        
        System.out.println("ingrese dos numeros");
        num1= leer.nextInt();
        num2= leer.nextInt();
        
        do{
        System.out.println("menu");
        System.out.println("1- sumar");
        System.out.println("2- restar");
        System.out.println("3- multiplicar");
        System.out.println("4- dividir");
        System.out.println("5- salir");
        op=leer.nextInt();
        
        switch(op){
            case 1:{
                System.out.println(num1+num2);
                break;
            }
            case 2:{
                System.out.println(num1-num2);
                break;
            }
            case 3:{
                System.out.println(num1*num2);
                break;
            }
            case 4:{
                System.out.println(num1/num2);
                break;
            }
            case 5:{
               System.out.println("esta seguro que desea salir?  (s/n)");
              // salida=leer.nextLine();
               salida = leer.next();
               
               if(salida.equalsIgnoreCase("s")){
                   op=0;
                   System.out.println("fin del programa");
               }else if(salida.equalsIgnoreCase("n")){
                   System.out.println("seguimos trabajando");
               }else{
                   System.out.println("ingreso una letra que no corresponde");
                   //continue;
               }
              
               
                break;
            }
            default:{
                System.out.println("la opcion elegida no es correcta");
                break;
            }
        
        }
        
        }while(op!=0);
        
      
        
    }
}
