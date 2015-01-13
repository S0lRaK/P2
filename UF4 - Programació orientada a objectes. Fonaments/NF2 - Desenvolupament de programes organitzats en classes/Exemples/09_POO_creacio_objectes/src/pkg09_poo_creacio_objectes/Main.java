/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg09_poo_creacio_objectes;

/** CREACIÓ D'OBJECTES I CRIDA A MÈTODES
 *
 * @author JMBoneu
 */

/*******
 * La classe Classe1 ha d'estar en el seu propi fitxer anomenat Classe1.
 * Per crear-la:
 * 1. Seleccionar el paquet pkg09_poo_creacio_objectes en l'explorador de projectes
 *    (finestra que hi ha a l'esquerra)
 * 2. Premer botó dret i Seleccionar l'opció New / Java Class
 * 3. En el quadre de diàleg donar-li el nom de la classe (Classe1)
 * 4. Tallar i enganxar el codi de la classe Classe1 en el nou fitxer
 * 
public class Classe1
{
    void missatgeSalutacio1()
    {
        System.out.println("Ha entrat en el mètode missatgeSalutacio1 de la classe1");
    }
    
    void missatgeSalutacio2()
    {
        System.out.println("Ha entrat en el mètode missatgeSalutacio2 de la classe1");
    }
}
*******/

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Classe1 obj1;
        obj1=new Classe1();
        obj1.missatgeSalutacio1();
        obj1.missatgeSalutacio2();
        obj1.missatgeSalutacioPersonalitzat("HOLA! QUE TAL?");
        
        System.out.println("Ha finalitzat el programa");
    }
}
