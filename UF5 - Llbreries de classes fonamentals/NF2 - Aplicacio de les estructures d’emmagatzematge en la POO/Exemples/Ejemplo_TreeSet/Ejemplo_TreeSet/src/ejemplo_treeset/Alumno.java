/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_treeset;

/**
 *
 * @author joan
 */
public class Alumno implements Comparable <Alumno>{
    protected String nombre;
    protected int edad;
    
   //constructor
    public Alumno(String n, int e){
        nombre = n;
        edad = e;
    }
    
    /*Compara el objeto que recibe con los datos del objeto que ha llamado a
     dicho métododo, de tal forma que:
     - Si devuelve un positivo, es porque el objeto que lo ha llamado va después
     que el objeto que recibe
     - Si devuelve un cero, es porque dichos objetos son iguales
     - Si devuelve un negativo, es porque el objeto que lo ha llamado va antes
     que el objeto que recibe*/
    public int compareTo(Alumno obj){
        int comparacion=nombre.compareTo(obj.nombre);
        if(comparacion==0){
            if(edad<obj.edad)
                return 1;
            else
                if(edad==obj.edad)
                    return 0;
                else
                    return -1;
        }
        else
            return comparacion;
    }
    
    void visualizar(){
        System.out.println("\n\t Nombre: " + nombre + " Edad: " + edad);
    }
}
