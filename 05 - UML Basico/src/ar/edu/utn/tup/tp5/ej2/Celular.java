/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp5.ej2;

import java.util.Objects;
/**
 *
 * @author DELL
 */
public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria;   // agregación 1–1
    private Usuario usuario;   // asociación 1–1

    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = Objects.requireNonNull(bateria);
    }

    public void asignarUsuario(Usuario usuario) {
        this.usuario = usuario;
        if (usuario.getCelular() != this) {
            usuario.asignarCelular(this);
        }
    }

    public String getImei() { return imei; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public Bateria getBateria() { return bateria; }
    public Usuario getUsuario() { return usuario; }

    @Override
    public String toString() {
        return "Celular{imei='" + imei + "', marca='" + marca + "', modelo='" + modelo +
               "', bateria=" + bateria +
               ", usuario=" + (usuario != null ? usuario.getNombre() : "sin usuario") +
               "}";
    }
}
