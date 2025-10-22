/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp7.empleados;

/**
 *
 * @author DELL
 */
public class DemoEmpleados {
    public static void main(String[] args) {
        Empleado[] lista = {
            new EmpleadoPlanta("Ana", 350_000, 45_000),
            new EmpleadoTemporal("Luis", 20, 9_000),
            new EmpleadoPlanta("Marta", 420_000, 60_000)
        };

        int plantas = 0, temporales = 0;

        System.out.println("== Nómina ==");
        for (Empleado e : lista) {
            System.out.println(e);              // toString + polimorfismo
            if (e instanceof EmpleadoPlanta) plantas++;
            if (e instanceof EmpleadoTemporal) temporales++;
        }

        System.out.printf("%nResumen → Planta: %d | Temporales: %d%n",
                plantas, temporales);
    }
}
