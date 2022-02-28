
package estructura_pila;

import javax.swing.JOptionPane;

/**
 *
 * @author olivercogollo
 */
public class estrucurapila {

    public static void main(String[] args) {
        //creamos un nuevo metodo llamado pila
        
        pila pila = new pila();
        int opcion = 100;
        
        while (opcion!=0) {            
            
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, ""
                    + "\n   BIENVENIDOS AL PROGRAMA PILA"
                    + "\n"
                    + "\n Inserte el número de la acción a realizar."
                    + "\n 1. Amontonar"
                    + "\n 2. Desamontonar"
                    + "\n 3. Cima"
                    + "\n 4. ¿la pila esta vacía?"
                    + "\n 5. Tamaño "
                    + "\n 6. Mostrar datos pila"
                    + "\n 0. Salir"
                    + " "));
            //con la sentencia switch, estableceremos la opcion escogida por el ususrio.
            switch(opcion){
                
                case 0:
                    System.exit(0);
                    break;
                
                case 1:
                    pila.ingresardatos();
                    break;
               
                case 2:
                    pila.desamontonarpila();
                    break;
               
                case 3:
                    pila.Cima();
                    break;
               
                case 4:
                    pila.EstaVacia();
                    break;
                
                case 5:
                    pila.Tamañodelapila();
                    break;
               
                case 6:
                    pila.MostrardedatosPila();
                    break;
            }
                
        }
    }

    }
    

