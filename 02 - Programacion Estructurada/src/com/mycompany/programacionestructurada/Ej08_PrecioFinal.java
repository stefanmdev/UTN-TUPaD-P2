/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacionestructurada;

import java.util.Locale;
import java.util.Scanner;

/**
 * Ejercicio 8 - Cálculo del Precio Final con impuesto y descuento
 * 
 * Fórmula:
 * PrecioFinal = PrecioBase + (PrecioBase * Impuesto) - (PrecioBase * Descuento)
 *
 * Nota: la firma pedida es calcularPrecioFinal(double impuesto, double descuento),
 * por eso usamos una variable de clase 'precioBase' que seteamos desde main().
 * 
 * @author DELL
 */
public class Ej08_PrecioFinal {
    
    // Variable "global" a la clase para respetar la firma pedida en la consigna
    private static double precioBase;

    /** Calcula el precio final. 'impuesto' y 'descuento' vienen en fracción (ej: 0.10 = 10%). */
    public static double calcularPrecioFinal(double impuesto, double descuento) {
        return precioBase + (precioBase * impuesto) - (precioBase * descuento);
    }

    public static void main(String[] args) {
        // Locale.US para que los decimales salgan con punto, como en el ejemplo (105.0)
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        // Entradas
        System.out.print("Ingrese el precio base del producto: ");
        precioBase = scan.nextDouble();

        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impPorc = scan.nextDouble();

        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descPorc = scan.nextDouble();

        // Convertimos de % a fracción
        double impuesto = impPorc / 100.0;
        double descuento = descPorc / 100.0;

        // Cálculo
        double precioFinal = calcularPrecioFinal(impuesto, descuento);

        // Salida EXACTA al estilo del enunciado
        System.out.printf(Locale.US, "El precio final del producto es: %.1f%n", precioFinal);
    }
}
