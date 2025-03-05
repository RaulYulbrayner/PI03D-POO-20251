package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class Cliente {

    private String nombre;
    private String id;
    private ArrayList<Prestamo> prestamos;

    public Cliente(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.prestamos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public boolean puedePrestar() {
        for (int i = 0; i < prestamos.size(); i++) {
            if (!prestamos.get(i).isDevuelto()) {
                return false;
            }
        }
        return true;
    }

    public void agregarPrestamo(Prestamo prestamo) {
        prestamos.add(prestamo);
    }

    public int cantidadLibrosPrestados() {
        int count = 0;
        for (int i = 0; i < prestamos.size(); i++) {
            if (!prestamos.get(i).isDevuelto()) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", prestamos=" + prestamos +
                '}';
    }
}
