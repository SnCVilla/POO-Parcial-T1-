
package Practicas;

import java.util.Scanner;

/**
 *
 * @author chamo_000
 */
public class practica5 {
    
    public static void main(String[] args) {
        
        Scanner sv= new Scanner (System.in);
        
        int pos;
        int tam;
        
        System.out.println("De que tamaño sera el arreglo: ");
        tam = sv.nextInt();
        
        int arreglo [];
        arreglo = new int [tam];
        System.out.println("Ingresa el numero del arreglo");
        
        for (int i = 0; i < tam; i++) {
            arreglo[i]  = sv.nextInt();
            for (int j = 0; j < tam; j++) {
                
            }
        }
        System.out.println("Que posicion desea buscar: ");
        pos = sv.nextInt();
        
        int i=0;
                while(i<tam && arreglo[i]<pos){
                    i++;
                    if (i==tam) {
                        System.out.println("Numero no encontrado");
                    }
                    else{
                        if (arreglo[i]==pos) {
                            System.out.println("El indice del valor" +pos+ " es : "+i);
                            
                        }
                    }
}
                
    }
}
