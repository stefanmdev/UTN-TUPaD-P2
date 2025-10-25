/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp8.excepciones;

/**
 *
 * @author DELL
 */
public class Persona {
    private final int edad;
    public Persona(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120)
            throw new EdadInvalidaException("Edad fuera de rango (0..120).");
        this.edad = edad;
    }
    public int getEdad() { return edad; }
}
