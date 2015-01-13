/**
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * 
 */

package variablesitipus;
import java.lang.Math;
import java.util.Arrays;
import java.io.*;

/**
 * @version 1.0
 * @since Juny/2012
 * @author JMBoneu
 */
public class VariablesItipus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dies;
        boolean decisio;
        int diesAny=365, any =2012, setmanes=52;
        int a=13, b=18;
        int c=a+b;
        {
            int x=12;
        }
       // System.out.println(x); // Error: variable x no definida en el mateix ambit

        double x=Math.pow(3,3); // 3^3=3*3*3=27
        System.out.println(x);
        do{
            x--;
            System.out.println(x);
        }while (x >0);
        
        int notas[], i;
        notas=new int[3];
        for(i=0; i < 3; i++)
        {
            notas[i]=i;
            System.out.println(notas[i]+" "+i);
        }
        int notas2[]=new int [5];
       // int notas3[10];    // Error!: així no!.
        int notas4[]={1,2,3};
        System.out.println(notas4.length);
        int notas5[][];
        notas5=new int[5][];
        notas5[0]=new int[100];
        notas5[1]=new int[200];
        notas5[2]=new int[300];
        notas5[3]=new int[400];
        notas5[4]=new int[500];
        System.out.println(notas5.length);
        System.out.println(notas5[0].length);
        System.out.println(notas5[1].length);
        System.out.println(notas5[2].length);
        System.out.println(notas5[3].length);
        System.out.println(notas5[4].length);
        Arrays.fill(notas2,-1);
        //System.arraycopy ... copiar arrays.
        
        String texto1;
        String texto2 ="hola";
        String texto3 = "hola"+" caracola";
        String texto4= texto2+texto3;
    //    System.out.println(texto1+"|"+texto2+"|"+texto3+"|"+texto4); //ERROR: texto1 sin incializar
        System.out.println("|"+texto2+"|"+texto3+"|"+texto4);
        char[] palabra={'p','a','l','a','b','R','a'};
        String cadena =new String(palabra);
        byte[] datos = {97,98,99};
        //String codificada = new String (datos,"8859_1");
        System.out.println(cadena);
        
        

    }
}
