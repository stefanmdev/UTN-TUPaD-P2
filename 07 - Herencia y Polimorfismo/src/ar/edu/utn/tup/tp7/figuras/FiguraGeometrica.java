/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp7.figuras;

/**
 *
 * @author DELL
 */
public abstract class FiguraGeometrica {
    private final String nombre;

    protected FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }

    // Método abstracto que cada subclase debe implementar
    public abstract double calcularArea();

    @Override
    public String toString() {
        return nombre + " (área=" + String.format("%.2f", calcularArea()) + ")";
    }
}
