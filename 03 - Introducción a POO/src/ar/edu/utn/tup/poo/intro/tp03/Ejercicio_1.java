/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.poo.intro.tp03;

/**
 *
 * @author DELL
 */
public class Ejercicio_1 {
    
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion; // rango 0..10

    public Ejercicio_1(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        setCalificacion(calificacion); // valida rango
    }

    // Métodos requeridos
    public void mostrarInfo() {
        System.out.printf("[Estudiante] %s %s | Curso: %s | Calificación: %.1f%n",
                          nombre, apellido, curso, calificacion);
    }

    public void subirCalificacion(double puntos) {
        if (puntos < 0) return;
        calificacion = Math.min(10, calificacion + puntos);
    }

    public void bajarCalificacion(double puntos) {
        if (puntos < 0) return;
        calificacion = Math.max(0, calificacion - puntos);
    }

    // Getter y Setter de calificación
    public double getCalificacion() { return calificacion; }
    public void setCalificacion(double calificacion) {
        if (calificacion < 0) this.calificacion = 0;
        else if (calificacion > 10) this.calificacion = 10;
        else this.calificacion = calificacion;
    }

    // ---- Método main para probar el ejercicio ----
    public static void main(String[] args) {
        Ejercicio_1 e = new Ejercicio_1("María", "Gómez", "Programación II", 6.5);

        e.mostrarInfo();        // Calificación inicial 6.5
        e.subirCalificacion(2); // → 8.5
        e.mostrarInfo();
        e.bajarCalificacion(4); // → 4.5
        e.mostrarInfo();
    }
}    