package Proyecto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sv = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        ProyectoP1[] cartera;
        int tam = 0;
        System.out.print("De que tamaño sera la cartera: ");
        tam = sv.nextInt();
        cartera = new ProyectoP1[tam];
        int lugares=0;
        for (int i = 0; i < cartera.length; i++) {
            cartera[i] = new ProyectoP1();
        }
        
          int opc=100;
          int opc2=100;
          int opc3=100;
          int opc4=100;
          while(opc!=0){
              System.out.println("------------------------------------");
              System.out.println("Tamaño de la cartera: "+ tam);
              System.out.println("Espacios ocupados: "+lugares);
              System.out.println("1) Agregar cliente: ");
              System.out.println("2) Mostrar clientes: ");
              System.out.println("3) Buscar cliente: ");
              System.out.println("0) Cerrar sistema");
              System.out.print("Elige una opcion: ");
              opc = sv.nextInt();   
              switch(opc){
                case 1:
                    System.out.println("-----------Agregar nuevo cliente-------------");
                try {
            if (lugares<cartera.length) {
                System.out.println("Ingresa el codigo del Cliente " +(lugares+1)+ ": ");
                cartera[lugares].setCodigoCliente(sv.nextInt());
                System.out.println("Ingrese el nombre del cliente " +(lugares+1)+ ": ");
                cartera[lugares].setNombre(bf.readLine());
                System.out.println("Ingrese el apellido paterno del cliente "+(lugares+1)+ ": ");
                cartera[lugares].setApellidoPaterno(bf.readLine());
                System.out.println("Ingrese el apellido materno del cliente "+(lugares+1)+ ": ");
                cartera[lugares].setApellidoMaterno(bf.readLine());
                System.out.println("Ingrese el numero telefonico del cliente "+(lugares+1)+ ": ");
                cartera[lugares].setTelefono(bf.readLine());
                System.out.println("Ingrese la direccion del cliente "+(lugares+1)+ ": ");
                cartera[lugares].setDireccion(bf.readLine());
                cartera[lugares].setActivo(true);
                lugares+= 1;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

                    System.out.println("------------------------------------");
                    break;
                case 2:
                    System.out.println("---------Listado de clientes----------------");
                    for (int i = 0; i < cartera.length; i++) {
                        System.out.println("Codigo del cliente: " + cartera[i].getCodigoCliente());
                        System.out.println("Nombre del Cliente: " + cartera[i].getNombre());
                        System.out.println("Apellido paterno del cliente: " + cartera[i].getApellidoPaterno());
                        System.out.println("Apellido materno del cliente: " + cartera[i].getApellidoMaterno());
                        System.out.println("Numero de telefono del cliente: " + cartera[i].getTelefono());
                        System.out.println("Direccion del cliente: " + cartera[i].getDireccion());
                        System.out.println("Activo" + cartera[i].isActivo());
                    }
                    System.out.println("------------------------------------");
                    break;

                case 3:
                    System.out.println("---------Buscar Cliente--------------");
                    System.out.println("Deseas buscar por codigo o por nombre? ");
                    while(opc3!=0){
                        System.out.println("----------Menu Secundario--------------");
                        System.out.println("1) Bucar por codigo");
                        System.out.println("2) Buscar por nombre");
                        System.out.println("0) Regresar al menu principal");
                        System.out.print("Elige una opcion: ");
                        opc3 =sv.nextInt();
                        switch(opc3){
                            case 1:
                                System.out.println("Ingrese el codigo: ");
                                int codigo=0;
                                codigo= sv.nextInt();
                                for (int i = 0; i < cartera.length; i++) {
                                 if(codigo==cartera[i].getCodigoCliente()){
                        System.out.println("Codigo del cliente: " + cartera[i].getCodigoCliente());
                        System.out.println("Nombre del Cliente: " + cartera[i].getNombre());
                        System.out.println("Apellido paterno del cliente: " + cartera[i].getApellidoPaterno());
                        System.out.println("Apellido materno del cliente: " + cartera[i].getApellidoMaterno());
                        System.out.println("Numero de telefono del cliente: " + cartera[i].getTelefono());
                        System.out.println("Direccion del cliente: " + cartera[i].getDireccion());
                        System.out.println("Activo" + cartera[i].isActivo());
                                 }
                                    
                                }
                        System.out.println("-------------------------------------------");
                                break;
                            case 2:
                        System.out.println("------------------------------------");
                                int s=0;
                                String nombre;
                        System.out.println("Ingrese el nombre: ");
                        nombre = bf.readLine();
                        if(nombre.equals(cartera[s].getNombre())){
                        System.out.println("Codigo cliente: " + cartera[s].getCodigoCliente());
                        System.out.println("Nombre del Cliente: " + cartera[s].getNombre());
                        System.out.println("Apellido paterno del cliente: " + cartera[s].getApellidoPaterno());
                        System.out.println("Apellido materno del cliente: " + cartera[s].getApellidoMaterno());
                        System.out.println("Numero de telefono del cliente: " + cartera[s].getTelefono());
                        System.out.println("Direccion del cliente: " + cartera[s].getDireccion());
                        System.out.println("Activo" + cartera[s].isActivo()); 
                                    }
                        System.out.println("--------------------------------------------");
                                break;
                                
                            case 0:
                        System.out.println("---------------------------------------------");
                                System.out.println("Has vuelto al menu principal"); 
                                break;
                        }
                    }

                    break;
                case 0:
                    System.out.println("------------------------------------");
                    System.out.println("Gracias por usar el programa creado por este gran crack, que digo crack, Maistrooooo");
                    System.out.println("---------------------------------------------");
                    break;
            }
        }
    }
}
