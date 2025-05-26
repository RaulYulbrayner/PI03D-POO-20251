package co.edu.uniquindio.poo.model;

/**
 * Producto de tipo refrigerado, incluye código de aprobación y temperatura.
 */
public class Refrigerado extends Producto {

    private String codigoAprobacion;
    private int temperatura;

    public Refrigerado(String codigo, String nombre, double precioCompra, Proveedor proveedor, String codigoAprobacion, int temperatura) {
        super(codigo, nombre, precioCompra, proveedor);
        this.codigoAprobacion = codigoAprobacion;
        this.temperatura = temperatura;
    }

    public double calcularPrecioVenta() {
        return getPrecioCompra() + (500 * temperatura);
    }

    public void iniciarProcesoRefrigeracion() {
        System.out.println("Iniciando proceso de refrigeración para " + getNombre());
    }

}
