/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacionestructurada;

import java.util.Locale;
import java.util.Scanner;

/**
 * Ejercicio 11 - Cálculo de descuento especial usando variable global
 * Variable global: 10% (0.10)
 * Método: calcularDescuentoEspecial(double precio)
 *   - Usa la variable global
 *   - Declara variable local 'descuentoAplicado'
 *   - Muestra el descuento y el precio final con descuento
 * @author DELL
 */
public class Ej11_DescuentoEspecial {
    
    // Variable "global" (de clase) con el 10% de descuento
    private static double DESCUENTO_ESPECIAL = 0.10;

    /** Calcula y MUESTRA el descuento aplicado y el precio final. */
    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;   // variable local
        double precioFinal = precio - descuentoAplicado;

        System.out.printf(Locale.US, "El descuento especial aplicado es: %.1f%n", descuentoAplicado);
        System.out.printf(Locale.US, "El precio final con descuento es: %.1f%n", precioFinal);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Ingrese el precio del producto: ");
        double precio = scan.nextDouble();

        calcularDescuentoEspecial(precio);
    }
}
