/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacionestructurada;

/**
 * Ejercicio 12 - Modificación de un array de precios y visualización de resultados
 *
 * a) Declara e inicializa un array con precios
 * b) Muestra los valores originales
 * c) Modifica el precio de un producto específico (3.er elemento)
 * d) Vuelve a mostrar los valores modificados
 *
 * Conceptos:
 *  - double[] para almacenar valores
 *  - for-each para recorrer y mostrar
 *  - modificación por índice
 * @author DELL
 */
public class Ej12_ModificarArrayPrecios {
    
    public static void main(String[] args) {
        // a) Declaración e inicialización del array de precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // b) Mostrar valores originales
        System.out.println("Precios originales:");
        mostrarPrecios(precios);

        // c) Modificar el precio de un producto específico (tercer elemento, índice 2)
        precios[2] = 129.99;

        // d) Mostrar valores modificados
        System.out.println();
        System.out.println("Precios modificados:");
        mostrarPrecios(precios);
    }

    /** Recorre el array con for-each e imprime cada precio en el formato pedido. */
    private static void mostrarPrecios(double[] arr) {
        for (double precio : arr) {
            // Usamos la conversión estándar de double a String (muestra 299.5, 399.0, etc.)
            System.out.println("Precio: $" + precio);
        }
    }
}
