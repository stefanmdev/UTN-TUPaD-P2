/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp5.ej10;

/**
 *
 * @author DELL
 */
public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta; // asociación bidireccional

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    void asignarCuenta(CuentaBancaria c) {
        this.cuenta = c;
        if (c.getTitular() != this) {
            c.asignarTitular(this);
        }
    }

    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public CuentaBancaria getCuenta() { return cuenta; }

    @Override
    public String toString() {
        return "Titular{nombre='" + nombre + "', dni='" + dni + "'}";
    }
}
