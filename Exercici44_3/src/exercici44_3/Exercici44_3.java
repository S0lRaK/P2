/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exercici44_3;

import java.util.*;

/**
 *
 * @author Carlos J. García Carmona
 */

public class Exercici44_3
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        String frase = introFrase();
        ArrayList llista = separarIagregar(frase);
        imprimirLlista(llista);
    }
    private static String introFrase()
    {
        System.out.println("Introdueix una frase:");
        Scanner introDades = new Scanner(System.in);
        String frase = introDades.nextLine();
        return frase;
    }
    private static ArrayList separarIagregar(String frase)
    {
       String[] paraula = frase.split(" +"); // per a separar per espais en blanc (tambe seguits)
       ArrayList<String> al = new ArrayList<>();
       // al.ensureCapacity(al.size() + paraula.length);
       al.addAll(Arrays.asList(paraula));
       /* 
        * Copia manual del Array al ArrayList
        * 
       for(String s : paraula)
       {
           al.add(s);
       }
       */
       return al;
    }
    private static void imprimirLlista(ArrayList llista)
    {
        for(byte i = 0; i < llista.size(); i++)
        {
            System.out.println(llista.get(i));
        }
    }    
}