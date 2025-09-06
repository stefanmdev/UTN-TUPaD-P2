/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacionestructurada;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Ej05_SumaParesWhile {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sumaPares = 0; // acumulador de números pares

        // Ciclo principal (sentinela = 0)
        while (true) {
            System.out.print("Ingrese un número (0 para terminar): ");
            int n = scan.nextInt();

            if (n == 0) {
                // fin del ciclo
                break;
            }

            // Si es par, lo sumamos (cuenta positivos y negativos)
            if (n % 2 == 0) {
                sumaPares += n;
            }
        }

        System.out.println("La suma de los números pares es: " + sumaPares);
    }
}
