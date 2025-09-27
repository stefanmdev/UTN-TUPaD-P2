/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp5.ej8;

/**
 *
 * @author DELL
 */
public class FirmaDigital {
    private String codigoHash;
    private String fecha;     // p.ej. "2025-10-01"
    private Usuario usuario;  // agregación (unidireccional)

    public FirmaDigital(String codigoHash, String fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public String getCodigoHash() { return codigoHash; }
    public String getFecha() { return fecha; }
    public Usuario getUsuario() { return usuario; }

    @Override
    public String toString() {
        return "FirmaDigital{codigoHash='" + codigoHash + "', fecha='" + fecha +
               "', usuario=" + usuario + "}";
    }
}
