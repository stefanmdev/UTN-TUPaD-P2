/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp5.ej12;

/**
 *
 * @author DELL
 */
public class Calculadora {
    public void calcular(Impuesto impuesto) {
        // Ejemplo simple de "cálculo": mostrar importe y titular
        System.out.println("🧮 Calculando impuesto de $" + impuesto.getMonto() +
                " para " + impuesto.getContribuyente().getNombre() +
                " (CUIL " + impuesto.getContribuyente().getCuil() + ")");
        // Aquí podrías aplicar reglas, intereses, etc.
    }
}
