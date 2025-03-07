package co.edu.uniquindio.poo;

public class DetalleVenta {

    private int cantidad;
    private double subTotal;
    private double total;
    private Producto producto;

    public DetalleVenta(int cantidad, Producto producto) {
        this.cantidad = cantidad;
        this.producto = producto;
        this.subTotal = calcularSubTotal();
        this.total = this.subTotal;
    }

    public double calcularSubTotal() {
        return cantidad * producto.getValor();
    }

    public int getCantidad() {
        return cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "DetalleVenta{" +
                "cantidad=" + cantidad +
                ", subTotal=" + subTotal +
                ", total=" + total +
                ", producto=" + producto +
                '}';
    }
}
