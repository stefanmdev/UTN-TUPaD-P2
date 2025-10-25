/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp8.excepciones;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class ConversionCadenaNumero {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese un entero: ");
            String s = sc.nextLine();
            try {
                int n = Integer.parseInt(s);
                System.out.println("OK: " + n);
            } catch (NumberFormatException e) {
                System.out.println("Formato inválido: " + s);
            }
        }
    }
}
