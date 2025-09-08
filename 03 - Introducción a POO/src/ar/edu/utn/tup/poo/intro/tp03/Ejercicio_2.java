/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.poo.intro.tp03;

/**
 *
 * @author DELL
 */
public class Ejercicio_2 {
    
    public static void main(String[] args) {
        // Crear una mascota
        Mascota m = new Mascota("Firulais", "Perro", 3);

        // Mostrar información inicial
        m.mostrarInfo();

        // Simular el paso del tiempo
        m.cumplirAnios();
        m.mostrarInfo();

        m.cumplirAnios();
        m.mostrarInfo();
    }
}
