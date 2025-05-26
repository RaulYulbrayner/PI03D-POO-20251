package co.edu.uniquindio.poo.model;

import junit.framework.TestCase;

import java.time.LocalDate;

public class EmpresaTest extends TestCase {

    public void testObtenerProductoMayorUtilidad() {

        Proveedor proveedor = new Proveedor("ProveedorTest");
        Producto p1 = new Perecedero("001", "Yogurt", 2000, proveedor, LocalDate.of(2025, 6, 10));
        Producto p2 = new Refrigerado("002", "Vacuna", 1000, proveedor, "A123", 4);
        Producto p3 = new Envasado("003", "Atún", 1500, proveedor, LocalDate.of(2025, 5, 20), 10, PaisOrigen.COLOMBIA);

        Empresa empresa = new Empresa("Test S.A.");
        empresa.agregarProducto(p1);
        empresa.agregarProducto(p2);
        empresa.agregarProducto(p3);

        Producto resultado = empresa.obtenerProductoMayorUtilidad();

        assertNotNull(resultado);
        assertEquals("Atún", resultado.getNombre());


    }
}