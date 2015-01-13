/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15_propietats_estatiques;
import java.io.*;

/** PROPIETATS ESTÀTIQUES:
 *  Si un atribut/propietat es declara com static en una classe, això significa que 
 * existirà una còpia d'aquesta dada que serà compartida per tots els objectes de la
 * classe. A més té la qualitat de que aquesta dada existeix, encara que no s'hagi
 * declarat cap objecte de la classe. Dit d'una altre forma un atribut estàtic es una
 * variable que està associada a la classe i no a l'objecte.
 *
 * @author JMBoneu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException 
    {
        // TODO code application logic here
        Autor autor1, autor2;
        autor1= new Autor();
        autor2= new Autor();
        
        autor1.demanarIRPF(); // no utilitzo un mètode estàtic, doncs encara no l'he explicat
        System.out.println("DADES DE L'AUTOR-1: ");
        System.out.println("------------------- ");
        autor1.demanarDades();
        System.out.println("DADES DE L'AUTOR-2: ");
        System.out.println("------------------- ");
        autor2.demanarDades();
        
        //visualitzem les dades dels dos autors:
        System.out.println("--- VISUALITZEM LES DADES INTRODUïDES EN ELS DOS AUTORS ---");
        autor1.visualitzarDadesAutor("DADES DE L'AUTOR-1:");
        autor2.visualitzarDadesAutor("DADES DE l'AUTOR-2:");
        
        //Ara canviarem l'IRPF de l'autor2, per veure que el canvi afecta als dos autors
        //Abans he introduït l'IRPF a través de l'autor1, ara ho faig a través de l'autor2
        autor2.demanarIRPF();
        
        //visualitzem les dades dels dos autors, i veurem el canvi de l'IRPF que ha afectat als dos
        autor1.visualitzarDadesAutor("DADES DE L'AUTOR-1:");
        autor2.visualitzarDadesAutor("DADES DE l'AUTOR-2:");

        System.out.println("El programa ha finalitzat");
        
    }
}
