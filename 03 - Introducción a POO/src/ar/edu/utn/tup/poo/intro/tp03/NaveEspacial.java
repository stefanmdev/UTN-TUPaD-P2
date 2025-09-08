/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.poo.intro.tp03;

/**
 *
 * @author DELL
 */
public class NaveEspacial {
    
    private String nombre;
    private int combustible;
    private final int MAX_COMBUSTIBLE = 100;

    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        if (combustibleInicial <= MAX_COMBUSTIBLE) {
            this.combustible = combustibleInicial;
        } else {
            this.combustible = MAX_COMBUSTIBLE;
        }
    }

    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10;
            System.out.println(nombre + " ha despegado. Combustible restante: " + combustible);
        } else {
            System.out.println("⚠️ No hay suficiente combustible para despegar.");
        }
    }

    public void avanzar(int distancia) {
        int consumo = distancia; // 1 unidad de combustible por unidad de distancia
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " avanzó " + distancia + " unidades. Combustible restante: " + combustible);
        } else {
            System.out.println("⚠️ Combustible insuficiente para avanzar " + distancia + " unidades.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("⚠️ Cantidad inválida para recargar.");
            return;
        }
        int antes = combustible;
        combustible = Math.min(MAX_COMBUSTIBLE, combustible + cantidad);
        System.out.println(nombre + " recargó " + (combustible - antes) + " unidades. Combustible actual: " + combustible);
    }

    public void mostrarEstado() {
        System.out.println("[Nave] " + nombre + " | Combustible: " + combustible + "/" + MAX_COMBUSTIBLE);
    }
}
