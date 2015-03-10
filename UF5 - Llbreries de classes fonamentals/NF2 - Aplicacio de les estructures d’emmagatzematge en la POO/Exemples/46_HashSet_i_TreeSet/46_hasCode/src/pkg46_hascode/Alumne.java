/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg46_hascode;

/**
 *
 * @author jmboneu
 */
public class Alumne {
    protected String nom;
    protected int edat;
    
    //constructor
    public Alumne(String nom, int edat)
    {
        this.nom=nom;
        this.edat=edat;
    }
    //-----------------------------------------------------------------------------
    // Determino que si el nom és igual i l'edat també, aleshores és igual
    public boolean equals (Alumne alu)
    {
        return alu.nom.equals(this.nom) && alu.edat==this.edat;
    }
    // creo el hasCode
    public int hashCode()
    {
        // return nom.hashCode();         //agrupats pel nom  
        // return edat;                   //agrupats per edat
         return nom.hashCode()+this.edat; //agrupat per nom + edat
    }
    //-----------------------------------------------------------------------------
    public void visualitzar()
    {
        System.out.println(" "+nom+": "+edat);
    }
    public void setNomIedat(String nom, int edat)
    {
        this.nom=nom;
        this.edat=edat;
    }
}
