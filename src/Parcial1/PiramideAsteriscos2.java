
package Parcial1;

import java.util.Scanner;

/**
 *
 * @author chamo_000
 */
public class PiramideAsteriscos2 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Ingresa el numero de filas que deseas imprimir");
        n=sc.nextInt();
        for (int i = 0; i < n; i++) { //Controlalas lineas
            for (int s = n-2; s >=i ; s--) { // Controla espacios
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) { //Asteriscos
                System.out.print("*");
            }
            System.out.println(""); //Salto de linea
        }
    }
}
