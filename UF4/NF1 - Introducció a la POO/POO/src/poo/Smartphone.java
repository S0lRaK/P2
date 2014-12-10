/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Carlos
 */
public class Smartphone {

    /**
     * @param args the command line arguments
     */
    
    // Variables
    private String[] color;
    private int capacidad;
    private String version;
    private boolean encendido = false; // por defecto FALSE?
    
    // Constructores
    public Smartphone(String[] color, int capacidad, String version) {
        this.color = color; // array?
        this.capacidad = capacidad;
        this.version = version;
    }
    
    // Métodos
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public boolean encender(boolean encendido) {
        if (this.encendido == false)
            this.encendido = true;
        return this.encendido;
    }
    public boolean apagar(boolean encendido) {
        if (this.encendido == true)
            this.encendido = false;
        return this.encendido;
    }
    public void llamar() {
        
    }
    public void navegar() {
        
    }
    // setters & getters?
}