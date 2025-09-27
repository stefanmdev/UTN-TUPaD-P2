/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp5.ej5;

/**
 *
 * @author DELL
 */
public class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora; // relación inversa 1–1

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    void asignarComputadora(Computadora c) {       // paquete-privado para controlar el enlace
        this.computadora = c;
        if (c.getPropietario() != this) {
            c.asignarPropietario(this);
        }
    }

    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public Computadora getComputadora() { return computadora; }

    @Override
    public String toString() {
        return "Propietario{nombre='" + nombre + "', dni='" + dni + "'}";
    }
}
