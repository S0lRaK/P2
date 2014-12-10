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
public class Portatil {
    // Variables
    private float pantalla;
    private int ram;
    private int almacenamiento;
    private boolean encendido = false;
    
    // Constructores
    public Portatil(float pantalla,  int ram, int almacenamiento) {
        this.pantalla = pantalla;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
    }
    
    // Métodos
    public boolean encender(boolean encendido) {
        if (this.encendido == false)
            this.encendido = true;
        return this.encendido;
    }
    public boolean apagar(boolean encendido) {
        if (this.encendido)
            this.encendido = false;
        return this.encendido;
    }
    public void navegar() {
        
    }
    public void desarrollar() {
        
    }
}