/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp5.ej12;

/**
 *
 * @author DELL
 */
public class PruebaTP5_Ej12 {
    public static void main(String[] args) {
        Contribuyente c = new Contribuyente("Marcos Díaz", "20-30111222-6");
        Impuesto imp = new Impuesto(125000.50, c);

        Calculadora calc = new Calculadora();
        calc.calcular(imp);
    }
}
