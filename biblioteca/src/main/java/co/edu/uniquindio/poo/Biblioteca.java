package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class Biblioteca {

    private  String nombre;
    private ArrayList<Libro> libros;
    private ArrayList<Cliente> clientes;
    private ArrayList<Prestamo> prestamos;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.prestamos = new ArrayList<>();
    }

    public Libro buscarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public Cliente buscarCliente(String id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId().equalsIgnoreCase(id)) {
                return cliente;
            }
        }
        return null;
    }

    public void prestarLibro(String titulo, String idCliente, int dias) {
        Cliente cliente = buscarCliente(idCliente);
        Libro libro = buscarLibro(titulo);

        if (cliente == null || libro == null) {
            System.out.println("Cliente o libro no encontrado.");
            return;
        }

        if (!cliente.puedePrestar()) {
            System.out.println("El cliente tiene libros pendientes de devolver.");
            return;
        }

        if (!libro.isDisponible()) {
            System.out.println("El libro no está disponible.");
            return;
        }

        Prestamo prestamo = new Prestamo(libro, cliente, dias);
        cliente.agregarPrestamo(prestamo);
        System.out.println("Préstamo realizado con éxito. Costo: " + prestamo.calcularCosto());
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void eliminarLibro(String titulo) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                libros.remove(i);
                break;
            }
        }
    }

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void eliminarCliente(String id) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId().equalsIgnoreCase(id)) {
                clientes.remove(i);
                break;
            }
        }
    }

    public void mostrarPrestamos() {
        if (prestamos.isEmpty()) {
            System.out.println("No hay préstamos registrados.");
        } else {
            for (Prestamo prestamo : prestamos) {
                System.out.println(prestamo);
            }
        }
    }

}
