package co.edu.uniquindio.poo.model;

public class Administrador extends Colaborador implements GestionTareas {

    public Administrador(String nombre, int id, int edad) {
        super(nombre, id, edad);
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
