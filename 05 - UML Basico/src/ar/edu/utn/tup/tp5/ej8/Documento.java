/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp5.ej8;

import java.util.Objects;

/**
 *
 * @author DELL
 */
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firma;  // composición 1–1

    public Documento(String titulo, String contenido, FirmaDigital firma) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = Objects.requireNonNull(firma);
    }

    public String getTitulo() { return titulo; }
    public String getContenido() { return contenido; }
    public FirmaDigital getFirma() { return firma; }

    @Override
    public String toString() {
        return "Documento{titulo='" + titulo + "', contenido='" + contenido + "', firma=" + firma + "}";
    }
}
