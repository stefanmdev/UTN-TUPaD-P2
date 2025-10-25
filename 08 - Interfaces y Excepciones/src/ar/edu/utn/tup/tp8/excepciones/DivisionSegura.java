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
public class DivisionSegura {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Numerador: ");
            int a = sc.nextInt();
            System.out.print("Denominador: ");
            int b = sc.nextInt();

            try {
                int r = a / b;
                System.out.println("Resultado = " + r);
            } catch (ArithmeticException e) {
                System.out.println("No se puede dividir por cero.");
            }
        }
    }
}
