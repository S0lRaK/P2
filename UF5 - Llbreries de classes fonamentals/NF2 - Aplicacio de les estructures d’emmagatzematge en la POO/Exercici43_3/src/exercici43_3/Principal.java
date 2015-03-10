/*==============================================================================
 * Aplicació:           Exercici43_3
 * Arxiu:               Principal.java
 * Autor:               @author Carlos J. García Carmona
 * Data de creació:     03/02/2015
 * Descripció:          Crear un programa que llegeixi una frase per teclat i mostri:
                            1. El número de paraules que té la frase
                            2. El número de caràcters que té la frase
                            3. La primera paraula de la frase
                            4. L'última paraula de la frase
                            5. La frase en majúscula
                            6. La frase en minúscula
 *============================================================================*/

// Paquet
package exercici43_3;

// Imports
import java.util.Scanner;
import java.util.StringTokenizer;

// Classe principal
public class Principal
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {    
        Scanner introDades = new Scanner(System.in);
        
        System.out.println("Introdueix una frase:");
        String frase = introDades.nextLine();
        
        StringTokenizer fraseTokenitzada = new StringTokenizer(frase, " ");
        String fraseCanviada = canviarPuntParaulaFinal(frase);
        
        System.out.println("");
        System.out.println("Número de paraules:\t" + fraseTokenitzada.countTokens());
        System.out.println("Número de caràcters:\t" + frase.length());
        System.out.println("Primera paraula:\t" + fraseTokenitzada.nextToken());
        System.out.println("Última paraula:\t\t" + fraseCanviada);
        System.out.println("Frase en majúscula:\t" + frase.toUpperCase());
        System.out.println("Frase en minúscula:\t" + frase.toLowerCase());
    }
    
    private static String canviarPuntParaulaFinal(String frase)
    {
        String fraseCanviada = frase.replace('.','\0');
        
        fraseCanviada = fraseCanviada.substring(fraseCanviada.lastIndexOf(" "));
        
        return fraseCanviada;
    }
}
