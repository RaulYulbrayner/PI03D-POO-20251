package co.edu.uniquindio.model;

public class VehiculoTransporteTropa extends Vehiculo {
    private int capacidadSoldados;

    public VehiculoTransporteTropa(String id, String modelo, int anioFabricacion, double kilometraje, EstadoOperativo estadoOperativo, int misionesCompletadas) {
        super(id, modelo, anioFabricacion, kilometraje, estadoOperativo, misionesCompletadas);
        this.capacidadSoldados = capacidadSoldados;
    }

    @Override
    public void desplazar() {
        System.out.println("El vehiculo de tropas se esta moviendo");
    }

    public int getCapacidadSoldados() {
        return capacidadSoldados;
    }

    public void setCapacidadSoldados(int capacidadSoldados) {
        this.capacidadSoldados = capacidadSoldados;
    }
}
