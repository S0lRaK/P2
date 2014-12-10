/* =============================================================================
 * Aplicació:		Persones
 * Nom de l'arxiu:	Principal.java
 * Autor:			José Luis García Mañas
 * Data de creació:	20/09/2011
 * Descripció:		Conté la classe Principal, amb el mètode main, que realitza
 *					diverses proves sobre la classe Persona.
 * ========================================================================== */

// Paquet
package persona;

// Classe Principal
public class Principal
{
	// Mètode Principal
	public static void main(String[] args)
	{
		// Primera persona (utilitzem el constructor sense paràmetres)
		Persona p1 = new Persona();
		p1.setNom("Juan");
		p1.setCognoms("Pérez López");
		p1.setEdat((byte) 25);
		p1.setNif("12345678A");
		System.out.println("Persona 1: " + p1.toString());
		
		// Segona persona (utilitzem el constructor parametritzat
		Persona p2 = new Persona ("Maria", 
								  "Cubells Miraflor", 
								  (byte) 18, 
								  "11111111H");
		System.out.println("Persona 2: " + p2.toString());
		
		// Copiem la primera persona en p3
		Persona p3 = p1.clone();
		System.out.println("Persona 3: " + p3.toString());
		
		// Creem una nova referència (p4) per a l'objecte p2
		Persona p4 = p2;
		System.out.println("Persona 4: " + p4.toString());
		
		// Comparem les persones 1 i 2 amb equals i amb ==
		comparar(p1, "p1", p2, "p2");
		compararSigne(p1, "p1", p2, "p2");

		// Comparem les persones 1 i 3 amb equals i amb ==
		comparar(p1, "p1", p3, "p3");
		compararSigne(p1, "p1", p3, "p3");
		
		// Comparem les persones 2 i 4 amb equals i amb ==
		comparar(p2, "p2", p4, "p4");
		compararSigne(p2, "p2", p4, "p4");
	}
	
	/*
	 * Mètode:		comparar
	 * Paràmetres:	Persona	a	 Objecte que conté la primera persona a comparar
	 *				String	nomA Cadena amb el nom de l'objecte (1a persona)
	 *				Persona	b	 Objecte que conté la segona persona a comparar
	 *				String	nomB Cadena amb el nom de l'objecte (2a persona)
	 * Retorn:		Cap
	 * Descripció:	Compara les persones a i b amb el mètode equals i mostra per
	 *				pantalla si són iguals o no. El mètode és estàtic per a què
	 *				pugui ser cridat pel mètode main.
	 */
	private static void comparar(Persona a, String nomA, Persona b, String nomB)
	{
		if(a.equals(b))
		{
			System.out.println(nomA + " i " + nomB + " són iguals (equals)");
		}
		else
		{
			System.out.println(nomA + " i " + nomB + " són diferents (equals)");
		}
	}
	
	/*
	 * Mètode:		compararSigne
	 * Paràmetres:	Persona	a	 Objecte que conté la primera persona a comparar
	 *				String	nomA Cadena amb el nom de l'objecte (1a persona)
	 *				Persona	b	 Objecte que conté la segona persona a comparar
	 *				String	nomB Cadena amb el nom de l'objecte (2a persona)
	 * Retorn:		Cap
	 * Descripció:	Compara les persones a i b amb el signe == i mostra per
	 *				pantalla si són el mateix objecte o no. El mètode és estàtic 
	 *				per a què pugui ser cridat pel mètode main.
	 */
	private static void compararSigne(Persona a, 
									  String nomA, 
									  Persona b, 
									  String nomB)
	{
		if(a == b)
		{
			System.out.println(nomA + " i " + nomB + 
					" són el mateix objecte (==)");
		}
		else
		{
			System.out.println(nomA + " i " + nomB + 
					" són diferents objectes (==)");
		}
	}
}
// =============================================================================
