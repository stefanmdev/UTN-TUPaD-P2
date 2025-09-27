/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp5.ej7;

/**
 *
 * @author DELL
 */
public class PruebaTP5_Ej7 {
    public static void main(String[] args) {
        Motor m = new Motor("Nafta", "MTR-98765");
        Vehiculo v = new Vehiculo("AB123CD", "Toyota Corolla", m);
        Conductor c = new Conductor("Diego Romero", "LIC-456789");
        v.setConductor(c);

        System.out.println(v);
        System.out.println("Conductor del vehículo: " + v.getConductor().getNombre());
        System.out.println("Vehículo del conductor: " + c.getVehiculo().getPatente());
    }
}
