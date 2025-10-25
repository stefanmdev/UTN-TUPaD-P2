/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp8.ecommerce;

/**
 *
 * @author DELL
 */
public class Cliente implements Notificable {
     private final String nombre;
    public Cliente(String nombre) { this.nombre = nombre; }

    @Override
    public void notificar(String mensaje) {
        System.out.println("Cliente " + nombre + " recibió: " + mensaje);
    }
}
