package co.edu.uniquindio.poo.model;

import java.util.List;

/**
 * Clase Empresa que agrupa y gestiona productos.
 */
public class Empresa {

    private String nombre;
    private java.util.List<Producto> productos;

    /**
     * Constructor de empresa con nombre.
     * @param nombre Nombre de la empresa.
     */
    public Empresa(String nombre) {
        this.nombre = nombre;
        productos = new java.util.ArrayList<>();
    }

    /**
     * Agrega un producto a la empresa.
     * @param producto Producto a agregar.
     */
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    /**
     * Obtiene el producto con mayor utilidad (precio de venta - precio de compra).
     * @return Producto con mayor utilidad.
     */
    public Producto obtenerProductoMayorUtilidad() {
        if (productos.isEmpty()) return null;
        Producto mayor = productos.get(0);
        double utilidadMayor = mayor.calcularPrecioVenta() - mayor.getPrecioCompra();

        for (int i = 1; i < productos.size(); i++) {
            Producto actual = productos.get(i);
            double utilidadActual = actual.calcularPrecioVenta() - actual.getPrecioCompra();
            if (utilidadActual > utilidadMayor) {
                utilidadMayor = utilidadActual;
                mayor = actual;
            }
        }
        return mayor;
    }

    public java.util.List<Producto> getProductos() {
        return productos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
