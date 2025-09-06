/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacionestructurada;

/**
 * Ejercicio 13 - Impresión recursiva de arrays antes y después de modificar un elemento
 *
 * a) Declara e inicializa un array con precios
 * b) Usa una función recursiva para mostrar los precios originales
 * c) Modifica el precio de un producto específico (índice 2)
 * d) Usa otra función recursiva para mostrar los precios modificados
 *
 * Conceptos:
 *  - Uso de double[] para almacenar valores
 *  - Recorridos recursivos con índice como parámetro
 *  - Modificación por índice y reimpresión
 * @author DELL
 */
public class Ej13_ImpresionRecursivaArray {
    
    public static void main(String[] args) {
        // a) Array de precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // b) Mostrar precios originales (recursivo)
        System.out.println("Precios originales:");
        imprimirOriginalRec(precios, 0);

        // c) Modificar un elemento específico (tercer elemento, índice 2)
        precios[2] = 129.99;

        // d) Mostrar precios modificados (recursivo)
        System.out.println("Precios modificados:");
        imprimirModificadoRec(precios, 0);
    }

    /** Imprime recursivamente los precios (versión "original"). */
    private static void imprimirOriginalRec(double[] arr, int i) {
        if (i == arr.length) return;                 // caso base
        System.out.println("Precio: $" + arr[i]);    // trabajo
        imprimirOriginalRec(arr, i + 1);             // paso recursivo
    }

    /** Imprime recursivamente los precios (versión "modificada"). */
    private static void imprimirModificadoRec(double[] arr, int i) {
        if (i == arr.length) return;                 // caso base
        System.out.println("Precio: $" + arr[i]);    // trabajo
        imprimirModificadoRec(arr, i + 1);           // paso recursivo
    }
}
