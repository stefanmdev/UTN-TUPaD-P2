/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp5.ej8;

/**
 *
 * @author DELL
 */
public class PruebaTP5_Ej8 {
    public static void main(String[] args) {
        Usuario u = new Usuario("Carla Pérez", "carla@example.com");
        FirmaDigital f = new FirmaDigital("A1B2C3D4", "2025-10-01", u);
        Documento d = new Documento("Contrato", "Texto del contrato...", f);

        System.out.println(d);
        System.out.println("Firmado por: " + d.getFirma().getUsuario().getNombre());
        System.out.println("Hash: " + d.getFirma().getCodigoHash());
    }
}
