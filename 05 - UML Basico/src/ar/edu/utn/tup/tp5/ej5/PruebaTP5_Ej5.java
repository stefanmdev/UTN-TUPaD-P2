/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp5.ej5;

/**
 *
 * @author DELL
 */
public class PruebaTP5_Ej5 {
    public static void main(String[] args) {
        PlacaMadre pm = new PlacaMadre("ASUS TUF B550M", "AMD B550");
        Computadora pc = new Computadora("Lenovo", "SN-ABC12345", pm);
        Propietario pr = new Propietario("Sofía Núñez", "42.987.654");

        pc.asignarPropietario(pr);

        System.out.println(pc);
        System.out.println(pr);
        System.out.println("¿Mismo objeto? " + (pr.getComputadora() == pc));
    }
}
