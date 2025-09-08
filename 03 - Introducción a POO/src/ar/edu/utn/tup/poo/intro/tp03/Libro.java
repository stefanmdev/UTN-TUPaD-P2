/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.poo.intro.tp03;

/**
 *
 * @author DELL
 */
public class Libro {
    
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAnioPublicacion(anioPublicacion); // usamos el setter para validar
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    // Setter con validación
    public void setAnioPublicacion(int anio) {
        int anioMin = 1450; // nacimiento de la imprenta moderna
        int anioMax = java.time.Year.now().getValue(); // año actual
        if (anio >= anioMin && anio <= anioMax) {
            this.anioPublicacion = anio;
        } else {
            System.out.println("⚠️ Año inválido: " + anio);
        }
    }

    // Método de utilidad para mostrar la info del libro
    public void mostrarInfo() {
        System.out.printf("[Libro] \"%s\" de %s (%d)%n",
                          titulo, autor, anioPublicacion);
    }
}
