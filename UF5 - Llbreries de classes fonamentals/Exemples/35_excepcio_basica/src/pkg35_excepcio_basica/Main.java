/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg35_excepcio_basica;

/** EXCEPCIONS BÀSIQUES: fer saltar una excepció amb throw new nomExcepció
 *
 * @author JMBoneu
 */


public class Main {

    public static int quadrat(int num)
    {
        int resultat;
        if(num > 46340)
        {
            throw new ArithmeticException();
        }
        resultat = num * num;
        return resultat;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int q=46340; // <<<<<<<<-----valor a modificar per fer saltar l'excepció
        
        int resultat=0;

        System.out.println("Modifica en el codi el valor de la variable q="+q+" per fer proves\n");
        System.out.println("Si q es > 46340 saltarà l'excepció\n");
        
        resultat=quadrat(q);
        
        
        // si es produeix una excepcio aquest codi no s'executa
        System.out.println("Modifica en el codi el valor de la variable q="+q+" per fer proves\n");
        
        System.out.println("El quadrat de "+q+" es "+resultat);
        
        System.out.println("El programa ha finalitzat");
    }
}
