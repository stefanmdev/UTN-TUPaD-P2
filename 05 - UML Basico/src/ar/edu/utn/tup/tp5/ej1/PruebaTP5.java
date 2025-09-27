/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp5.ej1;

import java.time.LocalDate;
/**
 *
 * @author DELL
 */
public class PruebaTP5 {
    public static void main(String[] args) {
        Foto f = new Foto("foto_123.jpg", "JPG");
        Pasaporte p = new Pasaporte("AR-123456", LocalDate.of(2024, 5, 10), f);
        Titular t = new Titular("Julia Pérez", "40.123.456");

        p.asignarTitular(t);

        System.out.println(p);
        System.out.println(t);
        System.out.println("¿Mismo objeto? " + (t.getPasaporte() == p));
    }
}
