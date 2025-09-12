/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp4;

/**
 *
 * @author DELL
 */
public class PruebaEmpleado {
    public static void main(String[] args) {

        // Crear empleados con distintos constructores
        Empleado e1 = new Empleado("Ana Pérez", "Desarrolladora");
        Empleado e2 = new Empleado("Luis Gómez", "Tester");
        Empleado e3 = new Empleado(500, "María López", "Líder Técnico", 250000.0);

        // Aplicar aumentos de salario con métodos sobrecargados
        e1.actualizarSalario(10);     // aumento del 10 %
        e2.actualizarSalario(15000);  // aumento fijo de $15.000
        e3.actualizarSalario(7.5);    // aumento del 7,5 %

        // Imprimir información de cada empleado
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        // Mostrar total de empleados creados
        System.out.println("Total de empleados: " +
                Empleado.mostrarTotalEmpleados());
    }
}
