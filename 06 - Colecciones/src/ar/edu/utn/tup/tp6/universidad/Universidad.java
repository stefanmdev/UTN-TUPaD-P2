/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp6.universidad;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class Universidad {
    private String nombre;
    private final ArrayList<Profesor> profesores = new ArrayList<>();
    private final ArrayList<Curso> cursos = new ArrayList<>();

    public Universidad(String nombre) { this.nombre = nombre; }

    public void agregarProfesor(Profesor p) {
        if (p != null && !profesores.contains(p)) profesores.add(p);
    }

    public void agregarCurso(Curso c) {
        if (c != null && !cursos.contains(c)) cursos.add(c);
    }

    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) if (p.getId().equalsIgnoreCase(id)) return p;
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) if (c.getCodigo().equalsIgnoreCase(codigo)) return c;
        return null;
    }

    public List<Profesor> getProfesores() { return new ArrayList<>(profesores); }
    public List<Curso> getCursos() { return new ArrayList<>(cursos); }

    public void listarProfesores() { profesores.forEach(System.out::println); }
    public void listarCursos()     { cursos.forEach(System.out::println); }
}
