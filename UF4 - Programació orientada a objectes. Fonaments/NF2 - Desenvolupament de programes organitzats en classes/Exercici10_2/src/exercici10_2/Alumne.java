/*==============================================================================
 * Aplicació:           Exercici10_2
 * Arxiu:               Alumne.java
 * Autor:               @author Carlos J. García Carmona
 * Data de creació:     17/10/2014
 * Descripció:
 *============================================================================*/

// Paquet
package exercici10_2;

// Classe principal
public class Alumne
{
    // Atributs
    private String nom;
    private byte edat;
    private String curs;
    
    // Constructors
    public Alumne() {}
    
    public Alumne(String nom, byte edat, String curs)
    {
        this.nom = nom;
        this.edat = edat;
        this.curs = curs;
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
    
    public void setCurs(String curs)
    {
        this.curs = curs;
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
    
    public String getCurs()
    {
        return curs;
    }
    
    // Altres mètodes
    @Override
    public String toString()
    {
        String cadena = "Alumne: " + nom
                + " | Edat: " + edat + " anys"
                + " | Curs: " + curs;
        
        return cadena;
    }
}