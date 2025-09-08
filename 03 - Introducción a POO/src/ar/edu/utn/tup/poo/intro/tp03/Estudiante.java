/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.poo.intro.tp03;

/**
 *
 * @author DELL
 */
public class Estudiante {
    
    public static void main(String[] args) {
        // Instanciar un "Ejercicio_1" que representa a un estudiante
        Ejercicio_1 e = new Ejercicio_1("María", "Gómez", "Programación II", 6.5);

        // Mostrar info
        e.mostrarInfo();

        // Subir calificación
        e.subirCalificacion(2);
        e.mostrarInfo();

        // Bajar calificación
        e.bajarCalificacion(4);
        e.mostrarInfo();
    }
}
