/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp5.ej9;

/**
 *
 * @author DELL
 */
public class PruebaTP5_Ej9 {
    public static void main(String[] args) {
        Paciente p = new Paciente("Lucía Gómez", "OSDE");
        Profesional prof = new Profesional("Dr. Pérez", "Cardiología");
        CitaMedica cita = new CitaMedica("2025-11-02", "10:30", p, prof);

        System.out.println(cita);
        System.out.println("Paciente: " + cita.getPaciente().getNombre());
        System.out.println("Profesional: " + cita.getProfesional().getNombre());
    }
}
