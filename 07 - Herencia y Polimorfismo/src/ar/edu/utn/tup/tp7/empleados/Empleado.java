/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp7.empleados;

/**
 *
 * @author DELL
 */
public abstract class Empleado {
    private final String nombre;

    protected Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }

    /** Cada subclase define cómo se calcula su sueldo. */
    public abstract double calcularSueldo();

    @Override
    public String toString() {
        return nombre + " | Sueldo=$" + String.format("%.2f", calcularSueldo());
    }
}
