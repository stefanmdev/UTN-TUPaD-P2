/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp5.ej4;

/**
 *
 * @author DELL
 */
public class Cliente {
     private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta; // Asociación bidireccional

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() { return nombre; }
    public String getDni() { return dni; }

    public TarjetaDeCredito getTarjeta() { return tarjeta; }
    public void setTarjeta(TarjetaDeCredito tarjeta) { this.tarjeta = tarjeta; }

    @Override
    public String toString() {
        return "Cliente{nombre='" + nombre + "', dni='" + dni + "'}";
    }
}
