
package listas;

import java.util.Scanner;

/**
 *
 * @author 1
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner teclado=new Scanner(System.in);
       lista lista1=new lista();
       int opcion=0;
      do{
           System.out.println("Elija una opcion");
           System.out.println("1. Ingrese un nodo");
           System.out.println("2. mostrar la lista");
           System.out.println("3. Buscar en la lista");
           System.out.println("4. Modificar");
           System.out.println("5. Salir");
           opcion=teclado.nextInt();
        switch(opcion){
           case 1:
                System.out.println("ingrese un nodo");
                 int dato=teclado.nextInt();
                lista1.ingresar(dato);
                break;
           
           case 2:
                 System.out.println(" mostrar lista");
                 lista1.mostrar();
                 break;
           case 3:
                  System.out.println("Buscar");
                  System.out.println("Ingrese un Ndato a Buscar");
                  int dato3=teclado.nextInt();
                  lista1.buscar(dato3);
                  break;
           case 4:
               System.out.println("Ingrese el dato a modificar");
               int dato4=teclado.nextInt();
               lista1.modificar(dato4);
                  
       }
      }
       while (opcion!=5);
    
      }   
}
