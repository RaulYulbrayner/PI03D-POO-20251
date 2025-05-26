package co.edu.uniquindio.poo.model;

/**
 * Producto de tipo perecedero, incluye fecha de vencimiento.
 */
public class Perecedero extends Producto {

    private java.time.LocalDate fechaVencimiento;

    public Perecedero(String codigo, String nombre, double precioCompra, Proveedor proveedor, java.time.LocalDate fechaVencimiento) {
        super(codigo, nombre, precioCompra, proveedor);
        this.fechaVencimiento = fechaVencimiento;
    }

    public double calcularPrecioVenta() {
        return  getPrecioCompra() * 1.35;
    }

}
