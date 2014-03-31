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
        ArrayList<Estudiant> llista = new ArrayList();
        ListIterator index = llista.listIterator();
        Scanner introDades = new Scanner(System.in);
        
        iniciarMenu(llista, index, introDades);        
    }
    private static void iniciarMenu(ArrayList llista, ListIterator index, Scanner introDades)
    {
        byte op;
                
        do
        {
            System.out.println("[1] Afegir un objecte a la llista a partir de l'element actual");
            System.out.println("[2] Canviar la posició de l'element actual, un cap a l'esquerra");
            System.out.println("[3] Canviar la posició de l'element actual, un cap a la dreta");
            System.out.println("[4] Canviar la posició de l'element actual al principi de tot");
            System.out.println("[5] Canviar la posició de l'element actual al final de tot");
            System.out.println("[6] Eliminar l'objecte contingut en la posició actual");
            System.out.println("[7] Mostrar la llista i posició en ella actual");
            System.out.println("[0] Sortir del programa");
            
            op = introDades.nextByte();
            switch(op)
            {
                case 1:
                    afegirEstudiant(introDades, llista);
                    break;
                case 2:
                    canviarEsq(index);
                    break;
                case 3:
                    canviarDreta(index);
                    break;
                case 4:
                    canviarInici(index);
                    break;
                case 5:
                    canviarFinal(index);
                    break;
                case 6:
                    index.remove();
                    break;
                case 7:
                    mostrarLlista(llista, index);
                    break;
            }
        }while(op != 0); // (op < 0 || op > 7) NO mostraria el menú al escollir una opció vàlida
    }
    
    private static void mostrarLlista(ArrayList llista, ListIterator index)
    {
        System.out.println("Llista actual: " + llista);
        System.out.println("Posició actual: " + (index.previousIndex()+1));
    }
    
    private static void afegirEstudiant(Scanner introDades, ArrayList<Estudiant> llista)
    {
        String nom;
        byte edat;
                
        System.out.println("Introdueix el nom de l'estudiant a afegir: ");
        nom = introDades.next();
        System.out.println("Introdueix l'edat de l'estudiant a afegir: ");
        edat = introDades.nextByte();
        Estudiant estudiant = new Estudiant(nom, edat);
        llista.add(estudiant);
    }
    
    private static void canviarEsq(ListIterator index)
    {
        if(index.hasPrevious())
        {
            index.previous();
        }else{
            System.out.println("No hi ha cap element previ a l'actual");
        }
    }
    
    private static void canviarDreta(ListIterator index)
    {
        if(index.hasNext())
        {
            index.next();
        }else{
            System.out.println("No hi ha cap element posterior a l'actual");
        }
    }
    
    private static void canviarInici(ListIterator index)
    {
        while(index.hasPrevious())
        {
            index.previous();
        }
    }
    
    private static void canviarFinal(ListIterator index)
    {
        while(index.hasNext())
        {
            index.next();
        }
    }
}