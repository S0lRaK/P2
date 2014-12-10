/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18_destruccio_d_objectes_i_liberacio_memoria;
import java.*;
 

/** DESTRUCCIÓ D'OBJECTES i ALLIBERAMENT DE MEMÒRIA:
 *  -----------------------------------------------
 * 
 * En l'execució d'un programa orientat a objectes, principalment hi ha 3 passos:
 * 1- Crear els objectes
 * 2- Enviar missatges d'un objecte a un altre. L'execució del codi corresponent.
 * 3- Quan els objectes ja no són necessaris, s'esborra de la memòria tant la 
 *    referència de l'objecte com l'espai que ocupen les seves dades.
 * 
 * Els objectes es destrueixen automàticament quan el programa surt del bloc de codi on 
 * van ser declarats, però l'alliberament de memòria (que es va reservar amb l'operador
 * new) no es fa de la mateixa forma, sino que es fa a través d'un programa anomenat
 * Garbage Collector (GC) o recolector de bruticia. El GC és un programa que ve integrat
 * en la MVJ (Màquina Virtual Java).
 * 
 * Aquest programa el que fa és revisar la memòria i comprovar, aquells espais que han 
 * estat reservats amb un new, si hi ha algun objecte que l'apunti. Si no hi ha cap
 * objecte que l'apunti, aquest espai de memòria l'alliberarà perque torni ha estar 
 * disponible.
 * 
 * El GC salta cada cert temps, alliberant l'espai de memòria. Si volem que s'executi
 * el GC en un moment determinat s'ha de posar l'instrucció: System.gc();
 * 
 * Quan el GC allibera un espai de memòria, s'executa automàticament el mètode  protected
 * finalize(); sempre que aquest mètode estigui implementat dins de la classe a la que 
 * pertany l'espai de memòria que s'està alliberant.
 * 
 * 
 * EXEMPLE: La desaparició d'un objecte no té que comportar necessàriament la desaparició
 * de l'espai de memòria on apunta. En el següent exemple al tancar el mètode MAYOR, 
 * desapareixeran els dos objectes fills: FILL1 i FILL2. Però l'espai de memòria d'un
 * dels dos objectes no ha de desapareixer, doncs les seves dades es volen visualitzar 
 * fora del mètode.
 *
 * @author JMBoneu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Fill fillgran;
        fillgran=major();
        System.out.println("\n----CRIDA AL GC (Garbage Collector)----\n");
        System.gc();
        Thread.sleep(1000); //Aturo el programa, per assegurar-me que crida al GC
        System.out.println("\n------DESPRÉS DE CRIDAR AL GC----------\n");
        
        /* A l'alliberar l'espai de l'objecte que tenia l'edat més jove. No 
         * s'allibera l'espai de l'altre objecte, doncs l'objecte fillgran apunta
         * a l'espai de l'objecte, i per tant pot ser utilitzat en qualsevol altre
         * moment.
        */
        System.out.println("\nLes dades del fill gran són: ");
        fillgran.visualitzaDadesFill();
        
        System.out.println("El programa ha finalitzat");
    }
    //........................................................................
    static Fill major()
    {
        Fill fill1, fill2;
        
        fill1=new Fill();
        fill2=new Fill();
        
        if (fill1.getAnyNaix() < fill2.getAnyNaix())
            return fill1;
        else
            return fill2;
    }
    //........................................................................
}
