package co.edu.uniquindio.poo.model;

/**
 * Clase que representa a un proveedor de productos.
 */
public class Proveedor {

    private String nombre;

    /**
     * Constructor del proveedor.
     * @param nombre Nombre del proveedor.
     */
    public Proveedor(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Retorna el nombre del proveedor.
     * @return Nombre del proveedor.
     */
    public String getNombre() {
        return nombre;
    }

}
