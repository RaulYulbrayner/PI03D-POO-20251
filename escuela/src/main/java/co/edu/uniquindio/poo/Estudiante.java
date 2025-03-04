package co.edu.uniquindio.poo;

public class Estudiante {

    private String nombres;
    private int edad;

    public Estudiante(String nombres, int edad) {
        this.nombres = nombres;
        this.edad = edad;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombres='" + nombres + '\'' +
                ", edad=" + edad +
                '}';
    }
}
