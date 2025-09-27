/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp6.biblioteca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author DELL
 */
public class Biblioteca {
    private String nombre;
    private final ArrayList<Libro> libros = new ArrayList<>();

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    // COMPOSICIÓN: la biblio crea los libros a partir de datos primitivos/objetos de apoyo (Autor)
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        if (isbn == null || isbn.isBlank() || buscarLibroPorIsbn(isbn) != null) return;
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
    }

    public boolean eliminarLibro(String isbn) {
        Libro l = buscarLibroPorIsbn(isbn);
        return l != null && libros.remove(l);
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) if (l.getIsbn().equalsIgnoreCase(isbn)) return l;
        return null;
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("(Sin libros en la biblioteca)");
            return;
        }
        for (Libro l : libros) System.out.println(l);
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public List<Libro> filtrarLibrosPorAnio(int anio) {
        ArrayList<Libro> res = new ArrayList<>();
        for (Libro l : libros) if (l.getAnioPublicacion() == anio) res.add(l);
        return res;
    }

    public void mostrarAutoresDisponibles() {
        // Listado simple 
        for (Libro l : libros) System.out.println(l.getAutor());
        
    }

    public List<Libro> getLibrosSoloLectura() {
        return Collections.unmodifiableList(libros);
    }

    public String getNombre() { return nombre; }
}
