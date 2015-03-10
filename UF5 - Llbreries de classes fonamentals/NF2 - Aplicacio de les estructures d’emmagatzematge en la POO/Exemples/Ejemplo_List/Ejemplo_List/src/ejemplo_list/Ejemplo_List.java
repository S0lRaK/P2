/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
//import java.util.List;

/**
 *
 * @author joan
 * En una lista podemos añadir, borrar o modificar dando su posición. Con la 
 * Interfaz Collection no se podía hacer.
 * No es lo mismo e2.remove(3), que e2.remove(new Integer(3)). Con la primera 
 * instrucción estamos indicando que borre el objeto que está en a posición 3 y 
 * con la segunda instrucción le estamos pidiendo que borre de la lista un 
 * objeto con valor 3.
 * 
 * Cambia la instrución ArrayList lista = new ArrayList() por 
 * Collection lista = new ArrayList(), para comprobar que los métodos usados
 * no se pueden usar y cambia la cabecera; static void visuaLista (List lista) por
 * static void visuaLista (Collection col) para comprobar que no se puede usar el
 * ListItertor
 */
public class Ejemplo_List {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList lista = new ArrayList();
        /*Una colección no tiene ningún orden sobre los elementos, 
		es por eso que da error si queremos usar ciertos métodos de ArrayList*/
		//Collection lista = new ArrayList(); 
        lista.add(3);
        lista.add(3.5);
        lista.add(1, "hola");
        lista.add(45);
        System.out.println("\n\nVamos a visualizar la colección: ");
        visuaLista(lista);
        lista.set(2, 'b');
        lista.remove(3);
        System.out.println("\n\nVamos a visualizar la colección: ");
        visuaLista(lista);
        lista.remove(new Integer(3));
        System.out.println("\n\nVamos a visualizar la colección: ");
        visuaLista(lista);
    }
    
    static void visuaLista(List lista){
        ListIterator iter;
        iter=lista.listIterator();
        String m;
        
        while(iter.hasNext()){
            System.out.println("\n\tEl siguiente valor de la colección: ");
            System.out.println("\t\tEstá en la posición " + iter.nextIndex());
            m=String.valueOf(iter.next());
            System.out.println("\t\tEl valor que contiene es: " + m);
                   
        }
    }
}
