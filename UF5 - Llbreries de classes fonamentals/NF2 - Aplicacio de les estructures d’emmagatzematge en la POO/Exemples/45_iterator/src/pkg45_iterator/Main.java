/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.                        JMBONEU
 */
package pkg45_iterator;

import java.util.ArrayList;
import java.util.Vector;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Hashtable;

/**
 *  Exemple amb la classe String
 * -----------------------------
 *  Definició:  
 *     String miCadena;
 *  Funció:
 *     Declaració de cadenes i assignació de valors, manipulables per l'assignació i concatenació
 *     Veure operacions suportades a través dels seus mètodes
 * 
 * Exemple amb la classe StringBuffer
 * -----------------------------------
 * Definició:
 *            StringBuffer sb = new StringBuffer();
 * Funcio:
 *       Permet la manipulació afegint i inserint.
 * 
 *  Exemple de la classe iterator
 *  ----------------------------- 
 * Definició:
 *        Iterator <String> iterator = cadenes.iterator();
 * Funció:
 *        La classe iterator pot recorrer en un sentit una col·lecció ArrayList o Vector
 *        del principi al final de la col·lecció.     
 *        La classe iterator pot fallar si en mig del recorregut modifiquem el vector
 */

 /*  Exemple de la classe Listiterator
 *  ---------------------------------
 * Definició:
 *        ListIterator<String> iterator2 = cadenes.listIterator();
 * Funció:
 *      La classe ListIterator permet recorrer la llista en ordre directe i 
 *      invers i manipular la llista durant el recorregut de la llista sense 
 *      que quedi inestable. Es pot manipular amb: remove i set 
 *      Exemple:  
 *                  iterator4.set(element + "-");
 *                  iterator3.remove();
 *
 */

 /*  Exemple de la classe Stack (pila)
 *  ---------------------------------
 *  Definició:
 *      Stack<String> cadenes2 = new Stack<String>();
 *  Funció: 
 *      Una pila, és una estructura d edades organitzada en forma de llista, en
 *      la qual els elements s'afegeixen i s'extreuen pel mateix extrem (FIFO)
 *      La pila compta amb dos mètodes: push i pop
 */

 /*  Taules Hash
 *  -----------
 *  Definició:
 *       Hashtable cotxe = new Hashtable();
 *  Funció:
 *      La classe Hashtable permet emmagatzemar elements mapejats. Cada element 
 *      de la taula Hash es composa d‟una clau i el seu valor. La clau serveix 
 *      per identificar l‟element i el valor és el valor de l‟element.
 */ 
 
/* @author jmboneu
 */
public class Main {

    public static void main(String[] args) {

        //------------------------------------------------------------------------
        // Exemple String:
        //------------------------------------------------------------------------
        String miCadena;

        miCadena="adios carabollo";
        miCadena="hola caracola";
        System.out.println(miCadena);
        
        //-----------------------------------------------------------------------
        // Exemple StringBuffer:
        //-----------------------------------------------------------------------
        StringBuffer sb = new StringBuffer();

        sb.append("start");
        sb.append("let");
        System.out.println("Fent append: "+sb);

        sb.insert(5,"XXI");
        System.out.println("Ara fem un insert en 'posicio 5,XXI': "+sb);

        // un append és el mateix que fer: 
        sb.insert(sb.length(),"Ohhh");
        System.out.println("Ara fem un 'append' 'Ohhh': "+sb);
        
        //---------------------------------------------------------------------
        // ArrayList:
        //---------------------------------------------------------------------
        ArrayList<String> cadenes= new ArrayList<String>();
        
       	// Afegim diverses cadenes al vector de cadenes
        cadenes.add("En un lugar de la Mancha, ");
	cadenes.add("de cuyo nombre no quiero acordarme, ");
	cadenes.add("no ha mucho tiempo que vivía ");
	cadenes.add("un hidalgo de los de lanza en astillero, ");
	cadenes.add("adarga antigua, rocín flaco, y galgo corredor");
 
        // Iterator: 
        Iterator <String> iterator = cadenes.iterator();
        
        
        /**/
        // La classe iterator només pot recorrer en un sentit de principi a final
        System.out.println("\npresentació amb Iterator:");
        System.out.println("-------------------------\n");
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
         
        }
        /**/
        /* Per provar: descomentar aquest tros i comentar l'anterior.
         * .........................................................
           // La classe iterator pot fallar si en mig del recorregut modifiquem el vector
           System.out.println("\nTornem a recorrer: \n");
           while (iterator.hasNext())
           {
             System.out.println(iterator.next());
             cadenes.remove(0);
           }
        */
        
