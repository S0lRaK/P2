/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06_elementsprograma;

/**
 *
 * @author JMBoneu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        /*
         * ALGUNES DE LES PARAULES RESERVADES
         * ----------------------------------
         * abstract boolean break byte case catch char class const continue default do double 
         * else extendes false final finally float for goto if implements import instanceof int 
         * interface long native new null private protected public return short static super 
         * switch synchronized this throw transient true try void volatile while
         */
        
        //JBC: Assignar un valor decimal a variable, cal posar una f al final sino pren que es double
        //float euro=166.3862;  // descomentar i dona error
        float euro=166.3862f; // correcte!
       
        
        
        //JBC: tipus primitius, mida i rang
        /*
              TIPUS              TAMANY(BYTES)  RANG
          * ---------------      -------------  -------------------------------------
          *  boolean                   1        true / false     
          *  char                      2        caràcters de la taula ASCII
          *  byte                      1        valor enter entre -(2^7) i (2^7 -1)
          *  short                     2        valor enter entre -(2^15) i (2^15 -1)
          *  unsigned char             1        valor enter entre 0 i (2^8 -1)
          *  int                       4        valor enter entre -(2^31) i (2^31 -1)
          *  long                      8        valor enter entre -(2^63) i (2^63 -1)
          *  float                     4        valor decimal, negatius entre: -3.4028235E38 i 1.4E-45
          *                                                    positius entre: 1.4E-45 i 3.4028235E38
          * double                     8        valor decimal, negatius entre: -1.7976931348623157E308 i -4.9E-324
          *                                                    positius entre: 4.9E-324 i  1.7976931348623157E308
          * 
         */
        
        // JBC: Declaració constant amb la paraula final
        final float PI=3.14159f; 
        final char inicial='J';
        
        //PI=3.1416f; // si descomentem dona error: no es pot modificar un valor constant.
        
    }
}
