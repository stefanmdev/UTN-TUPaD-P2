/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacionestructurada;

import java.util.Scanner;

/**
 * Ejercicio 10 - Actualización de stock a partir de venta y recepción
 * Fórmula correcta:
 *   NuevoStock = StockActual - CantidadVendida + CantidadRecibida
 * @author DELL
 */
public class Ej10_ActualizarStock {
    
    /** Calcula el nuevo stock luego de vender y recibir productos. */
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = scan.nextInt();

        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = scan.nextInt();

        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = scan.nextInt();

        // Cálculo
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);

        System.out.println("El nuevo stock del producto es: " + nuevoStock);
    }
}
