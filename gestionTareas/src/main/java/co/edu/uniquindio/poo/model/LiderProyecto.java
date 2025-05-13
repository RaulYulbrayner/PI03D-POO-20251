package co.edu.uniquindio.poo.model;

public class LiderProyecto extends Colaborador implements GestionTareas {

    public LiderProyecto(String nombre, int id, int edad) {
        super(nombre, id, edad);
    }

    public double evaluarTarea(int idTarea){
        return 0;
    }

    @Override
    public String visualizarTarea(int idTarea) {
        return "";
    }

    @Override
    public boolean verificarTarea(int idTarea) {
        return false;
    }

    @Override
    public String asignarTarea(Colaborador colaborador, Tarea tarea) {
        return "";
    }
}
