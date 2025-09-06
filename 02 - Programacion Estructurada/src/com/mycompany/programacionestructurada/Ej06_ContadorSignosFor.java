/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacionestructurada;

import java.util.Scanner;

/**
 * Ejercicio 6 - Contador de Positivos, Negativos y Ceros (for)
 * @author DELL
 */
public class Ej06_ContadorSignosFor {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;
        int ceros     = 0;

        // Pedimos exactamente 10 números usando un for
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int n = scan.nextInt();

            if (n > 0) {
                positivos++;
            } else if (n < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }

        // Salida en el formato solicitado
        System.out.println("Resultados:");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }
}
