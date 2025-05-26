package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Proveedor proveedor = new Proveedor("Proveedor1");

        Producto p1 = new Perecedero("001", "Yogurt", 2000, proveedor, java.time.LocalDate.of(2025, 6, 10));
        Producto p2 = new Refrigerado("002", "Vacuna", 1000, proveedor, "A123", 4);
        Producto p3 = new Envasado("003", "Atún", 1500, proveedor, java.time.LocalDate.of(2025, 5, 20), 10, PaisOrigen.COLOMBIA);

        Empresa empresa = new Empresa("Universidad del Quindio");
        empresa.agregarProducto(p1);
        empresa.agregarProducto(p2);
        empresa.agregarProducto(p3);

        Producto mayorUtilidad = empresa.obtenerProductoMayorUtilidad();

        System.out.println("Producto con mayor utilidad: " + mayorUtilidad.getNombre());
        System.out.println("Precio compra: " + mayorUtilidad.getPrecioCompra());
        System.out.println("Precio venta: " + mayorUtilidad.calcularPrecioVenta());
    }
}