
package Practicas;

import java.util.Scanner;

/**
 *
 * @author chamo_000
 */
public class Practica1 {
    public static void main(String[] args) {
        Scanner sv = new Scanner (System.in);
     double calificacion[] = new double [10];
     double promedio;
     double suma = 0;
     
        System.out.println("Calificaciones a promediar\n");
        System.out.println("Ingresa la calificacion 1");
        calificacion[0] = sv.nextDouble();
        
        System.out.println("Ingresa la calificacion 2");
        calificacion[1] = sv.nextDouble();
        
        System.out.println("Ingresa la calificacion 3");
        calificacion[2] = sv.nextDouble();
        
        System.out.println("Ingresa la calificacion 4");
        calificacion[3] = sv.nextDouble();
        
        System.out.println("Ingresa la calificacion 5");
        calificacion[4] =  sv.nextDouble();
        
        System.out.println("Ingresa la calificacion 6");
        calificacion[5] = sv.nextDouble();
        
        System.out.println("Ingresa la calificacion 7");
        calificacion[6] = sv.nextDouble();
        
        System.out.println("Ingresa la calificacion 8");
        calificacion[7] = sv.nextDouble();
        
        System.out.println("Ingresa la calificacion 9");
        calificacion[8] = sv.nextDouble();
        
        System.out.println("Ingresa la calificacion 10");
        calificacion[9] = sv.nextDouble();
        
        for (int i = 0; i < calificacion.length; i++) {
            suma = calificacion[i];
            
        }
        promedio = (suma/calificacion.length);
        System.out.println("El promedio es: " + promedio);
        }
    }

