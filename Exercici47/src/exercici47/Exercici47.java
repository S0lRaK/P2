/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

// Paquet
package exercici47;

import java.util.*;
/**
 *
 * @author Carlos J. García Carmona
 */

public class Exercici47
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        iniciarMenu();
        
    }
    private static void iniciarMenu()
    {
        byte op;
        ArrayList<Estudiant> llista = new ArrayList();
        Scanner introDades = new Scanner(System.in);
        
        do
        {
            System.out.println("[1] Afegir un objecte a la llista a partir de l'element actual");
            System.out.println("[2] Canviar la posició de l'element actual, un cap a l'esquerra");
            System.out.println("[3] Canviar la posició de l'element actual, un cap a la dreta");
            System.out.println("[4] Canviar la posició de l'element actual al principi de tot");
            System.out.println("[5] Canviar la posició de l'element actual al final de tot");
            System.out.println("[6] Eliminar l'objecte contingut en la posició actual");
            System.out.println("[7] Sortir del programa");
            
            op = introDades.nextByte();
        }
        while(op != 7); // (op < 0 || op > 7) NO mostraria el menú al escollir una opció vàlida
        
        switch(op)
        {
            case 1:
                mostrarLlista(llista);
                //byte obj = introDades.nextByte();
                
                break;
            case 2:
                mostrarLlista(llista);
                ;
                break;
            case 3:
                mostrarLlista(llista);
                ;
                break;
            case 4:
                mostrarLlista(llista);
                ;
                break;
            case 5:
                mostrarLlista(llista);
                ;
                break;
            case 6:
                mostrarLlista(llista);
                ;
                break;
            case 7:
                ;
                break;
            default:
                ;
        }
    }
    
    private static void mostrarLlista(ArrayList llista)
    {
        System.out.println("Llista actual: " + llista);
        System.out.println("Posició actual: ");
        System.out.println("Introdueix l'objecte a afegir: ");
    }
    
    private static void afegirEstudiant(Scanner introDades, ArrayList<Estudiant> llista)
    {
        String nom;
        byte edat;
                
        System.out.println("Introdueix el nom de l'estudiant a afegir: ");
        nom = introDades.nextLine();
        System.out.println("Introdueix l'edat de l'estudiant a afegir: ");
        edat = introDades.nextByte();
        Estudiant estudiant = new Estudiant(nom, edat);        
        
        
        
    }
}