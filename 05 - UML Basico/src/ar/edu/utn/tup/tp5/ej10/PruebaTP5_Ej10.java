/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp5.ej10;

/**
 *
 * @author DELL
 */
public class PruebaTP5_Ej10 {
    public static void main(String[] args) {
        ClaveSeguridad clave = new ClaveSeguridad("ABC123", "2025-10-05");
        CuentaBancaria cuenta = new CuentaBancaria("1234567890123456789012", 150000.75, clave);
        Titular titular = new Titular("Valeria Soto", "44.987.321");

        cuenta.asignarTitular(titular);

        System.out.println(cuenta);
        System.out.println(titular);
        System.out.println("¿Mismo objeto? " + (titular.getCuenta() == cuenta));
    }
}
