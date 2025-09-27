/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp5.ej2;

/**
 *
 * @author DELL
 */
public class PruebaTP5_Ej2 {
    public static void main(String[] args) {
        Bateria b = new Bateria("BT-5000", 4500);
        Celular c = new Celular("358123456789012", "Samsung", "Galaxy A54", b);
        Usuario u = new Usuario("Lucas Amato", "40.654.321");

        c.asignarUsuario(u);

        System.out.println(c);
        System.out.println(u);
        System.out.println("¿Mismo objeto? " + (u.getCelular() == c));
    }
}
