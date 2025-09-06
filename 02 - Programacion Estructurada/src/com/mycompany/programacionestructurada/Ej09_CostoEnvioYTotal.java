/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacionestructurada;

import java.util.Locale;
import java.util.Scanner;

/**
 * Ejercicio 9 - Composición de funciones para costo de envío y total de compra
 *  a) calcularCostoEnvio(double peso, String zona)
 *     - Nacional: $5 por kg
 *     - Internacional: $10 por kg
 *  b) calcularTotalCompra(double precioProducto, double costoEnvio)
 *     - Suma precio del producto + costo de envío
 * @author DELL
 */
public class Ej09_CostoEnvioYTotal {
    
    /** Devuelve el costo de envío según zona y peso. */
    public static double calcularCostoEnvio(double peso, String zona) {
        if (peso < 0) return -1; // inválido

        if (zona.equalsIgnoreCase("Nacional")) {
            return 5.0 * peso;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return 10.0 * peso;
        } else {
            return -1; // zona inválida
        }
    }

    /** Devuelve el total a pagar: precio del producto + costo de envío. */
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    public static void main(String[] args) {
        // Locale.US para imprimir decimales con punto (10.0, 60.0)
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        // Entradas (exactamente como en el ejemplo)
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = scan.nextDouble();
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = scan.nextDouble();
        scan.nextLine(); // limpiar salto
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = scan.nextLine().trim();

        // Cálculo del envío
        double costoEnvio = calcularCostoEnvio(peso, zona);
        if (costoEnvio < 0) {
            System.out.println("Datos inválidos. Verifique peso (>= 0) y zona (Nacional/Internacional).");
            return;
        }

        // Cálculo del total
        double total = calcularTotalCompra(precioProducto, costoEnvio);

        System.out.printf(Locale.US, "El costo de envío es: %.1f%n", costoEnvio);
        System.out.printf(Locale.US, "El total a pagar es: %.1f%n", total);
    }
}
