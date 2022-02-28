
package estructura_pila;

import java.util.Stack;
import javax.swing.JOptionPane;


/**
 *
 * @author olivercogollo
 */
public class pila {
    Stack<String> pila = new Stack();
/**
 * metodo para ingresar o acomular datos a la pila y luego con los otros metodos
    se puedan hacer las demas funciones
*/

    public void ingresardatos() {
        String valor =JOptionPane.showInputDialog(null, "Inserte nombre del estudiante; ");
        pila.push(valor);
    }
//metodo para desapilar la pila.

public void desamontonarpila() {
        JOptionPane.showMessageDialog(null, "Se ha eliminado el estudiante " + pila.pop());
    }
//metodo para mostra la cima de la pila.
    
public void Cima() {
        JOptionPane.showMessageDialog(null, "El estudiante que esta en la cima es :" + pila.peek());
    }
    //metodo para saber si la pila esta vacia o tiene elementos.

    public void EstaVacia() {
        if (pila.isEmpty() != true) {
            JOptionPane.showMessageDialog(null, "false: la pila contiene los siguientes: " + pila.size() + " elementos");
        } else {
            JOptionPane.showMessageDialog(null, "true: La pila esta vacía.");
        }
    }
//metodo para motrar el tamaño de la pila.
   
public void Tamañodelapila() {
        JOptionPane.showMessageDialog(null, "El Tamaño o valor de la pila es " + pila.size());
    }
//metodo pila contiene elementos o esta vacia.
    
    public void MostrardedatosPila() {
        int i = 0;
        String contenido = "";
        while (i < pila.size()) {
            contenido += pila.elementAt(i) + ", ";
            i++;

        }
        JOptionPane.showMessageDialog(null, "el contenido de la pila es: " + contenido);
    }

}
