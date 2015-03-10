/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lanzarexcepciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author joan
 */
public class LanzarExcepciones {

    /**
     * Dentro de un método, podemos querer controlar un error, pero puede suceder
     * que también queramos controlarlo fuera de dicho método. Para ello, es
     * necesario capturar dicho error dentro del propio método (try catch) y, 
     * dentro de dicho catch, lanzar dicho error con el fin de que lo pueda 
     * recibir el método que llamó a dicha función. Es importante tener presente
     * que la instrucción throw provoca que se abandone el flujo de ejecución
     * de dicho método, cediendo el control al método llamante y pasando por el
     * catch (del método llamanate) que captura dicho error. Si el método lanza 
     * un error no perteneciente a la clase RuntimeException, en la cabecera del
     * método hay que poner throws NombreClaseException.
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
            System.out.println("Se han insertado letras en vez de un número. "
                    + "Mensaje impreso desde el Main");
        }catch(IOException e){
            System.out.println("Ha habido un error en la entrada de datos");
        }
    }
    public static String pedirCadena() throws IOException{
        String cadena="";
        InputStreamReader via = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(via);
        cadena=teclado.readLine();
        return cadena;
    }
    public static int pedirEntero() throws IOException{
        String cadena;
        int num=0;
        cadena=pedirCadena();
        try{
        num=Integer.parseInt(cadena);
        }catch(NumberFormatException e){
            System.out.println("Ha insertado letras en lugar de un número");
            throw e;
        }
        return num;
    }
}

