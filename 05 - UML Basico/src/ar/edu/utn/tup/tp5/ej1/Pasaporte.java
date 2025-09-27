/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp5.ej1;

import java.time.LocalDate;
import java.util.Objects;
/**
 *
 * @author DELL
 */
public class Pasaporte {
    private String numero;
    private LocalDate fechaEmision;
    private Foto foto;       // composición 1–1
    private Titular titular; // asociación 1–1

    public Pasaporte(String numero, LocalDate fechaEmision, Foto foto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = Objects.requireNonNull(foto);
    }

    public void asignarTitular(Titular titular) {
        this.titular = titular;
        if (titular.getPasaporte() != this) { // evita bucle
            titular.asignarPasaporte(this);
        }
    }

    public String getNumero() { return numero; }
    public LocalDate getFechaEmision() { return fechaEmision; }
    public Foto getFoto() { return foto; }
    public Titular getTitular() { return titular; }

    @Override
    public String toString() {
        return "Pasaporte{numero='" + numero + "', fechaEmision=" + fechaEmision +
               ", foto=" + foto +
               ", titular=" + (titular != null ? titular.getNombre() : "sin titular") +
               '}';
    }
}
