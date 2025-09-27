/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp6.biblioteca;

import java.util.List;

/**
 *
 * @author DELL
 */
public class MainBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblio = new Biblioteca("Biblioteca Central");

        // Autores
        Autor borges = new Autor("A-001", "Jorge L. Borges", "Argentina");
        Autor cortazar = new Autor("A-002", "Julio Cortázar", "Argentina");
        Autor garcia = new Autor("A-003", "G. García Márquez", "Colombia");

        // Agregar libros (COMPOSICIÓN: los crea la biblioteca)
        biblio.agregarLibro("ISBN-001", "Ficciones", 1944, borges);
        biblio.agregarLibro("ISBN-002", "El Aleph", 1949, borges);
        biblio.agregarLibro("ISBN-003", "Rayuela", 1963, cortazar);
        biblio.agregarLibro("ISBN-004", "Cien años de soledad", 1967, garcia);

        System.out.println("== Libros ==");
        biblio.listarLibros();

        System.out.println("\n== Buscar ISBN-003 ==");
        System.out.println(biblio.buscarLibroPorIsbn("ISBN-003"));

        System.out.println("\n== Filtrar por año 1949 ==");
        List<Libro> anio1949 = biblio.filtrarLibrosPorAnio(1949);
        anio1949.forEach(System.out::println);

        System.out.println("\n== Cantidad total ==");
        System.out.println(biblio.obtenerCantidadLibros());

        System.out.println("\n== Autores disponibles ==");
        biblio.mostrarAutoresDisponibles();

        System.out.println("\n== Eliminar ISBN-002 ==");
        System.out.println(biblio.eliminarLibro("ISBN-002") ? "Eliminado" : "No existe");

        System.out.println("\n== Libros tras eliminar ==");
        biblio.listarLibros();
    }
}
