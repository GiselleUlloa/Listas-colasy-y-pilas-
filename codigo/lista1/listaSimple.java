
package listaSimple;

import java.util.LinkedList;

/**
 *
 * @author 1
 */
public class listaSimple {

    public static void main(String[] args) {
     LinkedList<String> mesesdelAño = new LinkedList<>();
      mesesdelAño.add("Enero");
     mesesdelAño.add("Febrero");
        mesesdelAño.add("Marzo");
        mesesdelAño.add("Abril");
        mesesdelAño.add("Mayo");
        mesesdelAño.add("Junio");
      mesesdelAño.add("Julio");
      mesesdelAño.add("Agosto");
      mesesdelAño.add("septiembre");
      mesesdelAño.add("Octubre");
      mesesdelAño.add("Noviembre");
      mesesdelAño.add("Diciembre");
        String str = mesesdelAño.listIterator(11).previous();
        System.out.println(mesesdelAño);
        System.out.println("nací en " + str);
    }
    
}
