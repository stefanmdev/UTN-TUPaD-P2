/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp5.ej9;

/**
 *
 * @author DELL
 */
public class Paciente {
    private String nombre;
    private String obraSocial;

    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    public String getNombre() { return nombre; }
    public String getObraSocial() { return obraSocial; }

    @Override
    public String toString() {
        return "Paciente{nombre='" + nombre + "', obraSocial='" + obraSocial + "'}";
    }
}
