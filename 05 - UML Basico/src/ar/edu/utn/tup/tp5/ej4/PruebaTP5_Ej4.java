/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp5.ej4;

/**
 *
 * @author DELL
 */
public class PruebaTP5_Ej4 {
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Nación", "30-12345678-9");
        Cliente cliente = new Cliente("María López", "41.789.654");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("4500 1234 5678 9010", "12/28");

        // Relacionar objetos
        tarjeta.setBanco(banco);
        tarjeta.setCliente(cliente);
        cliente.setTarjeta(tarjeta);

        // Mostrar resultados
        System.out.println(tarjeta);
        System.out.println(cliente);
        System.out.println(banco);
        System.out.println("¿Mismo objeto? " + (cliente.getTarjeta() == tarjeta));
    }
}
