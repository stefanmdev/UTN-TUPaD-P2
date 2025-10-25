/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp8.ecommerce;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class Pedido implements Pagable {
    private final List<Producto> productos = new ArrayList<>();
    private String estado = "CREADO";
    private Notificable notificable; // cliente a notificar

    public void agregarProducto(Producto p) { productos.add(p); }

    public void setNotificable(Notificable n) { this.notificable = n; }

    public void cambiarEstado(String nuevo) {
        this.estado = nuevo;
        if (notificable != null) notificable.notificar("Pedido " + estado);
    }

    @Override
    public double calcularTotal() {
        return productos.stream().mapToDouble(Producto::calcularTotal).sum();
    }

    public List<Producto> getProductos() { return productos; }
    public String getEstado() { return estado; }
}
