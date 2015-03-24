/*==============================================================================
 * Aplicació:           Exercici44_3
 * Arxiu:               Main.java
 * Autor:               @author Carlos J. García Carmona
 * Data de creació:     04/02/2015
 * Descripció:          Crear un programa que:
 *                      - Llegeixi una frase per teclat.
 *                      - Guardi cadascuna de les paraules de la frase com a un 
 *                        element d'un ArrayList.
 *                      - Mostri cada element de l'ArrayList en cada línia.
 *============================================================================*/

// Paquet
package exercici44_3;

// Imports
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

// Classe principal
public class Main
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String phrase = introPhrase();
        ArrayList phraseWords = separateWords(phrase);
        showElements(phraseWords);
    }
    
    private static String introPhrase()
    {
        System.out.println("Introdueix una frase: ");
        Scanner introData = new Scanner(System.in);
        String phrase = introData.nextLine();
        return phrase;
    }
    
    private static ArrayList separateWords(String phrase)
    {
        String[] words = phrase.split("\\s+");  // tota classe d'espais (i seguits)
        ArrayList<String> phraseWords = new ArrayList();
        phraseWords.addAll(Arrays.asList(words));
        return phraseWords;
    }
    
    private static void showElements(ArrayList phraseWords)
    {        
        for(Object word : phraseWords)
        {
            word = replaceFinalDot(word.toString());
            System.out.println(word);
        }
    }
    
    private static String replaceFinalDot(String word)
    {
        if(word.contains("."))
        {
            word = word.replace(".", "");
        }
        
        return word;
    }
}