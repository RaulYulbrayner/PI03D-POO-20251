package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private String nombre;
    private String nit;
    private List<Cliente> listClientes;
    private List<Venta> listVentas;
    private List<Producto> listProductos;

    /**
     * Metodo constructor de la clase Tienda
     * @param nombre
     * @param nit
     */
    public Tienda(String nombre, String nit){
        this.nombre = nombre;
        this.nit = nit;
        this.listClientes = new ArrayList<>();
        this.listVentas = new ArrayList<>();
        this.listProductos = new ArrayList<>();
    }

    /**
     * Metodo que permite registar clientes en la tienda
     * @param cliente
     */
    public void registrarCliente(Cliente cliente){
        listClientes.add(cliente);
    }

    /**
     * Metodo que permite crear ventas en la tienda
     * @param venta
     */
    public void crearVentas(Venta venta){
        listVentas.add(venta);
    }

    /**
     * Metodo que permite registrar productos en la tienda
     * @param producto
     */
    public void registrarProducto(Producto producto){
        listProductos.add(producto);
    }

    /**
     * Metodo que permite calcular el total de las ventas realizadas en la tienda
     * @return
     */
    public double calcularTotalDeVentas(){
        double total = 0;
        for (Venta venta : listVentas) {
            total += venta.calcularTotal();
        }
        return total;
    }

    //SOLUCION PARCIAL 1

    // PUNTO 2A --------------------------------------

    /**
     * Metodo que permite contar la cantidad de vocales que tiene un nombre (opción 1)
     * @param nombre
     * @return cantiddad de vocales
     */
    private int contarVocales(String nombre) {
        int contador = 0;
        String vocales = "aeiouAEIOU";
        for (char c : nombre.toCharArray()) {
            if (vocales.indexOf(c) != -1) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Metodo que permite contar la cantidad de vocales que tiene un nombre (opción 2)
     * @param nombre
     * @return cantiddad de vocales
     */
    private int contarVocales2(String nombre) {
        int contador = 0;
        for (char c : nombre.toCharArray()) {
            if (isVocal(c)) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Metodo que permite determinar de un caracter es una vocal
     * @param letra
     * @return
     */
    private boolean isVocal(char letra) {
        boolean vocales = false;
        if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            vocales = true;
        }
        return vocales;
    }

    /**
     * Metodo que permite contar la cantidad de vocales que tiene un nombre
     * @param nombre
     * @return
     */
    public int contarVocalesEnNombreCliente(String nombre) {
        int cantidadVocales = 0;
        for (Cliente cliente : listClientes) {
            if (cliente.getNombre().equals(nombre)) {
                cantidadVocales = contarVocales2(cliente.getNombre());
            }
        }
        return cantidadVocales;
    }
    // PUNTO 2A --------------------------------------


    // PUNTO 2B --------------------------------------

    /**
     * Metodo que obtiene los productos que tienen un stock 20 hasta 55
     * @return
     */
    public List<Producto> obtenerProductosConStockEntre20y55() {
        List<Producto> productosFiltrados = new ArrayList<>();
        for (Producto producto : listProductos) {
            if (producto.getStock() >= 20 && producto.getStock() <= 55) {
                productosFiltrados.add(producto);
            }
        }
        return productosFiltrados;
    }

    // PUNTO 2B --------------------------------------


    // PUNTO 2C --------------------------------------

    /**
     * Metodo que obtiene los clientes que compraron 5 huevos
     * @return lista de clientes
     */
    public List<Cliente> obtenerClientesQueCompraronCincoHuevos() {
        List<Cliente> clientesFiltrados = new ArrayList<>();
        for (Venta venta : listVentas) {
            for (DetalleVenta detalle : venta.getListDetalleVentas()) {
                if (detalle.getProducto().getNombre().equals("Huevo") && detalle.getCantidad() == 5) {
                    if (!clientesFiltrados.contains(venta.getCliente())) {
                        clientesFiltrados.add(venta.getCliente());
                    }
                }
            }
        }
        return clientesFiltrados;
    }

    // PUNTO 2C --------------------------------------



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
