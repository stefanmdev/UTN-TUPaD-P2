/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacionestructurada;

import java.util.Scanner;

/**
 * Ejercicio 7 - Validación de Nota entre 0 y 10 (do-while)
 * @author DELL
 */
public class Ej07_ValidacionNotaDoWhile {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double nota; // usamos double por si aceptan decimales (8.5, 9.75, etc.)

        // Ciclo do-while: se ejecuta al menos una vez y repite si la nota es inválida
        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = scan.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Nota guardada correctamente.");
    }
}
