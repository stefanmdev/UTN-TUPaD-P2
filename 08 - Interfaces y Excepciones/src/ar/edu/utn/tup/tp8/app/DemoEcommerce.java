/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp8.app;

import ar.edu.utn.tup.tp8.ecommerce.*;

/**
 *
 * @author DELL
 */
public class DemoEcommerce {
   public static void main(String[] args) {
        var p1 = new Producto("Mouse", 8000);
        var p2 = new Producto("Teclado", 12000);

        var pedido = new Pedido();
        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);

        var cliente = new Cliente("Stefan");
        pedido.setNotificable(cliente);
        pedido.cambiarEstado("PAGANDO");

        double total = pedido.calcularTotal();
        Pago medio = new TarjetaCredito("4111111111111111");
        if (medio instanceof PagoConDescuento d) {
            total = d.aplicarDescuento(total);
        }
        medio.procesarPago(total);
        pedido.cambiarEstado("ENVIADO");
    }
}
