
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Practicaa5 {
      private static int pos;
    public static void main(String[] args) {
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
        Scanner sv = new Scanner (System.in);
        int tam;
        int [] arreglo;
        System.out.println("De que tamaño quieres el arreglo: ");
        tam = sv.nextInt();
        arreglo = new int [tam];
        for (int i = 0; i < tam; i++) {
            System.out.println("Ingresa el numero "+(i+1)+ ": ");
            arreglo[i] = sv.nextInt();
            pos=0;
            
        }
        int posicion;
        System.out.println("Dame un numero a buscar: ");
        posicion = sv.nextInt();
        
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i]==posicion){
                pos=i;
            }
            }
            if(pos==0){
                System.out.println("-1");
            }
            else{
                System.out.println("La posicion del numero "+posicion+" es: "+ pos);
            }
        
    }
}
