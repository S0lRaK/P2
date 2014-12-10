/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11_return;
import java.io.IOException;


/** Exemple amb RETURN
 *
 * @author JMBoneu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
        // TODO code application logic here
        float sou1, sou2;
        Empleat emp1, emp2;
        
        emp1=new Empleat();
        emp2=new Empleat();
        emp1.demanarDadesEmpleat();
        emp2.demanarDadesEmpleat();
        
        sou1=emp1.getSou();
        sou2=emp2.getSou();
        System.out.println("Aquestes són les dades del empleat que més guanya");
        
        if (sou1 > sou2)
            emp1.visuDadesEmpleat();
        else
            emp2.visuDadesEmpleat();
        
        System.out.println("Ha finalitzat el programa");
    }
}
