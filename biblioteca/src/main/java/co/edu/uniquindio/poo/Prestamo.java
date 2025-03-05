package co.edu.uniquindio.poo;

public class Prestamo {

    private Libro libro;
    private Cliente cliente;
    private int dias;
    private boolean devuelto;
    private static final double PRECIO_DIA = 1.5;

    public Prestamo(Libro libro, Cliente cliente, int dias) {
        this.libro = libro;
        this.cliente = cliente;
        this.dias = dias;
        this.devuelto = false;
        libro.prestar();
    }

    public boolean isDevuelto() {
        return devuelto;
    }

    public double calcularCosto() {
        return dias * PRECIO_DIA;
    }

    public void devolverLibro() {
        devuelto = true;
        libro.devolver();
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "libro=" + libro +
                ", cliente=" + cliente +
                ", dias=" + dias +
                ", devuelto=" + devuelto +
                '}';
    }
}
