/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package propagarexcepciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author joan
 */
public class PropagarExcepciones {

    /**
     * Cuando se produce un error dentro de un método, se puede capturar dentro
     * de él y tratarlo desde ahí mismo. Si no se captura dicho error, Java
     * automáticamente lo propaga al método que lo llamó para que dicho método
     * lo capture. Hay que tener presente que sólo se propagan los errores que 
     * se derivan de la clase RuntimeException. Los errores de la clase
     * Exception (que no pertenezcan a la clase RuntimeException) no se propagan
     * y obligan a capturarlos o lanzarlos
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
            int num1;
            System.out.println("Inserte un número: ");  
            try{
                num1=pedirEntero();
                System.out.println("El número insertado es: "+num1);
            }catch(NumberFormatException e){
                System.out.println("Se han insertado letras en vez de números"
                        + "Mensaje del MAIN");
            }
    }
    public static String pedirCadena(){
        String cadena="";
        InputStreamReader via = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(via);
        try{
            cadena=teclado.readLine();
        }catch(IOException e){
            System.out.println("Nos vamos del programa porque ha ocurrido un error");
            //System.exit(0);
        }
        return cadena;
    }
    
    public static int pedirEntero(){
        String cadena;
        int num=0;
        cadena=pedirCadena();
        try{
            num=Integer.parseInt(cadena);
        }catch(NumberFormatException e){
            System.out.println("Se han insertado letras en vez de números. "
                    + "Mensaje impreso desde el método pedirEntero");
        }
        return num;
    }
    
}
