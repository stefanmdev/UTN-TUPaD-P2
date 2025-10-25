/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp8.excepciones;

import java.io.*;

/**
 *
 * @author DELL
 */
public class TryWithResourcesDemo {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("datos2.txt"))) {
            String l;
            while ((l = br.readLine()) != null) System.out.println(l);
        } catch (IOException e) {
            System.out.println("Error al leer: " + e.getMessage());
        }
    }
}
