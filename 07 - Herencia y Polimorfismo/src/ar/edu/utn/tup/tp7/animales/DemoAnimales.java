/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp7.animales;

/**
 *
 * @author DELL
 */
public class DemoAnimales {
    public static void main(String[] args) {
        Animal[] animales = {
            new Perro(),
            new Gato(),
            new Vaca()
        };

        System.out.println("== Polimorfismo ==");
        for (Animal a : animales) {
            System.out.print(a.describir() + ": ");
            a.hacerSonido(); // llamada polimórfica
        }

        // ejemplo de downcasting seguro con instanceof
        Animal x = new Perro();
        if (x instanceof Perro p) { 
            p.ladrar();
        }
    }
}
