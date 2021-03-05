/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial1;

import java.util.Scanner;

/**
 *
 * @author chamo_000
 */
public class PiramideAsteriscos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("De cuantas filas sera la piramide");
        n=sc.nextInt();
        for (int i = 0; i < n; i++) {//COntrola las lines
            for (int j = n; j < i; j--) {//COntrola los espacios
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) { //Asteriscos
                System.out.print("*");
            }
            System.out.println(""); //Salto lineas
        }
    }
}
