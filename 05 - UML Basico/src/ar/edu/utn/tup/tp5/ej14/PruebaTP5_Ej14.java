/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp5.ej14;

/**
 *
 * @author DELL
 */
public class PruebaTP5_Ej14 {
    public static void main(String[] args) {
        Proyecto p = new Proyecto("Trailer Película", 8);
        EditorVideo editor = new EditorVideo();

        // Dependencia de creación: se crea el Render dentro del método exportar
        editor.exportar("MP4", p);
    }
}