        // La classe ListIterator permet recorrer la llista en ordre directe i 
        // invers i manipular la llista durant el recorregut de la llista sense 
        // que quedi inestable
        
        System.out.println("\npresentació amb ListIterator:");
        System.out.println("-----------------------------\n");
        ListIterator<String> iterator2 = cadenes.listIterator();
        while (iterator2.hasNext())
        {
            System.out.println(iterator2.next());
        }
        System.out.println("\npresentació amb Iterator (recorregut invers):");
        System.out.println("---------------------------------------------\n");

        while (iterator2.hasPrevious())
        {
            System.out.println(iterator2.previous());
        }
        // Exemples de manipulació la llista: remove i set ...................
        // Exemple amb mètode set
        System.out.println("\nmodificacio amb ListIterator (set):");
        System.out.println("-----------------------------------\n");
        ListIterator<String> iterator4 = cadenes.listIterator();
        while(iterator4.hasNext())
        {
            String element = iterator4.next();
            System.out.println(element);
            iterator4.set(element + "-");
        }
        System.out.println("\nrecorregut amb ListIterator (invers-set):");
        System.out.println("-----------------------------------------\n");        
        while(iterator4.hasPrevious())
        {
            System.out.println(iterator4.previous());
        }
        // Modificacio amb remove
        System.out.println("\nmodificacio amb ListIterator (remove):");
        System.out.println("--------------------------------------\n");
        ListIterator<String> iterator3 = cadenes.listIterator();
        while(iterator3.hasNext())
        {
            System.out.println(iterator3.next());
            iterator3.remove();
        } 
        
        //---------------------------------------------------------------------
        // Exemple Stack (Pila)
        //---------------------------------------------------------------------
        System.out.println("\nExemple d'Stack(push i pop):");
        System.out.println("----------------------------\n");
        Stack<String> cadenes2 = new Stack<String>();
        cadenes2.push("abc");
        cadenes2.push("def");
        cadenes2.push("ghi");
        while(!cadenes2.empty())
        {
            System.out.println(cadenes2.pop());
        }
       
       // ---------------------------------------------------------------------
       // Hastable:
       // --------------------------------------------------------------------- 
       System.out.println("\nExemple d'HasTable:");
       System.out.println("--------------------\n");
       Hashtable cotxe = new Hashtable();
       cotxe.put("color", "vermell");
       cotxe.put("longitud", 5);
       cotxe.put("amplada", 1.5);
       System.out.println(cotxe.get("color"));
       System.out.println(cotxe.get("longitud"));
       System.out.println(cotxe.get("amplada")); 
       System.out.println(cotxe.get("NO EXISTEIX")); // --> retorna null. Podem comprovar per null.
       System.out.println(cotxe.keySet()); // retorna [color, longitud, amplada]

       
       // Podem crear Hashtables a mida de l'usuari i després recorre-les, per exemple:
       // crear una hashtable (codi,valor) fins que l'usuari digui prou i despres
       // visualitzar-la o localitzar un determinat valor
       String aux;
       Iterator<Hashtable> iterator5 = cotxe.keySet().iterator();
       while(iterator5.hasNext())
       {
            aux=""+iterator5.next();
            System.out.println("Col·lecció Hashtable: "+aux+" "+cotxe.get(aux));
       }
       
       
       System.out.println("\nFi de programa...");
    }
}
