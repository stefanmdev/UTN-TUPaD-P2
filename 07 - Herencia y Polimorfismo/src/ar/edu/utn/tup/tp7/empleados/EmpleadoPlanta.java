/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp7.empleados;

/**
 *
 * @author DELL
 */
public class EmpleadoPlanta extends Empleado {
    private final double sueldoBasico;
    private final double bono;

    public EmpleadoPlanta(String nombre, double sueldoBasico, double bono) {
        super(nombre);
        this.sueldoBasico = sueldoBasico;
        this.bono = bono;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBasico + bono;
    }
}
