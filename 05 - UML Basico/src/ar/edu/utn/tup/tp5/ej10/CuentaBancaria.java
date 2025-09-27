/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp5.ej10;

import java.util.Objects;

/**
 *
 * @author DELL
 */
public class CuentaBancaria {
     private String cbu;
    private double saldo;
    private ClaveSeguridad clave;  // composición
    private Titular titular;       // asociación bidireccional

    public CuentaBancaria(String cbu, double saldo, ClaveSeguridad clave) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = Objects.requireNonNull(clave);
    }

    public void asignarTitular(Titular titular) {
        this.titular = titular;
        if (titular.getCuenta() != this) {
            titular.asignarCuenta(this);
        }
    }

    public String getCbu() { return cbu; }
    public double getSaldo() { return saldo; }
    public ClaveSeguridad getClave() { return clave; }
    public Titular getTitular() { return titular; }

    @Override
    public String toString() {
        return "CuentaBancaria{cbu='" + cbu + "', saldo=" + saldo +
               ", clave=" + clave + "}";
    }
}
