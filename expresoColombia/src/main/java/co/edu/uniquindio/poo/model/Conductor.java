package co.edu.uniquindio.poo.model;

/**
 * Representa un conductor con información básica.
 * @param nombre Nombre completo.
 * @param cedula Número de cédula.
 * @param licencia Tipo de licencia.
 * @param experiencia Años de experiencia.
 */
public record Conductor(String nombre, String cedula, String licencia, int experiencia) {
}
