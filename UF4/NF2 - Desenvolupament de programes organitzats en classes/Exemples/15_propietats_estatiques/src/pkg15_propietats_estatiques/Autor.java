/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15_propietats_estatiques;
import java.util.Scanner;

/** Exemple: Classe Autor té una propietat estàtica
 *
 * @author JMBoneu
 */
public class Autor {
    String nom;
    double guanysAutor;
    static float IRPF;  // atribut STATIC: associat a la classe i compartit entre tots els objectes
    
    //.......................................................................
    void demanarDades()
    {
        demanarNom();
        demanarGuanysAutor();
    }
    
    //.......................................................................
    private String demanarCadena(String text) // metode privat, mai es cridarà des de fora de la classe
    {
       String cadena;
       Scanner dadesIntro =new Scanner(System.in); 
       System.out.println(text);
       cadena=dadesIntro.nextLine();
       return cadena;
    }
    
    //.......................................................................
    private void demanarNom()  // metode privat, mai es cridarà des de fora de la classe
    {
        nom=demanarCadena("Introduir el nom de l'autor: ");
    }
    
    //.......................................................................
    private Double demanarDouble(String text)  // metode privat, mai es cridarà des de fora de la classe
    {
       Double dValor;
       Scanner dadesIntro =new Scanner(System.in); 
       System.out.println(text);
       dValor=dadesIntro.nextDouble(); 
       return dValor;
    }

    //.......................................................................
    private void demanarGuanysAutor() // metode privat, mai es cridarà des de fora de la classe
    {
         guanysAutor=demanarDouble("Introduir els guanys de l'autor: ");
    }

    //.......................................................................
    private Float demanarFloat(String text) // metode privat, mai es cridarà des de fora de la classe
    {
       Float fValor;
       Scanner dadesIntro =new Scanner(System.in); 
       System.out.println(text);
       fValor=dadesIntro.nextFloat(); 
       System.out.println("Error en l'entrada de dades (Float) ");
       return fValor;
    }
    
    //.......................................................................
    void demanarIRPF()
    {
        IRPF=demanarFloat("Introduir l'IRPF que ha de pagar l'autor: ");
    }

    //.......................................................................
    void visualitzarDadesAutor(String text)
    {
        System.out.println(text);
        System.out.println("------------------- ");
        System.out.println("Nom: "+nom);
        System.out.println("Guanys de l'autor: "+guanysAutor);
        System.out.println("IRPF: "+IRPF);
    }
}
