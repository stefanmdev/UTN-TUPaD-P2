/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp5.ej11;

/**
 *
 * @author DELL
 */
public class PruebaTP5_Ej11 {
    public static void main(String[] args) {
        Artista artista = new Artista("Daft Punk", "Electrónica");
        Cancion cancion = new Cancion("One More Time", artista);
        Reproductor reproductor = new Reproductor();

        reproductor.reproducir(cancion);
    }
}
