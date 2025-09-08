/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.poo.intro.tp03;

/**
 *
 * @author DELL
 */
public class Mascota {
    
    private String nombre;
    private String especie;
    private int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    // Métodos requeridos
    public void mostrarInfo() {
        System.out.printf("[Mascota] %s (%s) | Edad: %d años%n",
                          nombre, especie, edad);
    }

    public void cumplirAnios() {
        edad++;
    }
}
