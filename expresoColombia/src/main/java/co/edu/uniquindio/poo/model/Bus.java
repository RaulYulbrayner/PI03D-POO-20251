package co.edu.uniquindio.poo.model;

/**
 * Representa un vehículo tipo Bus.
 */
public class Bus extends Vehiculo {

    private int ejes;
    private boolean tieneBanio;

    /**
     * Constructor de Bus.
     */
    public Bus(String placa, String modelo, int capacidad, int ejes, boolean tieneBanio) {
        super(placa, modelo, capacidad);
        this.ejes = ejes;
        this.tieneBanio = tieneBanio;
    }

    /**
     * Calcula el costo del viaje para un bus.
     */
    @Override
    public double calcularCosto() {
        double costo = 300;
        if (tieneBanio) {
            costo += 100;
        }
        return costo;
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public boolean isTieneBanio() {
        return tieneBanio;
    }

    public void setTieneBanio(boolean tieneBanio) {
        this.tieneBanio = tieneBanio;
    }

}
