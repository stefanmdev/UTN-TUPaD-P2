/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp6;

import java.util.List;


/**
 *
 * @author DELL
 */
public class Main {
      public static void main(String[] args) {

        Inventario inventario = new Inventario();

        // 1) Crear y agregar productos
        inventario.agregarProducto(new Producto("P-001","Leche",        1200,   30, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("P-002","Televisor 43\"",350000, 5, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("P-003","Remera",        8000,   50, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("P-004","Tostadora",     22000,  12, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("P-005","Yerba 1kg",     3500,   80, CategoriaProducto.ALIMENTOS));

        // 2) Listar 
        System.out.println("\n== Listado de productos ==");
        inventario.listarProductos();

        // 3) Buscar por ID
        System.out.println("\n== Buscar producto P-003 ==");
        System.out.println(inventario.buscarPorId("P-003"));

        // 4) Filtrar por categoría
        System.out.println("\n== ALIMENTOS ==");
        List<Producto> alimentos = inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
        alimentos.forEach(System.out::println);

        // 5) Actualizar stock y precio, luego eliminar uno
        inventario.actualizarStock("P-005", 120);
        inventario.actualizarPrecio("P-003", 9500);
        inventario.eliminarProducto("P-002");

        System.out.println("\n== Listado tras cambios ==");
        inventario.listarProductos();

        // 6) Totales y mayor stock
        System.out.println("\nTotal de unidades: " + inventario.totalDeUnidades());
        System.out.println("Producto con mayor stock: " + inventario.mayorStock());

        // 7) Rango de precios
        System.out.println("\n== Productos entre $1000 y $3000 ==");
        inventario.filtrarPorPrecio(1000, 3000).forEach(System.out::println);

        // 8) Categorías disponibles
        System.out.println("\n== Categorías disponibles ==");
        inventario.mostrarCategoriasDisponibles();

        // 9) Ordenamientos
        System.out.println("\n== Ordenados por precio ascendente ==");
        inventario.ordenarPorPrecioAsc().forEach(System.out::println);

        System.out.println("\n== Ordenados por nombre A→Z ==");
        inventario.ordenarPorNombreAZ().forEach(System.out::println);
    }
}
