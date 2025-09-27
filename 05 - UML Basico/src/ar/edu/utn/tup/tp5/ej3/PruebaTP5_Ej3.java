/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp5.ej3;

/**
 *
 * @author DELL
 */
public class PruebaTP5_Ej3 {
    public static void main(String[] args) {
        Autor autor = new Autor("Gabriel García Márquez", "Colombiana");
        Editorial editorial = new Editorial("Editorial Sudamericana", "Buenos Aires");
        Libro libro = new Libro("Cien Años de Soledad", "978-950-07-0001-0", autor, editorial);

        System.out.println(libro);
    }
}
