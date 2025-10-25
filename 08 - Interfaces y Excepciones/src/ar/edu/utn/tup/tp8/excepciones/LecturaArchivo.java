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
public class LecturaArchivo {
    public static void main(String[] args) {
        try (var br = new BufferedReader(new FileReader("datos.txt"))) {
            String line;
            while ((line = br.readLine()) != null) System.out.println(line);
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no existe.");
        } catch (IOException e) {
            System.out.println("Error de E/S: " + e.getMessage());
        }
    }
}
