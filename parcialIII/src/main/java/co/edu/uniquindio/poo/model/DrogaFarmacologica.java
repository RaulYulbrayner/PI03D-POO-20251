package co.edu.uniquindio.poo.model;

/**
 * Representa una droga farmacológica que requiere refrigeración.
 */
public class DrogaFarmacologica implements Refrigerable {

    private String codigo;
    private String nombre;

    public DrogaFarmacologica(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public void iniciarProcesoRefrigeracion() {
        System.out.println("Iniciando refrigeración para droga: " + nombre);
    }

}
