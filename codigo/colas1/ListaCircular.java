package ejercicio3;

/**
 *
 * @author olivercogollo
 */
import ejercicio3.Nodo;

public class ListaCircular {
    
    private Nodo inicio;
    
    private Nodo ultimo;
    
    private int tamanio;
   
    public void Lista(){
        inicio = null;
        ultimo = null;
        tamanio = 0;
    }
    
    public boolean esVacia(){
        return inicio == null;
    }
   
    public int getTamanio(){
        return tamanio;
    }
    //metodo para agregar un valor a la lista al final de la posioción.
    
    public void agregarAlFinal(int valor){
        // Define un nuevo nodo.
        Nodo nuevo = new Nodo();
        
        nuevo.setValor(valor);
       
        if (esVacia()) {
           
            inicio = nuevo;
           
            ultimo = nuevo;
            
            ultimo.setSiguiente(inicio);
       
        } else{
          
            ultimo.setSiguiente(nuevo);
           
            nuevo.setSiguiente(inicio);
           
            ultimo = nuevo;
        }
        // Incrementa el contador de tamaño de la lista.
        tamanio++;
    }
    
    public void agregarAlInicio(int valor){
       
        Nodo nuevo = new Nodo();
        
        nuevo.setValor(valor);
        // Consulta si la lista esta vacia, para agregar otro nodo.
        if (esVacia()) {
           
            inicio = nuevo;
            
            ultimo = nuevo;  
            
            ultimo.setSiguiente(inicio);
       
        } else{
            
            nuevo.setSiguiente(inicio);
            
            inicio = nuevo;
           
            ultimo.setSiguiente(inicio);
        }
       
        tamanio++;
    }
    //el metodo insertar inserta un nuevo valor , con la referncia de ese valor.
    public void insertarPorReferencia(int referencia, int valor){
        
                  Nodo nuevo = new Nodo();
       
                  nuevo.setValor(valor);
      
        if (!esVacia()) {
            // Consulta si el valor existe en la lista.
        if (buscar(referencia)) {
                // Crea ua copia de la lista.
                Nodo aux = inicio;
                
                while (aux.getValor() != referencia) {
                    aux = aux.getSiguiente();
                }
                
        if (aux == ultimo) {
                  
                    aux.setSiguiente(nuevo);
                    
                    nuevo.setSiguiente(inicio);
                    
                    ultimo = nuevo;
                } else {
                   
                    Nodo siguiente = aux.getSiguiente();
                    
                    aux.setSiguiente(nuevo);
                   
                    nuevo.setSiguiente(siguiente);
                }
                  // Incrementa el contador del tamaño de la lista.
                 tamanio++;
            }
        }      
    }
   
    public void insrtarPorPosicion(int posicion, int valor){
        
        if(posicion>=0 && posicion<=tamanio){
            Nodo nuevo = new Nodo();
            nuevo.setValor(valor);
                
            // Consulta si el nuevo nodo a ingresar va al inicio de la lista.
                if(posicion == 0){
               
                nuevo.setSiguiente(inicio);
                
                inicio = nuevo;
               
                ultimo.setSiguiente(inicio);
            }
            else{
                
                if(posicion == tamanio){
                    
                    ultimo.setSiguiente(nuevo);
                   
                    nuevo.setSiguiente(inicio);
                   
                    ultimo = nuevo;     
                }
            else{
                    // Si el nodo a insertar va en el medio de la lista.
                    Nodo aux = inicio;
                     /* Recorre la lista hasta llegar al nodo anterior
                     a la posición en la cual se insertara el nuevo nodo.
                     */
                for (int i = 0; i < (posicion-1); i++) {
                        aux = aux.getSiguiente();
                    }
                     /* Guarda el nodo siguiente al nodo en la posición
                     en la cual va a insertar el nevo nodo.
                     */
                    Nodo siguiente = aux.getSiguiente();
                    
                    aux.setSiguiente(nuevo);
                    
                    nuevo.setSiguiente(siguiente);
                }
            }
                     // Incrementa el contador de tamaño de la lista.
                     tamanio++;
        }
    }
    
