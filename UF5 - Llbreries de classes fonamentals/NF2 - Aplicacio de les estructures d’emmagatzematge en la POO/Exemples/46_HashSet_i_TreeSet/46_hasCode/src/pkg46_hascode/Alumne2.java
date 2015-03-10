/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg46_hascode;

/**
 *
 * @author csrij
 */
public class Alumne2 implements Comparable <Alumne2>  // cal afegir: implements Comparable <Alumne2>
{
    protected String nom;
    protected int edat;
    
    //constructor
    public Alumne2(String nom, int edat)
    {
        this.nom=nom;
        this.edat=edat;
    }
    
    //public String getNom()
    //{
    //    return nom;
    //}
    
    //public int getEdat()
    //{
    //    return edat;
    //}
    
    
    // compareTo:
    // Si retorna un valor positiu: es perque l'objecte que l'ha cridat va despres 
    //                              de l'objecte que rep
    // Si retorna 0:                es perque els dos objectes son iguals
    // Si retorna un valor negatiu: es perque l'objecte que l'ha cridat va abans 
    //                              que l'objecte que rep
    @Override
    public int compareTo(Alumne2 objEnviat)
    {
        int comparacio=nom.compareTo(objEnviat.nom);
        
       
        if (comparacio==0)
        {
            if (this.edat>objEnviat.edat)
            {
                return 1;
            
            }
            else
                if (this.edat < objEnviat.edat)
                {
                    return -1;
                }
                else
                {
                    return 0;
                }
        }
        else
            return comparacio;
    }
    
    // COMENTO AQUESTA PART: DONCS NO L'UTILITZO..............................
    // Determino que si el nom és igual i l'edat també, aleshores és igual
    //public boolean equals (Alumne alu)
    //{
    //    return alu.nom.equals(this.nom) && alu.edat==this.edat;
    //}
    // creo el hasCode
    //public int hashCode()
    //{
    //    return nom.hashCode()+this.edat;
    //}
    public void visualitzar()
    {
        System.out.println(" "+nom+": "+edat);
    }    
}
