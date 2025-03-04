package co.edu.uniquindio.poo;

public class Docente {

    private String nombres;
    private String titulo;

    public Docente(String nombres, String titulo) {
        this.nombres = nombres;
        this.titulo = titulo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Docente{" +
                "nombres='" + nombres + '\'' +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
