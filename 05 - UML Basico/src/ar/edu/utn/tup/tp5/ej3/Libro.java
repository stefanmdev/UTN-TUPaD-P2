/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp5.ej3;

/**
 *
 * @author DELL
 */

// Asociación unidireccional: Libro -> Autor
// Agregación: Libro -> Editorial
public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor;          // asociación (unidireccional)
    private Editorial editorial;  // agregación

    public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getTitulo() { return titulo; }
    public String getIsbn() { return isbn; }
    public Autor getAutor() { return autor; }
    public Editorial getEditorial() { return editorial; }

    @Override
    public String toString() {
        return "Libro{titulo='" + titulo + "', isbn='" + isbn + 
               "', autor=" + autor + ", editorial=" + editorial + "}";
    }
}
