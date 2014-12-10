/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg16_metodes_estatics;
import java.io.*;


/** MÈTODES ESTÀTICS:
 * ------------------
 * 
 *  Un mètode estàtic no és un mètode de l'objecte sino de la classe. Això ens permet
 *  utilitzar aquest mètode sense tenir declarat cap objecte. Per tant es pot invocar
 *  un mètode estàtic fent:
 *               NomClasse.metodeEstatic();
 *  encara que també es pot fer:
 *               nomObjecteDeLaClasse.metodeEstatic();
 *  Tot i que aquesta segona forma de cridar al mètode estàtic pot resultar enganyosa,
 *  doncs no actua sobre un objecte en particular sino sobre la classe.
 * 
 *  Dintre d'un mètode estàtic només es poden utilitzar membres de la classe que siguin 
 *  estàtics
 * 
 * Reflexió: Perquè el mètode main ha de ser estàtic?
 *
 * @author JMBoneu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Compte client1, client2;
        client1=new Compte();
        client2=new Compte();
        
        Compte.demanarBenefici(); /* També haguès pogut posar client1.demanarBenefici() o
         * client2.demanarBenefici(); però afectaria igualment a tots els clients, d'aquesta
         * forma no es aconsellable doncs sembla que afecti només a l'objecte en qüestió.
         */
        
        //visualitzaDosClients(client1, client2);
        client1.ingressar("Indicar el ingrès que realitza el client "+client1.get_Titular()+" : ");
        client2.ingressar("Indicar el ingrès que realitza el client "+client2.get_Titular()+" : ");
        System.out.println("LES DADES DELS CLIENTS UN COP INGRESSAT SÓN: ");
        visualitzaDosClients(client1, client2);
        System.out.println("\nL'EMPRESA MODIFICA EL BENEFICI QUE DONA ALS SEUS CLIENTS: ");
        Compte.demanarBenefici();
        System.out.println("\nLES DADES DELS CLIENTS, UNA VEGADA MODIFICAT EL BENEFICI SÓN: ");
        visualitzaDosClients(client1,client2); // Veiem que ha afectat als dos objectes
        
        System.out.println("\nEl programa ha finalitzat");
    }

    //......................................................................................
    static void visualitzaDosClients(Compte client1, Compte client2)
    {
        System.out.println("\nLes dades del client1 són: ");
        System.out.println("===========================");
        client1.visualitzaDadesCompte();
        System.out.println("\nLes dades del client2 són: ");
        System.out.println("===========================");
        
        client2.visualitzaDadesCompte();
    }
}
