package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private String nombre;
    private String nit;
    private List<Cliente> listClientes;
    private List<Venta> listVentas;
    private List<Producto> listProductos;

    public Tienda(String nombre, String nit){
        this.nombre = nombre;
        this.nit = nit;
        this.listClientes = new ArrayList<>();
        this.listVentas = new ArrayList<>();
        this.listProductos = new ArrayList<>();
    }

    public void registrarCliente(Cliente cliente){
        listClientes.add(cliente);
    }

    public void crearVentas(Venta venta){
        listVentas.add(venta);
    }

    public void registrarProducto(Producto producto){
        listProductos.add(producto);
    }

    public double calcularTotalDeVentas(){
        double total = 0;
        for (Venta venta : listVentas) {
            total += venta.calcularTotal();
        }
        return total;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Producto> getListProductos() {
        return listProductos;
    }

    public void setListProductos(List<Producto> listProductos) {
        this.listProductos = listProductos;
    }

    public List<Cliente> getListClientes() {
        return listClientes;
    }

    public void setListClientes(List<Cliente> listClientes) {
        this.listClientes = listClientes;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public List<Venta> getListVentas() {
        return listVentas;
    }

    public void setListVentas(List<Venta> listVentas) {
        this.listVentas = listVentas;
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "nombre='" + nombre + '\'' +
                ", nit='" + nit + '\'' +
                ", listClientes=" + listClientes +
                ", listVentas=" + listVentas +
                ", listProductos=" + listProductos +
                '}';
    }
}
