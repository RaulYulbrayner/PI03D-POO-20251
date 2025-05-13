package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String nombre;
    private int id;
    private List<Colaborador> listColaboradores;

    public Empresa(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        this.listColaboradores = new ArrayList<Colaborador>();
    }

    public List<Colaborador> getListColaboradores() {
        return listColaboradores;
    }

    public void setListColaboradores(List<Colaborador> listColaboradores) {
        this.listColaboradores = listColaboradores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
