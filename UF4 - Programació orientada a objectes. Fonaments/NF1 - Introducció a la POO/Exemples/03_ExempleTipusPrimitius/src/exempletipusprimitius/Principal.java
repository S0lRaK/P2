package exempletipusprimitius;

public class Principal
{
	public static void main(String[] args)
	{
		int a = 5;
		System.out.println("El contingut de la variable a és: " + a);
		
		byte b = 8;
		System.out.println("El contingut de la variable b és: " + b);
		System.out.println("Prova de concatenació/suma de variables: " + a + b);
		System.out.println(a + b + " Segona prova de concatenació/suma de variables ");
		System.out.println("Davant del dubte, millor utilitzar el parèntesi: " + (a + b));
		
		double c = 2.9;
		double d = c + a;
		System.out.println("La variable d val: " + d);
		
//		int e = c + a; // Observeu el warning! Java no ens ho permet
		int e = (int) c + a; // Perdrem la part decimal de c
		System.out.println("La variable e val: " + e);

//		I què passa si els dos operands són reals i el resultat és enter?
		
		c = 5.7;
		d = 3.6;
//		e = c + d; // També haurem d'utilitzar casts
		e = (int) c + (int) d; // Aquí primer arrodonim i després sumem
		System.out.println("La variable e val: " + e);
		e = (int) (c + d); // Aquí primer sumem i després arrodonim
		System.out.println("La variable e val: " + e);
		
//		I si volem utilitzar valors float?

// 		float f = 3.8; // Hem d'indicar el tipus del valor o utilitzar un cast
 		float f = 3.8f; // Hem d'indicar el tipus del valor o utilitzar un cast
		f = (float) 3.8;
		
//		long g = 3525934859328759832; // Si volem utilitzar longs, també ho hem d'indicar
		long g = 3525934859328759832L;
	}
}
