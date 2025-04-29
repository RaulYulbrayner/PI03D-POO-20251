package co.edu.uniquindio.poo.model;

/**
 * Representa un pasajero del viaje.
 * @param nombre Nombre del pasajero.
 * @param cedula Número de cédula.
 * @param esFrecuente Indica si es un viajero frecuente.
 */
public record Pasajero(String nombre, String cedula, boolean esFrecuente) {
}
