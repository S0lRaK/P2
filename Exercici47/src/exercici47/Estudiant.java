/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici47;

/**
 *
 * @author Carlos J. García Carmona
 */
public class Estudiant 
{
    // Atributs
    String nom;
    byte edat;
    
    // Constructors
    public Estudiant(String nom, byte edat)
    {
        this.nom = nom;
        this.edat = edat;
    }
    
    // Getters
    public String getNom()
    {
        return nom;
    }
    
    public byte getEdat()
    {
        return edat;
    }
    
    // Setters
    public void setNom(String nom)
    {
        this.nom = nom;
    }
    
    public void setEdat(byte edat)
    {
        this.edat = edat;
    }
    
    // Altres mètodes
    @Override
    public String toString()
    {
        return "[Estudiant] " + "Nom: " + nom + " | Edat: " + edat;
    }
}