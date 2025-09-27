/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp6.universidad;

/**
 *
 * @author DELL
 */
public class MainUniversidad {
    public static void main(String[] args) {
        Universidad uni = new Universidad("UTN - TUP");

        Profesor sofia = new Profesor("P-001", "Sofía Gómez", "POO");
        Profesor agustin = new Profesor("P-002", "Agustín Ruiz", "BD I");

        Curso poo = new Curso("CUR-POO", "Programación Orientada a Objetos");
        Curso bd1 = new Curso("CUR-BD1", "Base de Datos I");
        Curso eda = new Curso("CUR-EDA", "Estructuras de Datos");

        uni.agregarProfesor(sofia);
        uni.agregarProfesor(agustin);
        uni.agregarCurso(poo);
        uni.agregarCurso(bd1);
        uni.agregarCurso(eda);

        // Asignaciones (bidireccional)
        poo.setProfesor(sofia);   // también agrega poo a la lista de sofía
        bd1.setProfesor(agustin);
        eda.setProfesor(sofia);

        System.out.println("== Profesores ==");
        uni.listarProfesores();

        System.out.println("\n== Cursos (con profesor) ==");
        uni.listarCursos();

        // Cambiar un curso de profesor (prueba sincronización)
        System.out.println("\n== Cambiamos EDA a Agustín ==");
        eda.setProfesor(agustin);
        uni.listarCursos();

        // Mostrar cursos de cada profe
        System.out.println("\n== Cursos por profesor ==");
        for (Profesor p : uni.getProfesores()) {
            System.out.println("- " + p.getNombre() + ":");
            p.getCursos().forEach(c -> System.out.println("   • " + c.getCodigo() + " - " + c.getNombre()));
        }
    }
}
