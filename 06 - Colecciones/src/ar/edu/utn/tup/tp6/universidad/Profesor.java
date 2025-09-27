/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp6.universidad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author DELL
 */
public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private final ArrayList<Curso> cursos = new ArrayList<>();

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }
    public List<Curso> getCursos() { return Collections.unmodifiableList(cursos); }

    public void agregarCurso(Curso c) {
        if (c == null || cursos.contains(c)) return;
        cursos.add(c);
        if (c.getProfesor() != this) c.setProfesor(this); // sincroniza
    }

    public void eliminarCurso(Curso c) {
        if (cursos.remove(c) && c.getProfesor() == this) {
            c.setProfesor(null); // sincroniza
        }
    }

    @Override
    public String toString() {
        return "Profesor{id='" + id + "', nombre='" + nombre + "', esp='" + especialidad + "'}";
    }
}
