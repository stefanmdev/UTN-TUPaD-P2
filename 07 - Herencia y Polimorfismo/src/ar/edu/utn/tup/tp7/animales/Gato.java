/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp7.animales;

/**
 *
 * @author DELL
 */
public class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Miau");
    }

    @Override
    public String describir() {
        return "Gato";
    }
}
