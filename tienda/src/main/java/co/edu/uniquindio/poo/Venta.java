package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Venta {

    private String fecha;
    private double valorTotal;
    private double subtotal;
    private double impuesto;
    private Cliente cliente;
    private List<DetalleVenta> listDetalleVentas;

    public Venta(String fecha, double impuesto, Cliente cliente) {
        this.fecha = fecha;
        this.impuesto = impuesto;
        this.cliente = cliente;
        this.listDetalleVentas = new ArrayList<>();
        this.subtotal = 0;
        this.valorTotal = 0;
    }

    public void agregarDetalle(DetalleVenta detalle) {
        if (detalle != null && detalle.getProducto() != null) {
            listDetalleVentas.add(detalle);
            actualizarValores();
        }
    }

    public double calcularSubtotal() {
        double subtotal = 0;
        for (DetalleVenta detalle : listDetalleVentas) {
            subtotal += detalle.getSubTotal();
        }
        return subtotal;
    }

    public double calcularTotal() {
        return calcularSubtotal() * (1 + impuesto);
    }

    public void actualizarValores() {
        this.subtotal = 0;
        for (DetalleVenta detalle : listDetalleVentas) {
            if (detalle.getProducto() != null) {
                this.subtotal += detalle.getSubTotal();
            }
        }
        this.valorTotal = subtotal * (1 + impuesto);
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public List<DetalleVenta> getListDetalleVentas() {
        return listDetalleVentas;
    }

    public void setListDetalleVentas(List<DetalleVenta> listDetalleVentas) {
        this.listDetalleVentas = listDetalleVentas;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "fecha='" + fecha + '\'' +
                ", valorTotal=" + valorTotal +
                ", subtotal=" + subtotal +
                ", impuesto=" + impuesto +
                ", cliente=" + cliente +
                ", listDetalleVentas=" + listDetalleVentas +
                '}';
    }
}