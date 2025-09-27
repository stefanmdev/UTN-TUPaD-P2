/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp5.ej13;

/**
 *
 * @author DELL
 */
public class PruebaTP5_Ej13 {
    public static void main(String[] args) {
        Usuario u = new Usuario("Federico Torres", "federico@example.com");
        GeneradorQR generador = new GeneradorQR();

        // Dependencia de creación: se crea el CódigoQR dentro del método
        generador.generar("QR-2025-0001", u);
    }
}
