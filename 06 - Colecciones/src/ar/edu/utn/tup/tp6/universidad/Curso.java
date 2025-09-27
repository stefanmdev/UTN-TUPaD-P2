/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp6.universidad;

/**
 *
 * @author DELL
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor; // lado N → referencia a 1

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }

    public void setProfesor(Profesor p) {
        if (this.profesor == p) return;
        // quitar del profesor anterior
        if (this.profesor != null) this.profesor.eliminarCurso(this);
        // asignar nuevo
        this.profesor = p;
        // agregar a la lista del nuevo profesor (si no está)
        if (p != null && !p.getCursos().contains(this)) p.agregarCurso(this);
    }

    @Override
    public String toString() {
        return "Curso{codigo='" + codigo + "', nombre='" + nombre + "'" +
               (profesor != null ? ", profesor=" + profesor.getNombre() : "") + "}";
    }
}
