/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp5.ej6;

/**
 *
 * @author DELL
 */
public class PruebaTP5_Ej6 {
    public static void main(String[] args) {
        Cliente c = new Cliente("Nicolás Ruiz", "381-555-1234");
        Mesa m = new Mesa(12, 4);
        Reserva r = new Reserva("2025-10-05", "21:00", c, m);

        System.out.println(r);
        System.out.println("Cliente de la reserva: " + r.getCliente().getNombre());
        System.out.println("Mesa asignada: " + r.getMesa().getNumero());
    }
}
