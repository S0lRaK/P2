/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07_entrada_sortida;
import java.io.*; // (*1)
import java.util.Scanner; // (*3)
/**
 * ENTRADA DES DE TECLAT: InputStreamReader, BufferedReader, Scanner
 * 
 * @author JMBoneu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    // JBC: fa falta afegir la clausula    throws IOException (*2)
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        /* JBC:
         * Entrada/sortida des de teclat:
         * ------------------------------
         *  Hi ha moltes classes a Java  per fer-ho. Ara veurem un exemple utilitzant:
         *  - InputStremReader i BufferedReader
         *  - Scanner
         * Necessitem importar: java.io.*   (veure: *1)
         * Necessitem indicar la clàusula throws IOException (veure: *2), si no posem 
         * aquesta clàusula es produeix un error de compil·lació, això és degut a que
         * hi ha certs mètodes que requereixen que control.lem els possibles errors que es puguin
         * produir en l'execució d'un programa, per exemple falta de memòria RAM. readLine ens
         * exigeix tenir-ho previst. Més endavant veurem el tractament d'excepcions.
         *
         * Farem:
         * ------
         *  - InputStreamReader entrada=new InputStreamReader(System.in);
         *  - BufferedReader teclado=new BufferedReader(entrada);
         * 
         * Explicació:
         * -----------
         * L'objecte anomenat entrada es de tipus InputStreamReader. Aquesta classe controla 
         * l'entrada de dades des de teclat. L'objecte entrada recull la informació des del
         * teclat.
         * 
         * La classe BufferedReader reserva memòria per guardar les dades que s'insereixen des
         * de teclat i les deixa en memòria, així l'objecte anomenat teclado és capaç de guardar
         * informació en la memòria.
         * 
         * La classe BufferedReader té un mètode readLine() que s'encarrega de prendre tot el que
         * s'escrigui fins premer ENTER. Fent: teclado.readLine() tot el que llegeix ho pren en 
         * format String. 
         * Per tant: String dato=teclado.readLine();
         * 
         * Si es produeix un error en el mètode readLine, l'error serà enviat a main i aquest al SO.
         */
        
        String datoStr;
        
         InputStreamReader entrada=new InputStreamReader(System.in);
         BufferedReader teclado=new BufferedReader(entrada);
       
         //JBC: O també tot en una única línia:
         BufferedReader teclat=new BufferedReader(new InputStreamReader(System.in));
         
         // JBC: exemple de lectura (1)
         System.out.print("Introdueix una línia: ");
         datoStr = teclado.readLine();
         System.out.println("\tLa línia introduïda és: \""+datoStr+"\"");
         
         // JBC: exemple de lectura (2), pel cas de declaració en una línia
         System.out.print("Introdueix una altra línia: ");
         datoStr = teclat.readLine();
         System.out.println("\tL'altra línia introduïda és: \""+datoStr+"\"");
         
         /* JBC: Si volem treballar amb altres tipus de dades, que no siguin Strings, podem
          * convertir les cadenes de la següent forma:
          * 
          * int datoInt       = Integer.parseInt   (datoStr);
          * short datoShort   = Short.parseShort   (datoStr);
          * long datoLong     = Long.parseLong     (datoStr);
          * float datoFloat   = Float.parseFloat   (datoStr);
          * double datoDouble = Double.parseDouble (datoStr);
          * //JBC: char datoChar     = Char.parseChar     (datoStr); // No es pot fer, ni té sentit.
          */
         
         //JBC: Introduir un valor numèric i convertir a un tipus numèric específic.
         String tipusNumeric;

         System.out.println("Introdueix un valor numèric: ");
         datoStr = teclat.readLine();
         System.out.println("Introdueix el tipus de la dada numèrica introduïda ");
         System.out.println("---- (I)nt, (S)hort, (L)ong, (F)loat, (D)ouble ----");
         tipusNumeric = teclat.readLine();
         
         switch(tipusNumeric.charAt(0))
         {
             case 'I':
                    int datoInt       = Integer.parseInt   (datoStr);
                    System.out.println("\nHas introduït: "+datoInt);
                    break;
             case 'S':
                    short datoShort   = Short.parseShort   (datoStr);
                    System.out.println("\nHas introduït: "+datoShort);
                    break;
             case 'L':
                    long datoLong     = Long.parseLong     (datoStr);
                    System.out.println("\nHas introduït: "+datoLong);
                    break;
             case 'F': // els decimals separats per punt.
                    float datoFloat   = Float.parseFloat   (datoStr);
                    System.out.println("\nHas introduït: "+datoFloat);
                    break;
             case 'D': 
                    double datoDouble = Double.parseDouble (datoStr);
                    System.out.println("\nHas introduït: "+datoDouble);
                 
         }
         
         /* JBC: Ara amb la classe Scanner
          * ------------------------------
          * 
          * Una altra forma de demanar dades es usant la classe Scanner, de la següent forma:
          * 
          * Scanner objecteTipusScanner = new Scanner(System.in);
          * 
          * La classe Scanner té un mètode per cada tipus bàsic de Java, amb el que no fa falta
          * fer la conversió.
          * 
          * Per utilitzar la classe Scanner és necessari fer:
          * - import java.util.Scanner; (*3)
          * 
          * Segons la configuració del SO els decimals s'hauran d'introduir amb el punt decimal o
          * la coma decimal. En teclats ESpanyols amb la coma decimal: 12,34
          * 
          */
         
         String nom;
         float numero;
         
         Scanner dadesIntro =new Scanner(System.in);
         System.out.println("\nIntroduir un nom: ");
         //nom=dadesIntro.next(); // Introduir una cadena fins espai en blanc
         nom=dadesIntro.nextLine();
         
         System.out.println("Introduir un numero (amb decimals): ");
         numero=dadesIntro.nextFloat(); //veure tots els tipus acceptats per Scanner.next...
         
         System.out.println("Has introduït: "+nom+" "+numero);
         
         System.out.println("\nPrograma finalitzat\n");
         
    }
}
