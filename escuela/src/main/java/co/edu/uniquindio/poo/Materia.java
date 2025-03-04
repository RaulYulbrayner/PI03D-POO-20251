package co.edu.uniquindio.poo;

import java.util.List;

public class Materia {

    private String nombre;
    private String id;
    private Docente docente;
    private List<Estudiante> listEstudiantes;

    public Materia(String nombre, String id, Docente docente, List<Estudiante> listEstudiantes) {
        this.nombre = nombre;
        this.id = id;
        this.docente = docente;
        this.listEstudiantes = listEstudiantes;
    }

    public void registrarEstudiantes(Estudiante estudiante) {
        listEstudiantes.add(estudiante);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public List<Estudiante> getListEstudiantes() {
        return listEstudiantes;
    }

    public void setListEstudiantes(List<Estudiante> listEstudiantes) {
        this.listEstudiantes = listEstudiantes;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", docente=" + docente +
                ", listEstudiantes=" + listEstudiantes +
                '}';
    }
}
