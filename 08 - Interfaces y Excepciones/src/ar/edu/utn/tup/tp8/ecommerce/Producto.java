/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp8.ecommerce;

/**
 *
 * @author DELL
 */
public class Producto implements Pagable {
    private final String nombre;
    private final double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }

    @Override
    public double calcularTotal() {
        return precio; // un producto “paga” su propio precio
    }

    @Override
    public String toString() {
        return nombre + " ($" + String.format("%.2f", precio) + ")";
    }
}