    public int getValor(int posicion) throws Exception{
        
        /* Verifica si la posición ingresada se encuentre en el rango
         >= 0 y < que el número de elementos de la lista.
         */
       
         if(posicion>=0 && posicion<tamanio){

            // Consulta si la posición es el inicio de la lista.
            if (posicion == 0) {
                // Retorna el valor del inicio de la lista.
                return inicio.getValor();
            }else{
                // Crea una copia de la lista.
                Nodo aux = inicio;
                // Recorre la lista hasta la posición ingresada.
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getSiguiente();
                }
                // Retorna el valor del nodo.
                return aux.getValor();
            }
        // Crea una excepción de Posición inexistente en la lista.
            } else {
            throw new Exception("Posición inexistente en la lista.");
        }
    }
    
    /**metodo para buscar si existe valor en la lista, se debe introdcir
    la referncia del valor a buscar
    */
     public boolean buscar(int referencia){
         // Crea una copia de la lista.
        Nodo aux = inicio;
         // Bandera para indicar si el valor existe.
        boolean encontrado = false;
         /* Recorre la lista hasta encontrar el elemento o hasta 
         llegar al primer nodo nuevamente.
         */
        do{
            // Consulta si el valor del nodo es igual al de referencia.
            if (referencia == aux.getValor()){
                // Cambia el valor de la bandera.
                encontrado = true;
            }
            else{
                // Avansa al siguiente. nodo.
                aux = aux.getSiguiente();
            }
        }while(aux != inicio && encontrado != true);
        //nos da el resultado de la bandera.
        return encontrado;
    }
   
    public int getPosicion(int referencia) throws Exception{
        // Consulta si el valor existe en la lista.
        if (buscar(referencia)) {
            // Crea una copia de la lista.
            Nodo aux = inicio;
            // Contador para almacenar la posición del nodo.
            int cont = 0;
            // Recorre la lista hasta llegar al nodo de referencia.
            while(referencia != aux.getValor()){
                // Incrementa el contador.
                cont ++;
                // Avanza al siguiente nodo.
                aux = aux.getSiguiente();
            }
             // Retorna el valor del contador.
            return cont;
         // Crea una excepción de Valor inexistente en la lista.
        } else {
            throw new Exception("Valor inexistente en la lista.");
        }
    }
    
    public void editarPorReferencia(int referencia, int valor){
        // Consulta si el valor existe en la lista.
        if (buscar(referencia)) {
            
            Nodo aux = inicio;
            // Recorre la lista hasta llegar al nodo de referencia.
            while(aux.getValor() != referencia){
                aux = aux.getSiguiente();
            }
            // Actualizamos el valor del nodo.
            aux.setValor(valor);
        }
    }
    
    public void editarPorPosicion(int posicion , int valor){
         /* Verifica si la posición ingresada se encuentre en el rango
         >= 0 y < que el número de elementos de la lista.
         */
        if(posicion>=0 && posicion<tamanio){
            // Consulta si el nodo a eliminar es el primero.
            if(posicion == 0){
                // Alctualiza el valor del primer nodo.
                inicio.setValor(valor);
            }
            else{
                /*En caso que el nodo a eliminar este por el medio 
                 o sea el último. 
                */
                Nodo aux = inicio;
                // Recorre la lista hasta llegar al nodo anterior al eliminar.
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getSiguiente();
                }
                // Alctualiza el valor del nodo.
                aux.setValor(valor);
            }
        }
    }
   
    public void removerPorReferencia(int referencia){
       
        if (buscar(referencia)) {
            
            if (inicio.getValor() == referencia) {
                
                inicio = inicio.getSiguiente();
              
                ultimo.setSiguiente(inicio); 
            } else{
               
                Nodo aux = inicio;
                /* Recorre la lista hasta llegar al nodo anterior 
                 al de referencia.
                 */
                while(aux.getSiguiente().getValor() != referencia){
                    aux = aux.getSiguiente();
                }
                if (aux.getSiguiente() == ultimo) {
                    aux.setSiguiente(inicio);
                    ultimo = aux;
                } else {
                    // Guarda el nodo siguiente del nodo a eliminar.
                    Nodo siguiente = aux.getSiguiente();
                   
                    aux.setSiguiente(siguiente.getSiguiente());  
                    
                }
            }
            // Disminuye el contador de tamaño de la lista.
            tamanio--;
        }
    }
   /*metodo para eliminar un nodo de la lista por su posición
    es decir ya sea eliminar un dato, al principio o al fianal de la lista.
    */
    public void removerPorPosicion(int posicion){
        /* Verifica si la posición ingresada se encuentre en el rango
         >= 0 y < que el número de elementos del la lista.
         */
        if(posicion>=0 && posicion<tamanio){
            // Consulta si el nodo a eliminar es el primero.
            if(posicion == 0){
                // Elimina el primer nodo apuntando al siguinte.
                inicio = inicio.getSiguiente();
                // Apuntamos con el último nodo de la lista al inicio.
                ultimo.setSiguiente(inicio);
            }
            /* En caso que el nodo a eliminar este por el medio 
             o sea el último. 
            */
            else{
                // Crea una copia de la lista.
                Nodo aux = inicio;
                // Recorre la lista hasta llegar al nodo anterior al eliminar.
                for (int i = 0; i < posicion-1; i++) {
                    aux = aux.getSiguiente();
                }
                if (aux.getSiguiente() == ultimo) {
                    aux.setSiguiente(inicio);
                    ultimo = aux;
                } else {
                    // Guarda el nodo siguiente del nodo a eliminar.
                    Nodo siguiente = aux.getSiguiente();
                    /* Enlaza el nodo anterior al de eliminar con el 
                     siguiente después de él. 
                     */
                    aux.setSiguiente(siguiente.getSiguiente());  
                    // Actualizamos el puntero del último nodo.
                }
            }
            // Disminuye el contador de tamaño de la lista.
            tamanio--;
        }
    }
    //metodo para eliminar una lista.
    public void eliminar(){
        // Elimina el valor y la referencia a los demás nodos.
        inicio = null;
        // Elimina el valor y la referencia al primer nodo.
        ultimo = null;
        // Reinicia el contador de tamaño de la lista a 0.
        tamanio = 0;
    }
    
    /**
     * Muestra en pantalla los elementos de la lista.
     */
    public void listar(){
        // Verífica si la lista contiene elementoa.
        if (!esVacia()) {
            // Crea una copia de la lista.
            Nodo aux = inicio;
            // Posición de los elementos de la lista.
            int i = 0;
            System.out.print("-> ");
            
            do{
                
                System.out.print(i + ".[ " + aux.getValor() + " ]" + " ->  ");
                
                aux = aux.getSiguiente();
                
                i++;
            }while(aux != inicio);
        }
    }
}
