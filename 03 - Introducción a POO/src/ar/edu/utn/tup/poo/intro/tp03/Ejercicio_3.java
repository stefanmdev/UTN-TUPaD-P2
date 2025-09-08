/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.poo.intro.tp03;

/**
 *
 * @author DELL
 */
public class Ejercicio_3 {
    
    public static void main(String[] args) {
        // Crear un libro
        Libro libro = new Libro("Clean Code", "Robert C. Martin", 2008);
        libro.mostrarInfo();

        // Intentar modificar con año inválido
        libro.setAnioPublicacion(1300); // muy antiguo
        libro.mostrarInfo();

        // Modificar con año válido
        libro.setAnioPublicacion(2010);
        libro.mostrarInfo();
    }
}
