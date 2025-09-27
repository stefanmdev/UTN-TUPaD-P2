/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp5.ej1;

/**
 *
 * @author DELL
 */
public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte; // relación 1–1

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    void asignarPasaporte(Pasaporte p) {
        this.pasaporte = p;
        if (p.getTitular() != this) {   // evita bucle
            p.asignarTitular(this);
        }
    }

    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public Pasaporte getPasaporte() { return pasaporte; }

    @Override
    public String toString() {
        return "Titular{nombre='" + nombre + "', dni='" + dni + "'}";
    }
}
