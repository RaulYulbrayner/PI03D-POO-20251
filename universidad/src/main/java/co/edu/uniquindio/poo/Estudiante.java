package co.edu.uniquindio.poo;

public class Estudiante {

    private String nombres;
    private String apellidos;
    private String correo;
    private int edad;
    private int telefono;
    private int identificacion;

    public Estudiante(String nombres, String apellidos, String correo, int edad, int telefono, int identificacion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.edad = edad;
        this.telefono = telefono;
        this.identificacion = identificacion;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre ='" + nombres + '\'' +
                "edad ='" + edad + '\'' +
                '}';
    }

}
