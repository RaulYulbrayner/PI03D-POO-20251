package co.edu.uniquindio.poo.model;

import java.util.List;

/**
 * Representa una reserva de viaje.
 */
public class Reserva {
    private Vehiculo vehiculo;
    private Conductor conductor;
    private Ruta ruta;
    private int idReserva;
    private List<Pasajero> pasajeros;

    /**
     * Constructor de Reserva.
     *
     * @param vehiculo Vehículo asignado.
     * @param conductor Conductor asignado.
     * @param ruta Ruta del viaje.
     * @param pasajeros Lista de pasajeros.
     */
    public Reserva(int idReserva, Vehiculo vehiculo, Conductor conductor, Ruta ruta, List<Pasajero> pasajeros) {
        this.idReserva = idReserva;
        this.vehiculo = vehiculo;
        this.conductor = conductor;
        this.ruta = ruta;
        this.pasajeros = pasajeros;
    }

    /**
     * Muestra un resumen de la reserva.
     */
    public void mostrarResumen() {
        System.out.println("=== RESUMEN DE RESERVA ===");
        System.out.println("Costo total del viaje: $" + vehiculo.calcularCosto());
        System.out.println("Número de pasajeros: " + pasajeros.size());
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public List<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(List<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }
}
