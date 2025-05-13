package co.edu.uniquindio.poo.model;

public class Desarrollador extends Colaborador {
    public Desarrollador(String nombre, int id, int edad) {
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
}
