package co.edu.uniquindio.poo.model;

import java.util.List;

public class Torneo {

    private String nombre;
    private String fechaInicio;
    private List<Equipo> listEquipos;

    public Torneo(String nombre, String fechaInicio, List<Equipo> listEquipos) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.listEquipos = listEquipos;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public List<Equipo> getListEquipos() {
        return listEquipos;
    }

    public void setListEquipos(List<Equipo> listEquipos) {
        this.listEquipos = listEquipos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
