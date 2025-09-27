/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp5.ej7;

/**
 *
 * @author DELL
 */
public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;         // Agregación
    private Conductor conductor; // Asociación bidireccional

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        conductor.setVehiculo(this);
    }

    public String getPatente() { return patente; }
    public String getModelo() { return modelo; }
    public Motor getMotor() { return motor; }
    public Conductor getConductor() { return conductor; }

    @Override
    public String toString() {
        return "Vehiculo{patente='" + patente + "', modelo='" + modelo +
               "', motor=" + motor + "}";
    }
}
