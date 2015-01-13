/*
 * Escriu un programa que demani les dades de 5 alumnes que estan matriculats en una escola.
 * Aquesta escola té dos cursos de formació, on 3 alumnes estan apuntats en un curs i els altres 2 en l'altre curs.
 * D'aquests alumnes ens interessa: nom del curs on està matriculat, nom i edat.
 * 
 * Com sabem que hi ha 3 alumnes matriculats en un curs i 2 en l'altre,
 * el nom d'aquests cursos es demanarà una sola vegada.
 * Posteriorment, s'assignarà el nom d'aquests cursos als alumnes que correspongui.
 * Per suposat, per cada alumne es demanarà el seu nom i edat.
 *
 * Seguidament es visualitzarà les dades dels 5 alumnes.
 */

/*==============================================================================
 * Aplicació:           Exercici10_2
 * Arxiu:               Exercici10_2.java
 * Autor:               @author Carlos J. García Carmona
 * Data de creació:     15/10/2014
 * Descripció:
 *============================================================================*/

// Paquet
package exercici10_2;

// Imports
import java.util.Scanner;

// Classe principal
public class Principal
{
    // Constants
        private static final byte maxAlumnes = 5, maxCurs = 2;
    /**
     * Punt d'entrada a l'aplicació
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Variables
        byte edat, opcio = 0;
        String nom;
        String[] cursos;
        String curs = "";
        Alumne[] alumnes = new Alumne[maxAlumnes];
        Scanner introDades = new Scanner(System.in);
        
        cursos = demanarCurs(maxCurs, introDades);
        
        for(byte index = 0; index < maxAlumnes; index++)
        {
            // Petició de dades
            System.out.print("Alumne " + (index + 1) + ": ");
            System.out.print("-------------------------------");
            System.out.print("Introdueix el seu nom: ");
            nom = introDades.next();
            System.out.print("Introdueix la seva edat: ");
            edat = introDades.nextByte();
            System.out.println("A quin curs està apuntat?");
            System.out.println("\t Opció 1: " + cursos[0]);
            System.out.println("\t Opció 2: " + cursos[1]);
            opcio = introDades.nextByte();
            
            switch(opcio)
            {
                case 1:
                    curs = cursos[0];
                    break;
                case 2:
                    curs = cursos[1];
                    break;
                default:
                    System.out.println("Opció incorrecta.");
            }
            
            
            // Es construeix l'objecte alumne amb les dades recollides
            alumnes[index] = new Alumne(nom, edat, curs);
        }
        
        visualitzarDades(alumnes, maxAlumnes);
    } 
    
    /*
    *   Demana a l'usuari introduïr els cursos disponibles per a més tard assignar-los
    */
    private static String[] demanarCurs(Byte maxCurs, Scanner introDades)
    {
        String[] curs = new String[maxCurs];
        for(byte index = 0; index < maxCurs; index++)
        {
            System.out.println("Introdueix el nom del curs " + (index + 1) + "/" + maxCurs + ":");
            curs[index] = introDades.next();
        }
        return curs;
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
                                + ", Edat: " + alumnes[index].getEdat()
                                + ", Curs: " + alumnes[index].getCurs());
        }
    }
}