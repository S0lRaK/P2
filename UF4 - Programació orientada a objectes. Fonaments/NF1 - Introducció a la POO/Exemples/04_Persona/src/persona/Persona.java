/* =============================================================================
 * Aplicació:		Persones
 * Nom de l'arxiu:	Persona.java
 * Autor:			José Luis García Mañas
 * Data de creació:	20/09/2011
 * Descripció:		Conté la classe Persona, amb els atributs i mètodes de la 
 *					classe.
 * ========================================================================== */

// Paquet
package persona;

// Classe Persona
public class Persona
{
	// Atributs
	private String nom;
	private String cognoms;
	public  byte   edat;
	public  String nif;

	// Constructors
	public Persona()
	{
	}

	public Persona(String nom, String cognoms, byte edat, String nif)
	{
		this.nom	 = nom;
		this.cognoms = cognoms;
		this.edat	 = edat;
		this.nif	 = nif;
	}
	
	// Setters

	public void setNom(String nom)
	{
		this.nom = nom;
	}

	public void setCognoms(String cognoms)
	{
		this.cognoms = cognoms;
	}

	public void setEdat(byte edat)
	{
		this.edat = edat;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	// Getters

	public String getNom()
	{
		return nom;
	}

	public String getCognoms()
	{
		return cognoms;
	}

	public byte getEdat()
	{
		return edat;
	}

	public String getNif() {
		return nif;
	}

	public String toString()
	{
		return nom + ", " + cognoms + ", " + edat + ", " + nif;
	}
	
	public boolean equals(Persona altraPersona)
	{
		return this.nif.equals(altraPersona.nif);
	}
	
	public Persona clone()
	{
		return new Persona(nom, cognoms, edat, nif);
	}
}	// Final classe Persona
// =============================================================================
