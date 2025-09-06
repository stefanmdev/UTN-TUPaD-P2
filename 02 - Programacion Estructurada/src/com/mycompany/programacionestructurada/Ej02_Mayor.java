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
public class Ej02_Mayor {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Entradas
        System.out.print("Ingrese el primer número: ");
        int a = scan.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int b = scan.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int c = scan.nextInt();

        // Cálculo del máximo (sin usar librerías para que se vea el razonamiento)
        int max = a;           // asumimos que el primero es el mayor
        if (b > max) max = b;  // comparamos con el segundo
        if (c > max) max = c;  // comparamos con el tercero

        // Salida
        System.out.println("El mayor es: " + max);
    }
}
