/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg08_operadors_i_expressions;

import java.util.Scanner;

/**
 * Operadors i expressions: Math.pow, Math.sqrt, operadors aritmètics, relacionals, lògics
 * concatenació de cadenes, ordre d'avaluació d'operadors, conversions implícites i explícites (cast)
 *
 * @author JMBoneu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         double dNum, dBase, dExponent,dPotencia, dArrel;
         Scanner dadesIntro =new Scanner(System.in);
         
         System.out.println("\nIntroduir la base: ");
         dBase=dadesIntro.nextDouble();
         System.out.println("\nIntroduir el exponent: ");
         dExponent=dadesIntro.nextDouble();
         dPotencia=Math.pow(dBase,dExponent);
         System.out.println(""+dBase+"^"+dExponent+"="+dPotencia);        
         
         dArrel=Math.sqrt(dPotencia);
         System.out.println("\nL'arrel quadrada SQRT("+dPotencia+")= "+dArrel);
         
        /*
         * Els operadors ++ davant o després del operand funcionen igual que en C, per exemple:
         * y=++x : primer incrementarà x i després assignarà el resultat a la variable y
         * y=x++ : primer assignarà el valor de la variable x a la variable y, i després incrementarà
         *         x
         * 
         * 
         * Operadors aritmètics: +, -, *, /, %
         * --------------------
         *    Operadors acumulatius: +=, -=, *=, /=, %=
         * 
         * Operadors relacionals: <, <=, >, >=, == (igual), != (diferent)
         * ----------------------
         * 
         */

         int x=100;
         boolean r1, r2;
         r1 = x > 10;
         r2 = x < 10;
         System.out.println("Exemple de booleans i operadors relacionals:");
         System.out.println(r1); //true
         System.out.println(r2); //false

        if(r1)  // Es pot avaluar una variable booleana
           System.out.println("Cert"); //true
            
        /*
         * Operadors lògics: && (and), || (or), ! (not)
         * --------------------------------------------
         * 
         * Si en una expressió s'ha de donar que tot es true, i el primer operand dona com resultat
         * false, aleshores ja no s'avaluarà el segon operand.
         * 
         * Es pot forçar l'avaluació de tots els operands amb els operadors: & (and), | (or)
         * 
         * Operador de concatenació de cadenes: +
         * -----------------------------------
         * 
         * Ordre d'avaluació dels operadors: 
         * --------------------------------
         * 
         * 1. (), 
         * 2. ++ --, 
         * 3. new, casting
         * 4. * / %
         * 5. + -
         * 6. < > <= >= == != (operadors relacionals)
         * 7. instanceof
         * 8. &
         * 9. |
         * 10. &&
         * 11. ||
         * 12. -=, +=, *=, %=, /=
         * L'avaluació d'operadors d'igual ordre sempre es realitza d'esquerra a dreta 
         * 
         * 
         * Conversions implícites:
         * -----------------------
         * Són les que es realitzen automàticament, quan s'assigna una variable d'un tipus 
         * determinat a una variable d'un altre tipus.
         * 
         * Per donar-se una conversió implicita s'han de cumplir les següents condicions:
         * - Els dos tipus han de ser compatibles.
         * - El tipus de la variable destí ha de tenir un rang igual o superior al tipus
         *   de la variable origen. No es pot produir perdua d'informació.
         * 
         * Conversions implícites possibles:
         * --------------------------------
         * Tipus variable destí                         Tipus variable origen
         * =====================================        =====================
         * double, float, long, int, char, short      = byte
         * double, float, long, int                   = short
         * double, float, long, int                   = char
         * double, float, long                        = int
         * double, float,                             = long
         * double                                     = float
         *
         * En el cas d'expressions amb diferents variables de diferent tipus, Java, 
         * automàticament converteix tots els tipus a un, que sempre serà el tipus major.
         * Fa aquesta conversió abans de realitzar les operacions.
         * 
         * Conversions explicites (cast):
         * -----------------------------
         * Si no es donen les condicions per fer una conversió implicita, podem forçar la 
         * conversió entre dos tipus. El casting segueix el següent format:
         * 
         * variable_on_es_guarda = (tipus_variable_on_es_guarda) variable_amb_dada_a_convertir;
         * 
         * La conversió amb cast pot produïr una pèrdua d'informació 
         */
        int varInt=18;
        float varFloat;
        varFloat=varInt;
        
        int varInt2;
        float floath=9.2f;
        
        varInt2=(int)floath;
        
        System.out.println("Exemple de cast:");
        System.out.println("El float "+floath+" es converteix al int "+varInt2);
        
        System.out.println("El programa ha finalitzat...");
        
    }
}
