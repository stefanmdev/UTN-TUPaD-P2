/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp5.ej5;

import java.util.Objects;
/**
 *
 * @author DELL
 */
public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;    // composición 1–1
    private Propietario propietario;  // asociación 1–1

    public Computadora(String marca, String numeroSerie, PlacaMadre placaMadre) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = Objects.requireNonNull(placaMadre); // composición: debe existir
    }

    // enlace bidireccional seguro
    public void asignarPropietario(Propietario p) {
        this.propietario = p;
        if (p.getComputadora() != this) {
            p.asignarComputadora(this);
        }
    }

    public String getMarca() { return marca; }
    public String getNumeroSerie() { return numeroSerie; }
    public PlacaMadre getPlacaMadre() { return placaMadre; }
    public Propietario getPropietario() { return propietario; }

    @Override
    public String toString() {
        return "Computadora{marca='" + marca + "', numeroSerie='" + numeroSerie + 
               "', placaMadre=" + placaMadre +
               ", propietario=" + (propietario != null ? propietario.getNombre() : "sin propietario") +
               "}";
    }
}
