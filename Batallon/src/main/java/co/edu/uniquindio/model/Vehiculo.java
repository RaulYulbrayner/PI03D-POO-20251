package co.edu.uniquindio.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class Vehiculo {
    protected String id;
    protected String modelo;
    protected int anioFabricacion;
    protected double kilometraje;
    protected int misionesCompletadas;
    protected EstadoOperativo estadoOperativo;
    protected List<Mision> listMisiones;

    public Vehiculo(String id, String modelo, int anioFabricacion, double kilometraje, EstadoOperativo estadoOperativo) {
        this.id = id;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.kilometraje = kilometraje;
        this.misionesCompletadas = 0;
        this.estadoOperativo = estadoOperativo;

        this.listMisiones = new ArrayList<>();
    }


    public abstract void desplazar();


    public EstadoOperativo getEstadoOperativo() {
        return estadoOperativo;
    }

    public void setEstadoOperativo(EstadoOperativo estadoOperativo) {
        this.estadoOperativo = estadoOperativo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getMisionesCompletadas() {
        return misionesCompletadas;
    }

    public void setMisionesCompletadas(int misionesCompletadas) {
        this.misionesCompletadas = misionesCompletadas;
    }

    public List<Mision> getListMisiones() {
        return listMisiones;
    }

    public void setListMisiones(List<Mision> listMisiones) {
        this.listMisiones = listMisiones;
    }
}
