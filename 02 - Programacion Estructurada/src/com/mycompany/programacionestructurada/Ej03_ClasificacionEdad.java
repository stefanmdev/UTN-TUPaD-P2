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
public class Ej03_ClasificacionEdad {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Entrada
        System.out.print("Ingrese su edad: ");
        int edad = scan.nextInt();

        // Proceso + salida (límites exactos según el enunciado)
        if (edad < 12) {
            System.out.println("Eres un Niño.");
        } else if (edad <= 17) {
            System.out.println("Eres un Adolescente.");
        } else if (edad <= 59) {
            System.out.println("Eres un Adulto.");
        } else {
            System.out.println("Eres un Adulto mayor.");
        }
    }
}
