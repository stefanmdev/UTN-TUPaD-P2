/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp8.ecommerce;

/**
 *
 * @author DELL
 */
public class TarjetaCredito implements Pago, PagoConDescuento {
    private final String numero;

    public TarjetaCredito(String numero) { this.numero = numero; }

    @Override
    public double aplicarDescuento(double monto) {
        return monto * 0.95; // 5% off ejemplo
    }

    @Override
    public boolean procesarPago(double monto) {
        // mock: siempre OK
        System.out.println("Pago con Tarjeta ****" + numero.substring(numero.length()-4)
                + " por $" + String.format("%.2f", monto));
        return true;
    }
}
