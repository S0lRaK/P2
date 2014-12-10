/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg16_metodes_estatics;
import java.io.*;
import java.util.Scanner;
        
/**
 *
 * @author JMBoneu
 */
public class Compte {
    private static float benefici; /* benefici: es el diner que dona el banc a tots els titulars
       d'un compte. Aquesta quantitat es la mateixa en tots els comptes  */
    
    private String titular;
    private Float saldo;
    
    Compte() // constructor
    {
      titular=demanarCadena("Indicar el nom del titular: ");
      saldo=0.0f; // Es parteix d'un saldo 0. Per això, no el demano, cal inicialitzar el valor numèric.
       
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
    public String get_Titular()
    {
        return titular;
    }
    //.......................................................................ç
    public void ingressar(String text)
    {
       float fValor;
       
       Scanner dadesIntro =new Scanner(System.in); 
       System.out.println(text);
       fValor=dadesIntro.nextFloat(); 
       saldo+=fValor;
       //saldo+=demanarFloat("Indicar el ingrès que realitza el client "+titular+" : ");
    }
    
    //.......................................................................
    static private float demanarFloat(String text) // metode privat, mai es cridarà des de fora de la classe
    {                                              // es cridat per un mètode static, per tant ha de ser static  
       Float fValor;
       Scanner dadesIntro =new Scanner(System.in); 
       System.out.println(text);
       fValor=dadesIntro.nextFloat(); 
       return fValor;
    }
    
    //.......................................................................
    static void demanarBenefici()
    {
        benefici=demanarFloat("Quin és l'aportació econòmica que dona l'empresa a tots els seus clients?: ");
    }

    //.......................................................................
    void visualitzaDadesCompte()  // no pot ser static, doncs referencia a atributs no statics
    {
       System.out.println(" - Titular del compte: " +titular);
       System.out.println(" - Saldo del compte: "+saldo);
       System.out.println(" - Benefici que dona l'empresa: "+benefici);
    }
}
