/*==============================================================================
 * Aplicació:           Exercici10_1
 * Arxiu:               Alumne.java
 * Autor:               @author Carlos J. García Carmona
 * Data de creació:     15/10/2014
 * Descripció:
 *============================================================================*/

// Paquet
package exercici10_1;

// Classe principal
public class Alumne
{
    // Atributs
    private String nom;
    private byte edat;
    
    // Constructors
    public Alumne() {}
    
    public Alumne(String nom, byte edat)
    {
        this.nom = nom;
        this.edat = edat;
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
    
    // Getters
    public String getNom()
    {
        return nom; // this?
    }
    
    public byte getEdat()
    {
        return edat; // this?
    }
}