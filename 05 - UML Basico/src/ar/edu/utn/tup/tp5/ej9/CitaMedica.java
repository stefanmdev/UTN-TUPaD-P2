/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp5.ej9;

/**
 *
 * @author DELL
 */
public class CitaMedica {
     private String fecha;  // "2025-11-02"
    private String hora;   // "10:30"
    private Paciente paciente;
    private Profesional profesional;

    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }

    public String getFecha() { return fecha; }
    public String getHora() { return hora; }
    public Paciente getPaciente() { return paciente; }
    public Profesional getProfesional() { return profesional; }

    @Override
    public String toString() {
        return "CitaMedica{fecha='" + fecha + "', hora='" + hora +
               "', paciente=" + paciente + ", profesional=" + profesional + "}";
    }
}
