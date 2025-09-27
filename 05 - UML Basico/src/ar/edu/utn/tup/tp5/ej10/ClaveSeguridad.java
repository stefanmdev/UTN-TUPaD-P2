/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp5.ej10;

/**
 *
 * @author DELL
 */
public class ClaveSeguridad {
    private String codigo;
    private String ultimaModificacion;

    public ClaveSeguridad(String codigo, String ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    public String getCodigo() { return codigo; }
    public String getUltimaModificacion() { return ultimaModificacion; }

    @Override
    public String toString() {
        return "ClaveSeguridad{codigo='" + codigo + "', ultimaModificacion='" + ultimaModificacion + "'}";
    }
}
