/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp5.ej1;

/**
 *
 * @author DELL
 */
public class Foto {
    private String imagen;   // ruta o nombre de archivo
    private String formato;  // JPG, PNG, etc.

    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }

    public String getImagen() { return imagen; }
    public String getFormato() { return formato; }

    @Override
    public String toString() {
        return "Foto{imagen='" + imagen + "', formato='" + formato + "'}";
    }
}
