package co.edu.uniquindio.poo.model;

/**
 * Representa un vehículo tipo Microbus.
 */
public class Microbus extends Vehiculo {
    private TipoEnergia tipoEnergia;

    /**
     * Constructor de Microbus.
     */
    public Microbus(String placa, String modelo, int capacidad, TipoEnergia tipoEnergia) {
        super(placa, modelo, capacidad);
        this.tipoEnergia = tipoEnergia;
    }

    /**
     * Calcula el costo del viaje para un microbús.
     */
    @Override
    public double calcularCosto() {
        double costo = 200;
        if (tipoEnergia == TipoEnergia.ELECTRICO) {
            costo += 30;
        }
        return costo;
    }

    public TipoEnergia getTipoEnergia() {
        return tipoEnergia;
    }

    public void setTipoEnergia(TipoEnergia tipoEnergia) {
        this.tipoEnergia = tipoEnergia;
    }
}
