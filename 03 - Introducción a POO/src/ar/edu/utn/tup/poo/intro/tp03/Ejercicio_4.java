/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.poo.intro.tp03;

/**
 *
 * @author DELL
 */
public class Ejercicio_4 {
    
    public static void main(String[] args) {
        // Crear dos gallinas
        Gallina g1 = new Gallina(1, 1); // id=1, edad=1
        Gallina g2 = new Gallina(2, 2); // id=2, edad=2

        g1.envejecer();
        g1.ponerHuevo();
        g1.ponerHuevo();

        g2.ponerHuevo();
        g2.envejecer();
        g2.envejecer();

        // Mostrar estado final
        g1.mostrarEstado();
        g2.mostrarEstado();
    }
}
