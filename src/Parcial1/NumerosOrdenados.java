
package Parcial1;

import java.util.Arrays;
import java.util.Scanner;


public class NumerosOrdenados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("De que tamaño quiere su arreglo: ");
        int x = Integer.parseInt(sc.nextLine());
        int[] numeros = new int [x];
        
        for (int i = 0; i < x; i++) {
            System.out.print("Ingrese el numero"+ " " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i <x-1; i++) {
            for (int j = 0; j <x-1; j++) {
                
                if (numeros[j]> numeros[j +1]) {
                    int resul = numeros[j+1];
                            numeros[j] = numeros[j+1];
                            numeros[j+1] = resul;
                }
            }
            
        }
        System.out.println(" El orden de los numeros es: " + Arrays.toString(numeros) );
                            
                }
            }
    