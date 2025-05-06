package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa a la empresa ExpresoColombia que gestiona vehículos, conductores, rutas, pasajeros y reservas.
 */
public class Empresa {
    private String nombre;
    private List<Vehiculo> vehiculos;
    private List<Conductor> conductores;
    private List<Ruta> rutas;
    private List<Reserva> reservas;
    private List<Pasajero> pasajeros;

    /**
     * Constructor de la empresa.
     * @param nombre Nombre de la empresa.
     */
    public Empresa(String nombre) {
        this.nombre = nombre;
        this.vehiculos = new ArrayList<>();
        this.conductores = new ArrayList<>();
        this.rutas = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    // Métodos para registrar entidades

    /**
     * Registra un nuevo vehículo.
     * @param vehiculo Vehículo a registrar.
     */
    public void registrarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    /**
     * Registra un nuevo conductor.
     * @param conductor Conductor a registrar.
     */
    public void registrarConductor(Conductor conductor) {
        conductores.add(conductor);
    }

    /**
     * Registra una nueva ruta.
     * @param ruta Ruta a registrar.
     */
    public void registrarRuta(Ruta ruta) {
        rutas.add(ruta);
    }

    /**
     * Registra una nueva reserva.
     * @param reserva Reserva a registrar.
     */
    public void registrarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    /**
     * Registra un pasajero
     * @param pasajero
     */
    public void registrarPasajero(Pasajero pasajero) {
        pasajeros.add(pasajero);
    }

    /**
     * Muestra todas las reservas registradas.
     */
    public void mostrarTodasLasReservas() {
        for (Reserva listaReserva : reservas) {
            listaReserva.mostrarResumen();
            System.out.println("---------------------------");
        }
    }

    /**
     * Metodo que obtiene la lista de vehiculos por ruta
     * @param origen
     * @param destino
     * @return
     */
    public List<Vehiculo> obtenerVehiculosPorRuta(String origen, String destino) {
        List<Vehiculo> resultado = new ArrayList<>();
        for (Reserva reserva : reservas) {
            if (reserva.getRuta().origen().equalsIgnoreCase(origen) &&
                    reserva.getRuta().destino().equals(destino)) {
                resultado.add(reserva.getVehiculo());
            }
        }
        return resultado;
    }

    /**
     * Metodo que calcula el costo de una reserva dado el origen, destino y la placa del vehículo.
     * Lanza una excepción si no se encuentra la reserva.
     * @param origen
     * @param destino
     * @param placaVehiculo
     * @return
     */
    public double calcularCostoReservaPorRutaYVehiculo(String origen, String destino, String placaVehiculo) {
        for (Reserva reserva : reservas) {
            Ruta ruta = reserva.getRuta();
            Vehiculo vehiculo = reserva.getVehiculo();

            if (ruta.origen().equals(origen)
                    && ruta.destino().equals(destino)
                    && vehiculo.getPlaca().equals(placaVehiculo)) {
                return vehiculo.calcularCosto();
            }
        }
        throw new IllegalArgumentException("No se encontró una reserva con esa ruta y placa de vehículo");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public List<Conductor> getConductores() {
        return conductores;
    }

    public void setConductores(List<Conductor> conductores) {
        this.conductores = conductores;
    }

    public List<Ruta> getRutas() {
        return rutas;
    }

    public void setRutas(List<Ruta> rutas) {
        this.rutas = rutas;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public List<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(List<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }
}
