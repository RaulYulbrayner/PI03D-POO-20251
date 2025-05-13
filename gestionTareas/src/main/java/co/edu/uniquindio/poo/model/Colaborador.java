package co.edu.uniquindio.poo.model;

public abstract class Colaborador {

    private String nombre;
    private int edad, id;

    public Colaborador(String nombre, int id, int edad) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
    }

    public abstract String visualizarTarea(int idTarea);

    public abstract boolean verificarTarea(int idTarea);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
