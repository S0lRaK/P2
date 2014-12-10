/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class Botella {
    // Variables
    private final int capacidad;
    private int cantidad;
    private String tapon;
    private boolean tapado = true;
    private boolean lleno = true;
    private boolean vacio = false;
    
    // Constructores
    public Botella(int capacidad, String tapon) {
        this.capacidad = capacidad;
        this.tapon = tapon;
    }
    
    // Métodos
    public boolean destapar(boolean tapado) {
        if (this.tapado)
            this.tapado = false;
        return this.tapado;
    }
    public boolean tapar(boolean tapado) {
        if (this.tapado == false)
            this.tapado = true;
        return this.tapado;
    }
    public void vaciar(int cantidad, boolean lleno, boolean vacio) {
        Scanner datosIntro = new Scanner(System.in);
        System.out.println("Cantidad actual en la botella = " + cantidad + "cl.");
        System.out.println("¿Cuánto quieres vaciar la botella?");
        int cantidadOut = datosIntro.nextByte();
        cantidad -= cantidadOut;
        if (cantidad <= 0)
        {
             System.out.println("La has dejado seca!");
             cantidad = 0; // Por si ha quedado en negativo
             
        }      
        else
            System.out.println("Todavía quedan " + cantidad + "cl.");
    }
    public void llenar(int capacidad, boolean lleno, boolean vacio) {
        Scanner datosIntro = new Scanner(System.in);
        System.out.println("Capacidad máxima = " + this.capacidad + "cl.");
        System.out.println("Cantidad actual en la botella = " + cantidad + "cl.");
        System.out.println("¿Cuánto quieres llenar la botella?");
        int cantidadIn = datosIntro.nextByte();
        cantidad += cantidadIn;
        if (cantidad > capacidad)
        {
            System.out.println("Está rebosando!");
            cantidad = capacidad;
        }
        else
            System.out.println("Ahora la botella tiene " + cantidad + "cl.");
    }
}