/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg11_return;
import java.io.*;

/** Classe EMPLEAT
 *
 * @author JMBoneu
 */
public class Empleat 
{
    private String nom;
    private float sou;
    
    void demanarDadesEmpleat() throws IOException
    {
        String souCad;
        InputStreamReader via=new InputStreamReader(System.in);
        BufferedReader teclat=new BufferedReader(via);
        System.out.println("Insereix el nom del empleat: ");
        nom=teclat.readLine();
        
        System.out.println("Insereix el sou del empleat: ");
        souCad=teclat.readLine();
        sou=Float.parseFloat(souCad);
    }
    
    public void setValors(String n, float s)
    {
      nom=n;
      sou=s;
    }
    
    public void visuDadesEmpleat()
    {
      System.out.println("NOM: "+nom);
      System.out.println("SOU: "+sou);
    }

    public void setSou(float s)
    {
       sou=s;   
    }

    public float getSou()
    {
       return sou;   
    }
}
