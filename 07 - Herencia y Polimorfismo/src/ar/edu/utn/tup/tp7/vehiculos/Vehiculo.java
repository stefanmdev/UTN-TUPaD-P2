/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp7.vehiculos;

/**
 *
 * @author DELL
 */
public class Vehiculo {
    protected String marca;
    protected String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void arrancar() {
        System.out.println("El vehículo está arrancando...");
    }

    public void mostrarDatos() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }
}
