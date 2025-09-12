/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp4;

/**
 *
 * @author DELL
 */
public class Empleado {

    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0; // contador global
    private static int nextId = 1;         // para ID automático

    // Recibe todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
        // Asegura que nextId siempre sea mayor
        if (id >= nextId) nextId = id + 1;
    }

    // Recibe solo nombre y puesto → id automático + salario por defecto
    public Empleado(String nombre, String puesto) {
        this.id = nextId++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 100000.0; // salario inicial por defecto
        totalEmpleados++;
    }

    // Aumenta salario por porcentaje (10 → +10%)
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100.0);
    }

    // Aumenta salario por monto fijo
    public void actualizarSalario(int montoFijo) {
        this.salario += montoFijo;
    }

    // ====== Getters y Setters ======
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getPuesto() { return puesto; }
    public double getSalario() { return salario; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setPuesto(String puesto) { this.puesto = puesto; }
    public void setSalario(double salario) { this.salario = salario; }

    // ====== Métodos estáticos ======
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // ====== toString() ======
    @Override
    public String toString() {
        return "Empleado { id=" + id +
               ", nombre='" + nombre + '\'' +
               ", puesto='" + puesto + '\'' +
               ", salario=" + String.format("%.2f", salario) +
               " }";
    }
}
