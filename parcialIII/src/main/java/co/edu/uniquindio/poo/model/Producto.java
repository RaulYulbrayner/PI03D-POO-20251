package co.edu.uniquindio.poo.model;

/**
 * Clase abstracta base para todos los productos.
 */
public abstract class Producto {

    private String codigo;
    private String nombre;
    private double precioCompra;
    private Proveedor proveedor;

    /**
     * Constructor base para un producto.
     * @param codigo Código del producto.
     * @param nombre Nombre del producto.
     * @param precioCompra Precio al que fue comprado.
     * @param proveedor Proveedor del producto.
     */
    public Producto(String codigo, String nombre, double precioCompra, Proveedor proveedor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioCompra = precioCompra;
        this.proveedor = proveedor;
    }

    /**
     * Método abstracto para calcular el precio de venta.
     * @return Precio de venta calculado.
     */
    public abstract double calcularPrecioVenta();

    public String getNombre() {
        return nombre;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
