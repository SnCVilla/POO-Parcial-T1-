
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
        for (int i = 0; i < n; i++) {
            for (int k = n-2; k >=i ; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
