/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a 
medida que el usuario las va ingresando, construya una “sopa de letras para niños” 
de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal 
en una fila que será seleccionada de manera aleatoria. Una vez concluida la ubicación
de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9. 
Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes 
funciones de Java substring(), Length() y Math.random().
 */
package guia5Encuentro91011;

import java.util.Scanner;

/**
 *
 * @author Mininos
 */
public class extraEjercicio6 {
    
    public static void main(String[] args) {

 /*   Construya un programa que lea 5 palabras de mínimo 3 y hasta 5
caracteres y, a medida que el usuario las va ingresando, construya una
“sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las
palabras se ubicarán todas en orden horizontal en una fila que será
seleccionada de manera aleatoria. Una vez concluida la ubicación de las
palabras, rellene los espacios no utilizados con un número aleatorio del 0
al 9. Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java substring(), Length() y Math.random().*/
   
        Scanner leer=new Scanner(System.in);
        String [][] matriz=new String[20][20];
        String[] pal=new String[5];
        
         for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                Integer n=(int)(Math.random()*9+1);
                matriz[i][j]=String.valueOf(n); //n paso a ser String
                System.out.print(matriz[i][j]);
           
            }
            
            System.out.println(" ");
        }
    
        
        
        System.out.println("ingrese 5 palabras de minimo3 y maximo 5 caracteres");
        for (int i = 0; i < 5; i++) {
          String palabra=leer.next();
          if(palabra.length()>=3 && palabra.length()<=5){
              pal[i]=palabra;
          }else{
              i--;
          }
        }
        //palabra *palabra
        int[] num=new int[5];
        int cont=0;
        
        for (int i = 0; i < pal.length; i++) {
            int k=(int) (Math.random()*19); //fila
            if(contiene(k,num)){
                num[cont]=k;
                cont++; 
                
                
                for (int j = 0; j < pal[i].length(); j++) {
                    matriz[k][j]=pal[i].substring(j,j+1); //rellenar matriz
                }
            }else{
                i--;
            }
        }
        
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        
     
      
        
        
        
    }

    private static boolean contiene(int k,int[] num) {
        for (int i = 0; i < num.length; i++) {
            if(num[i]==k){
                return false;
            }
        }
 return true;
}
        
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
 