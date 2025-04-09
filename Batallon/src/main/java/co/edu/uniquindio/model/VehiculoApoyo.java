package co.edu.uniquindio.model;

public class VehiculoApoyo extends Vehiculo {
    private TipoFuncion tipoFuncion;

    public VehiculoApoyo(String id, String modelo, int anioFabricacion, double kilometraje, EstadoOperativo estadoOperativo, int misionesCompletadas, TipoFuncion tipoFuncion) {
        super(id, modelo, anioFabricacion, kilometraje, estadoOperativo, misionesCompletadas);
        this.tipoFuncion = tipoFuncion;
    }

    @Override
    public void desplazar() {

    }

}
