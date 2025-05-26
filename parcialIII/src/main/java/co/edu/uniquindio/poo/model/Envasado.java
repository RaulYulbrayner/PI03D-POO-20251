package co.edu.uniquindio.poo.model;

/**
 * Producto de tipo envasado, incluye fecha de envasado, peso y país de origen.
 */
public class Envasado extends Producto {

    private java.time.LocalDate fechaEnvasado;
    private int peso;
    private PaisOrigen pais;

    public Envasado(String codigo, String nombre, double precioCompra, Proveedor proveedor, java.time.LocalDate fechaEnvasado, int peso, PaisOrigen pais) {
        super(codigo, nombre, precioCompra, proveedor);
        this.fechaEnvasado = fechaEnvasado;
        this.peso = peso;
        this.pais = pais;
    }

    public double calcularPrecioVenta() {
        return getPrecioCompra() + (300 * peso);
    }

}
