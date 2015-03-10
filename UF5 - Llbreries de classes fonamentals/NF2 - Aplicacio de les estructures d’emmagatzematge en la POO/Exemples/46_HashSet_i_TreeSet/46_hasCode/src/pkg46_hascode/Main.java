/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.             JMBONEU
 */
package pkg46_hascode;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.LinkedList;
import java.util.Collection;
/**
 *  Classe HasSet
 *  -------------
 *  Definició:
 *     Col·lecció sense duplicats (no importa l'ordre). Es fa amb una taula hash
 *     on cada posició apunta als elements que tenen el mateix codi Hash.
 * 
 *     Per aconseguir crear el codi Hash es necessari reescriure el codi de:
 *         del mètode equals: indicant quan considerem que dos objectes son iguals
 *         del mètode hasCode:  determinant quin es el codi d'identificació de 
 *                              cada objecte
 * 
 *  Llibreria:   import java.util.HashSet;
 *  Declaració:  HashSet colec=new HashSet();
 * 
 *  Classe TreeSet
 *  --------------
 *  Definició:
 *       La diferencia amb HashSet és que es guarden ordenats
 * 
 *  Llibreria:  import java.util.TreeSet;
 * 
 *  Declaració: TreeSet <Alumne2> treAlu = new TreeSet <Alumne2>;
 * 
 *  Definició de la classe: Es necessari que la classe tingui
 *     public class Alumne2 implements Comparable <Alumne2>
 * 
 *     Es necessari recodificar el mètode compareTo
 *               public int compareTo(Alumne2 objEnviat)
 *     Indicant quan l'objecte rebut va després (>0) o abans (<0) o son iguals (=0)
 *      
 * @author jmboneu
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
      //Collection myLinkList = new LinkedList(); // Collection és la classe abstracta d'ArrayList, LinkedList, HasSet, TreeSet
      LinkedList myLinkList = new LinkedList();
        
      myLinkList.add(new Alumne("LL1",10));
      myLinkList.add(new Alumne("LL2",20));
      myLinkList.add(new Alumne("LL3",30));
      myLinkList.add(new Alumne("LL4",40));
      myLinkList.add(new Alumne("LL5",50));

      Alumne alu0;
      int i=0;
      Iterator iter0=myLinkList.iterator();
      System.out.println("Veiem els elements guardats en la LinkedList: ");
      while (iter0.hasNext())
      {
        alu0=(Alumne)iter0.next();    
        alu0.visualitzar();
        if (i==2) // LL3,30
            alu0.setNomIedat("LL3000", 3000); // canvio aquest element
        i++;
      }
      
      Iterator iter01=myLinkList.iterator();
      System.out.println("Veiem els elements guardats en la LinkedList (ara modificats): ");
      while (iter01.hasNext())
      {
        alu0=(Alumne)iter01.next();    
        alu0.visualitzar();
      }
      
      
      
        //...................................................................
        //            EXEMPLE HashSet
        //...................................................................
        HashSet colec=new HashSet();
        
        colec.add(new Alumne("A",10));
        colec.add(new Alumne("B",10));
        colec.add(new Alumne("C",10));
        
        colec.add(new Alumne("A",20));
        colec.add(new Alumne("B",20));
        colec.add(new Alumne("C",20));
        
        colec.add(new Alumne("A",30));
        colec.add(new Alumne("B",30));
        colec.add(new Alumne("C",30));
        
        colec.add(new Alumne("A",10));
        colec.add(new Alumne("B",20));
        colec.add(new Alumne("C",30));
           // Revisar la definición de la classe Alumne: hasCode i equals !!!!!!!!! 
        System.out.println("\nEXEMPLE HashSet: Fixar-se que sortiran AGRUPATS (però NO ORDENATS): ");
        Alumne alu;
        Iterator iter=colec.iterator();
        while (iter.hasNext())
        {
          alu=(Alumne)iter.next();    
          alu.visualitzar();
        }
        //...................................................................
        //            EXEMPLE TreeSet
        //...................................................................
        TreeSet colec2=new TreeSet();
        
        colec2.add(new Alumne2("A",10));
        colec2.add(new Alumne2("B",10));
        colec2.add(new Alumne2("C",10));
        
        colec2.add(new Alumne2("A",20));
        colec2.add(new Alumne2("B",20));
        colec2.add(new Alumne2("C",20));
        
        colec2.add(new Alumne2("A",30));
        colec2.add(new Alumne2("B",30));
        colec2.add(new Alumne2("C",30));
        
        colec2.add(new Alumne2("A",10));
        colec2.add(new Alumne2("B",20));
        colec2.add(new Alumne2("C",30));

        System.out.println("\nEXEMPLE TreeSet: Fixar-se que sortiran ORDENATS SENSE REPETICIÓ: ");
        Alumne2 alu2;
        Iterator iter2=colec2.iterator();
        while (iter2.hasNext())
        {
          alu2=(Alumne2)iter2.next();    
          alu2.visualitzar();
        }
    }
}
