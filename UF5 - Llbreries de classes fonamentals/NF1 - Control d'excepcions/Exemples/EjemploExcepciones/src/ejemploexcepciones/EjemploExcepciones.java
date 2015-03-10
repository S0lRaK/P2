/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploexcepciones;

import java.io.*;

/**
 *
 * @author joan
 */
public class EjemploExcepciones {

    /**
     * Cuando un programador prevé que en una situación extraordinaria una instrucción
     * o un bloque de instrucciones puediera llegar a provocar algún tipo de error,
     * tendría que capturar ese posible error con el fin de poder controlarlo. El 
     * objetivo es desviar, con ello, la ejecución del programa y llevar a cabo las
     * operaciones que sean necesarias ante tal situación. Esta captura se hace
     * insertando las instrucciones que pueden provocar algún error en un 
     * bloque try catch.
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
        num=Integer.parseInt(cadena);
        return num;
    }
}
