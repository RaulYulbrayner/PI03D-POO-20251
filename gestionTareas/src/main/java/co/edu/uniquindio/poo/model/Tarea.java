package co.edu.uniquindio.poo.model;

public class Tarea {

    private int idTarea;
    private String descripcion;
    private boolean indicador;
    private Colaborador colaborador;
    private Prioridad prioridad;

    public Tarea(int idTarea, Prioridad prioridad, Colaborador colaborador, boolean indicador, String descripcion) {
        this.idTarea = idTarea;
        this.prioridad = prioridad;
        this.colaborador = colaborador;
        this.indicador = indicador;
        this.descripcion = descripcion;
    }

    public boolean isIndicador() {
        return indicador;
    }

    public void setIndicador(boolean indicador) {
        this.indicador = indicador;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    public int getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(int idTarea) {
        this.idTarea = idTarea;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
