package co.edu.uniquindio.poo;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // 1. Creamos la tienda
        Tienda tienda = new Tienda("Tienda D1", "987654321");

        // Creamos los productos
        Producto producto1 = new Producto("Alpinito Surtido", "Lácteos", 5550, 101, 10);
        Producto producto2 = new Producto("Arepa de Chocolo", "Alimentos y despensa", 2990, 102, 25);
        Producto producto3 = new Producto("Lavaloza", "Aseo", 1980, 103, 15);
        Producto producto4 = new Producto("Huevo", "Alimentos y despensa", 500, 150, 15);
        tienda.registrarProducto(producto1);
        tienda.registrarProducto(producto2);
        tienda.registrarProducto(producto3);
        tienda.registrarProducto(producto4);

        // Creamos los clientes
        Cliente cliente1 = new Cliente("Raul Rivera", "123456789", "Calle 123", 5551234);
        Cliente cliente2 = new Cliente("Maria Gomez", "987654321", "Avenida 456", 5555678);
        Cliente cliente3 = new Cliente("Carlos Lopez", "456789123", "Carrera 789", 5559876);
        tienda.registrarCliente(cliente1);
        tienda.registrarCliente(cliente2);
        tienda.registrarCliente(cliente3);

        // Creamos y registramos las ventas
        Venta venta1 = new Venta("2025-03-06", 0.19, cliente1);
        venta1.agregarDetalle(new DetalleVenta(2, producto1));
        venta1.agregarDetalle(new DetalleVenta(5, producto4));
        tienda.crearVentas(venta1);

        Venta venta2 = new Venta("2025-03-07", 0.19, cliente2);
        venta2.agregarDetalle(new DetalleVenta(1, producto3));
        venta2.agregarDetalle(new DetalleVenta(3, producto2));
        tienda.crearVentas(venta2);

        Venta venta3 = new Venta("2025-03-08", 0.19, cliente3);
        venta3.agregarDetalle(new DetalleVenta(1, producto1));
        venta3.agregarDetalle(new DetalleVenta(2, producto3));
        tienda.crearVentas(venta3);

        // Imprimir las ventas
        for (Venta venta : tienda.getListVentas()) {
            System.out.println("---------------------------------------------------");
            System.out.println("Cliente: " + venta.getCliente().getNombre());
            System.out.println("Fecha de venta: " + venta.getFecha());
            System.out.println("Detalles de la venta:");
            for (DetalleVenta detalle : venta.getListDetalleVentas()) {
                  System.out.println(" - Cantidad: " + detalle.getCantidad() + " |" + " Producto: " + detalle.getProducto().getNombre() + " |" + ", Valor Unitario: " + detalle.getProducto().getValor() + " |" + " Subtotal: " + detalle.getSubTotal() + " |" + " Total: " + detalle.getTotal()+" |");
            }
            System.out.println("Subtotal: " + venta.getSubtotal());
            System.out.println("Total: " + venta.calcularTotal());
        }
        System.out.println("---------------------------------------------------");
        System.out.println("Total de ventas en toda la tienda: " + tienda.calcularTotalDeVentas());

        System.out.println("---------------------------------------------------");
        System.out.println("SOLUCIÓN PUNTO 2A");
        String nombre = cliente1.getNombre();
        int cantidadVocales = tienda.contarVocalesEnNombreCliente(nombre);
        System.out.println("El nombre '" + nombre + "' tiene " + cantidadVocales + " vocales.");

        System.out.println("---------------------------------------------------");
        System.out.println("SOLUCIÓN PUNTO 2B");
        List<Producto> productosFiltrados = tienda.obtenerProductosConStockEntre20y55();
        System.out.println("Productos con stock entre 20 y 55:");
        for (Producto producto : productosFiltrados) {
            System.out.println(" - " + producto.getNombre() + " (Stock: " + producto.getStock() + ")");
        }

        System.out.println("---------------------------------------------------");
        System.out.println("SOLUCIÓN PUNTO 2C");
        List<Cliente> clientesQueCompraronHuevos = tienda.obtenerClientesQueCompraronCincoHuevos();
        System.out.println("Clientes que compraron exactamente 5 huevos:");
        for (Cliente cliente : clientesQueCompraronHuevos) {
            System.out.println(" - " + cliente.getNombre());
        }

    }
}