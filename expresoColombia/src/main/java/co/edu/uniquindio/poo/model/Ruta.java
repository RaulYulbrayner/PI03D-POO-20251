package co.edu.uniquindio.poo.model;

/**
 * Representa una ruta de viaje.
 * @param origen Ciudad de origen.
 * @param destino Ciudad de destino.
 * @param duracion Duración estimada en horas.
 * @param distancia Distancia en kilómetros.
 */
public record Ruta(String origen, String destino, int duracion, double distancia) {
}
