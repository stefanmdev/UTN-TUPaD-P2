/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp5.ej14;

/**
 *
 * @author DELL
 */
public class EditorVideo {
    public void exportar(String formato, Proyecto proyecto) {
        // Crea el Render dentro del método (no lo guarda como atributo)
        Render render = new Render(formato, proyecto);
        System.out.println("🎞️ Exportando proyecto: " + render);
    }
}
