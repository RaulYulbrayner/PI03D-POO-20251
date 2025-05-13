package co.edu.uniquindio.poo.model;

public class Qa extends Colaborador {
    public Qa(String nombre, int id, int edad) {
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
