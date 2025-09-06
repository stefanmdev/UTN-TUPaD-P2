/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacionestructurada;

import java.util.Locale;
import java.util.Scanner;

/**
 * Ejercicio 4 - Calculadora de Descuento según categoría
 * @author DELL
 */
public class Ej04_DescuentoCategoria {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        // Entrada
        System.out.print("Ingrese el precio del producto: ");
        double precio = scan.nextDouble();
        scan.nextLine();  

        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        String entradaCat = scan.nextLine().trim().toUpperCase();

        if (precio < 0) {
            System.out.println("El precio no puede ser negativo.");
            return;
        }
        if (entradaCat.isEmpty() || "ABC".indexOf(entradaCat.charAt(0)) == -1) {
            System.out.println("Categoría inválida. Debe ser A, B o C.");
            return;
        }

        char categoria = entradaCat.charAt(0);

        // Determinar porcentaje de descuento
        double porcentaje;
        switch (categoria) {
            case 'A': porcentaje = 0.10; break;
            case 'B': porcentaje = 0.15; break;
            default : porcentaje = 0.20; // 'C'
        }

        // Cálculo
        double descuento = precio * porcentaje;
        double precioFinal = precio - descuento;

        System.out.printf(Locale.US, "Precio original: %.1f%n", precio);
        System.out.println("Descuento aplicado: " + (int)(porcentaje * 100) + "%");
        System.out.printf(Locale.US, "Precio final: %.1f%n", precioFinal);
    }
}
