/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp7.figuras;

/**
 *
 * @author DELL
 */
public class DemoFiguras {
    public static void main(String[] args) {
        FiguraGeometrica f1 = new Circulo(3.5);
        FiguraGeometrica f2 = new Rectangulo(4, 2.5);

        // Polimorfismo
        System.out.println(f1); 
        System.out.println(f2);
    }
}
