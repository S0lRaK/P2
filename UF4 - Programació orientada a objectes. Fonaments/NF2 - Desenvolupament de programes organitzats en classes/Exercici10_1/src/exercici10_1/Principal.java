/*
 * Escriu un programa que demani les dades a tres alumnes. D'aquests 3 alumnes ens interessa: nom i edat.
 * Sabem que aquests alumnes tenen la mateixa edat; amb el que, aquesta dada es demanarà una sola vegada
 * per assignar-li a cadascun dels alumnes. Per això demanarem l'edat en el main i se l'enviarem a  cada
 * objecte.
 * Posteriorment, el programa visualitzarà les dades dels tres alumnes.
 */

/*==============================================================================
 * Aplicació:           Exercici10_1
 * Arxiu:               Exercici10_1.java
 * Autor:               @author Carlos J. García Carmona
 * Data de creació:     17/10/2014
 * Descripció:
 *============================================================================*/

// Paquet
package exercici10_1;

// Imports
import java.util.Scanner;

// Classe principal
public class Principal
{    
    /**
     * Punt d'entrada a l'aplicació
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Constants
        final byte maxAlumnes = 3; // static?
        
        // Variables
        byte edat;
        String nom;
        Alumne[] alumne = new Alumne[maxAlumnes];
        Scanner introDades = new Scanner(System.in);
        
        // Petició de dades
        System.out.print("Introdueix l'edat dels alumnes ["
                + maxAlumnes + "]: ");
        edat = introDades.nextByte();
        
        for(byte index = 0; index < maxAlumnes; index++)
        {
            System.out.print("Introdueix el nom de l'alumne "
                                + (index + 1) + ": ");
            nom = introDades.next();
            alumne[index] = new Alumne(nom, edat);
        }
        
        visualitzarDades(alumne, maxAlumnes);
    }
    
    /*
    *   Mostra les dades de l'array d'alumnes
    */
    public static void visualitzarDades(Alumne[] alumnes, byte maxAlumnes)
    {
        for(byte index = 0; index < maxAlumnes; index++)
        {
            System.out.println("Alumne " + (index + 1) + "| "
                                + "Nom: " + alumnes[index].getNom()
                                + ", Edat: " + alumnes[index].getEdat());
        }
    }
}