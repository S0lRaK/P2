/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author joan
 * Ejemplo HashSet: para conseguir que no haya elementos duplicados en una colección
 * debemos sobrescribir los métodos equals y hashcode dentro de la clase a la 
 * que pertenencen los objetos de la colección.
 * Con el método equals indicamos cuándo consideramos que dos objetos son iguales
 * Con el método hashCode determinamos cuál es el código de identificiación de 
 * cada objeto(quien tenga el mismo nombre y edad ocupará la misma posición en la tabla)
 */
public class Ejemplo_Set {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Alumno a1=new Alumno("Angel", 60);
    Alumno a2=new Alumno("Angel", 45);
    Alumno a3=new Alumno("Angel", 60);
    Alumno a4=new Alumno("Nieves", 60);
    Alumno a5=new Alumno("Angel", 60);
    Alumno a6=new Alumno("Nieves", 58);
    Alumno a7=new Alumno("Nieves", 60);
    Alumno a8=new Alumno("Nieves", 42);
    Alumno a9=new Alumno("Dolores", 80);
    
    HashSet colec = new HashSet();
    colec.add(a1);
    colec.add(a2);
    colec.add(a3);
    colec.add(a4);
    colec.add(a5);
    colec.add(a6);
    colec.add(a7);
    colec.add(a8);
    colec.add(a9);
    
    Alumno alum;
    Iterator iter=colec.iterator();
    
    while(iter.hasNext()){
        alum=(Alumno)iter.next();
        alum.visualizar();
    }
    
    /*Elimino la posición el alumno a2*/
	/*colec.remove(a2);
    iter=colec.iterator();
    while(iter.hasNext()){
        alum=(Alumno)iter.next();
        alum.visualizar();
    }*/
    }
}
