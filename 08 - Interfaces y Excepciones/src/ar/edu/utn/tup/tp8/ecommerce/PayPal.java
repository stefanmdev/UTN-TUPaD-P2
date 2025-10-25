/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp8.ecommerce;

/**
 *
 * @author DELL
 */
public class PayPal implements Pago {
    private final String email;
    public PayPal(String email) { this.email = email; }

    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Pago con PayPal (" + email + ") por $"
                + String.format("%.2f", monto));
        return true;
    }
}
