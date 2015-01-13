/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18_destruccio_d_objectes_i_liberacio_memoria;
import java.io.*;
/**
 *
 * @author JMBoneu
 */
public class Fill {
    private String nom;
    private int anyNaix;
    
    //................................................
    public int getAnyNaix()
    {
        return anyNaix;
    }
    //................................................
    public Fill()
    {
       demanarNom();
       demanarAnyNaix();
    }
    //................................................
    public void visualitzaDadesFill()
    {
        //System.out.println("\nLes dades del fill són: ");
        visualitzaNom();
        visualitzaAnyNaix();
    }
    //................................................
    public void visualitzaNom()
    {
        System.out.println(" - Nom: "+nom);
    }
    //................................................
    public void visualitzaAnyNaix()
    {
        System.out.println(" - Any naixement: "+anyNaix);
    }
    //................................................
    void demanarNom()
    {
        System.out.print("\n\nNom del fill?: ");
        nom=demanarCadena();
    }
    //................................................
    private String demanarCadena()
    {
        String var="";
        InputStreamReader via=new InputStreamReader(System.in);
        BufferedReader teclat=new BufferedReader(via);
        try
        {
           var=teclat.readLine();   
        }
        catch (IOException ex)
        {
           System.out.println("\nError en l'entrada de dades del programa");
           System.exit(1);
        }
        return var;
    }
    //................................................
    void demanarAnyNaix()
    {
        String var;
        System.out.println("\nIntroduir l'any de naixement?: ");
        var=demanarCadena();
        anyNaix=Integer.parseInt(var);
    }
    //................................................
    protected void finalize()  
    {
        System.out.println("\nS'ha liberat un objecte de la classe \'Fill\'. Les seves dades són:");
        visualitzaDadesFill();
    }
    //................................................
}
