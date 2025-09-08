/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.poo.intro.tp03;

/**
 *
 * @author DELL
 */
public class Ejericio_5 {
    public static void main(String[] args) {
        // Crear la nave con 50 unidades de combustible
        NaveEspacial nave = new NaveEspacial("Aurora", 50);
        nave.mostrarEstado();

        // Intentar avanzar sin recargar
        nave.avanzar(60); // debería fallar por falta de combustible

        // Recargar y avanzar correctamente
        nave.recargarCombustible(40); // +40 → total 90
        nave.avanzar(30); // ahora sí puede avanzar

        // Mostrar estado final
        nave.mostrarEstado();
    }
}
