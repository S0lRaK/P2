/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_set;
/**
 *
 * @author joan
 */
public class Alumno{
    protected String nombre;
    protected int edad;
    
     //constructor
    public Alumno(String n, int e){
        nombre = n;
        edad = e;
    }
    
    public boolean equals(Object obj){
        if (obj instanceof Alumno) {
            Alumno a = (Alumno)obj;
            //Devuelve true si tienen el mismo nombre y la misma edad
            return a.nombre.equals(nombre) && a.edad==edad;
            //return a.nombre.equals(nombre);
            
        }
        else
            return false;
    }
    public int hashCode(){
        return nombre.hashCode()+edad;
        //return nombre.hashCode();
    }
    
    void visualizar(){
        System.out.println("\n\t Nombre: " + nombre + " Edad: " + edad);
    }
    
    
}
