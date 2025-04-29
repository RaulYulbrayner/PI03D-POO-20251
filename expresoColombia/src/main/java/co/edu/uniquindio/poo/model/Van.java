package co.edu.uniquindio.poo.model;

/**
 * Representa un vehículo tipo Van.
 */
public class Van extends Vehiculo {
    private boolean tieneEntretenimiento;
    private TipoTraccion traccion;

    /**
     * Constructor de Van.
     */
    public Van(String placa, String modelo, int capacidad, boolean tieneEntretenimiento, TipoTraccion traccion) {
        super(placa, modelo, capacidad);
        this.tieneEntretenimiento = tieneEntretenimiento;
        this.traccion = traccion;
    }

    /**
     * Calcula el costo del viaje para una van.
     */
    @Override
    public double calcularCosto() {
        double costo = 250;
        if (tieneEntretenimiento) {
            costo += 50;
        }
        return costo;
    }

    public boolean isTieneEntretenimiento() {
        return tieneEntretenimiento;
    }

    public void setTieneEntretenimiento(boolean tieneEntretenimiento) {
        this.tieneEntretenimiento = tieneEntretenimiento;
    }

    public TipoTraccion getTraccion() {
        return traccion;
    }

    public void setTraccion(TipoTraccion traccion) {
        this.traccion = traccion;
    }
}
