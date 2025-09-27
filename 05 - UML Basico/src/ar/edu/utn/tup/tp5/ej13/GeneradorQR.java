/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp5.ej13;

/**
 *
 * @author DELL
 */
public class GeneradorQR {
    public void generar(String valor, Usuario usuario) {
        // Crea el objeto dentro del método (no lo guarda como atributo)
        CodigoQR codigo = new CodigoQR(valor, usuario);
        System.out.println("📲 Código QR generado: " + codigo);
    }
}
