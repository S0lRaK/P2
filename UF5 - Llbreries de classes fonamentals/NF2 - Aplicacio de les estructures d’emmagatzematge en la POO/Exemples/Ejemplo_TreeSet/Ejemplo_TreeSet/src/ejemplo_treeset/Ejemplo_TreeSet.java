/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_treeset;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author joan
 * La diferencia con la clase HashSet es que mantiene un orden entre los 
 * elementos que forman la colección
 * Al crear un TreeSet es obligatorio que la clase tenga esta cabecera:
 * public class Alumno implements Comparable <Alumno>
 * Comparable es una interfaz, y obliga a recodificar el método:
 * public int compareTo(Alumno obj)
 * ***********************************************************************
 * Este programa visualiza los datos de la colección, ordenados de forma 
 * ascendente por el nombre. Entre todos los alumnos que tienen el mismo nombre, 
 * los visualizará ordenados de forma ascendente por la edad.
 * Si hay alumnos que coinciden por el nombre y la edad, sólo visualizará uno.
 */
public class Ejemplo_TreeSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno a1=new Alumno("Miquel", 60); 
        Alumno a2=new Alumno("Pere", 60); 
        Alumno a3=new Alumno("Miquel", 60); 
        Alumno a4=new Alumno("Pere", 58); 
        Alumno a5=new Alumno("Miquel", 60); 
        Alumno a6=new Alumno("Pere", 60); 
        Alumno a7=new Alumno("Pere", 42); 
        Alumno a8=new Alumno("Andreu", 50); 
        Alumno a9=new Alumno("Miquel", 45); 
        Alumno a10=new Alumno("Josep", 45);
        Alumno al;
        
        TreeSet<Alumno> colec=new TreeSet<Alumno>();
        
        colec.add(a1);
        colec.add(a2);
        colec.add(a3);
        colec.add(a4);
        colec.add(a5);
        colec.add(a6);
        colec.add(a7);
        colec.add(a8);
        colec.add(a9);
        colec.add(a10);
        
        Iterator iter=colec.iterator();
        while(iter.hasNext()){
            al=(Alumno)iter.next();
            al.visualizar();

        }
        
        
        
        
    }
}
