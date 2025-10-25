/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp8.excepciones;

/**
 *
 * @author DELL
 */
public class DemoEdad {
    public static void main(String[] args) {
        try {
            var p = new Persona(130);
            System.out.println(p.getEdad());
        } catch (EdadInvalidaException e) {
            System.out.println("Validación OK: " + e.getMessage());
        }
    }
}
