/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp5.ej2;

/**
 *
 * @author DELL
 */
public class Usuario {
    private String nombre;
    private String dni;
    private Celular celular; // relación inversa 1–1

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    void asignarCelular(Celular c) {
        this.celular = c;
        if (c.getUsuario() != this) {
            c.asignarUsuario(this);
        }
    }

    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public Celular getCelular() { return celular; }

    @Override
    public String toString() {
        return "Usuario{nombre='" + nombre + "', dni='" + dni + "'}";
    }
}
