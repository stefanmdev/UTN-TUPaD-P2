/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.utn.tup.tp6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author DELL
 */
public class Inventario {
    
    private final ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto p) {
        if (p == null) return;
        // Evitar duplicados por ID
        if (buscarProductoPorId(p.getId()) == null) {
            productos.add(p);
        } else {
            System.out.println("⚠ Ya existe un producto con id " + p.getId());
        }
    }

    public boolean eliminarProducto(String id) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            productos.remove(p);
            return true;
        }
        return false;
    }

    public boolean actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            return true;
        }
        return false;
    }

    public boolean actualizarPrecio(String id, double nuevoPrecio) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setPrecio(nuevoPrecio);
            return true;
        }
        return false;
    }


    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("(Sin productos)");
            return;
        }
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }

    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equalsIgnoreCase(id)) return p;
        }
        return null;
    }

    
    public Producto buscarPorId(String id) {
        return buscarProductoPorId(id);
    }

    public List<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> res = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) res.add(p);
        }
        return res;
    }

    public List<Producto> filtrarProductosPorPrecio(double min, double max) {
        ArrayList<Producto> res = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) res.add(p);
        }
        return res;
    }

    public List<Producto> filtrarPorPrecio(double min, double max) {
        return filtrarProductosPorPrecio(min, max);
    }

    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) total += p.getCantidad();
        return total;
    }

    public int totalDeUnidades() {
        return obtenerTotalStock();
    }

    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) return null;
        return Collections.max(productos, Comparator.comparingInt(Producto::getCantidad));
    }

    public Producto mayorStock() {
        return obtenerProductoConMayorStock();
    }

    public void mostrarCategoriasDisponibles() {
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println(c.name() + " → " + c.getDescripcion());
        }
    }

    // ------------------ Ordenamientos ------------------

    public List<Producto> ordenarPorPrecioAsc() {
        ArrayList<Producto> copia = new ArrayList<>(productos);
        copia.sort(Comparator.comparingDouble(Producto::getPrecio));
        return copia;
    }

    public List<Producto> ordenarPorNombreAZ() {
        ArrayList<Producto> copia = new ArrayList<>(productos);
        copia.sort(Comparator.comparing(Producto::getNombre, String.CASE_INSENSITIVE_ORDER));
        return copia;
    }
    
}
