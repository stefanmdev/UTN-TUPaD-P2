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
public class Auto extends Vehiculo {
     private int puertas;

    public Auto(String marca, String modelo, int puertas) {
        super(marca, modelo);
        this.puertas = puertas;
    }

    @Override
    public void arrancar() {
        System.out.println("El auto arranca con llave.");
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Puertas: " + puertas);
    }
}
