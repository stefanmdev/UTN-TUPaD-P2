/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp5.ej4;

/**
 *
 * @author DELL
 */
public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente;   // Asociación bidireccional
    private Banco banco;       // Agregación

    public TarjetaDeCredito(String numero, String fechaVencimiento) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getNumero() { return numero; }
    public String getFechaVencimiento() { return fechaVencimiento; }

    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public Banco getBanco() { return banco; }
    public void setBanco(Banco banco) { this.banco = banco; }

    @Override
    public String toString() {
        return "TarjetaDeCredito{numero='" + numero + "', fechaVencimiento='" + 
                fechaVencimiento + "'}";
    }
}
