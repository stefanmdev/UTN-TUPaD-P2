/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp7.vehiculos;

import ar.edu.utn.tup.tp7.vehiculos.Vehiculo;

/**
 *
 * @author DELL
 */
public class DemoVehiculos {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo("Toyota", "Hilux");
        Auto a1 = new Auto("Ford", "Focus", 5);

        v1.arrancar();
        a1.arrancar();

        System.out.println("\nDatos del auto:");
        a1.mostrarDatos();
    }
}
