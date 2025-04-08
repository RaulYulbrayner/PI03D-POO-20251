package co.edu.uniquindio.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Batallon {
    private String nombre;
    private String id;

    private List<VehiculoApoyo> listVehiculosApoyo;
    private List<VehiculoBlindado> listVehiculosBlindados;
    private List<VehiculoTransporteTropa> listVehiculosTransporteTropa;
    private List<Mision> listMisiones;

    public Batallon(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.listVehiculosApoyo = new ArrayList<>();
        this.listVehiculosBlindados = new ArrayList<>();
        this.listVehiculosTransporteTropa = new ArrayList<>();
        this.listMisiones = new ArrayList<>();
    }

    public List<Vehiculo> obtenerVehiculosCantMisiones() {
        List<Vehiculo> vehiculosMisionesCompletadas = new ArrayList<>();


        for (VehiculoApoyo vehiculo : listVehiculosApoyo) {
            if (vehiculo.getMisionesCompletadas() > 50){
                vehiculosMisionesCompletadas.add(vehiculo);
            }
        }

        for(VehiculoBlindado vehiculo : listVehiculosBlindados){
            if (vehiculo.getMisionesCompletadas() > 50){
                vehiculosMisionesCompletadas.add(vehiculo);
            }
        }

        for(VehiculoTransporteTropa vehiculo : listVehiculosTransporteTropa){
            if (vehiculo.getMisionesCompletadas() > 50){
                vehiculosMisionesCompletadas.add(vehiculo);
            }
        }

        return vehiculosMisionesCompletadas;
    }
}
