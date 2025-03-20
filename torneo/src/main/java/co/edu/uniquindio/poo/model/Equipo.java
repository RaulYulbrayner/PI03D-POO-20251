package co.edu.uniquindio.poo.model;

import java.util.List;

public class Equipo {

    private String nombre;
    private int puntajeAcumulado;
    private List<Jugador> listJugadores;

    public Equipo(String nombre, List<Jugador> listJugadores) {
        this.nombre = nombre;
        this.listJugadores = listJugadores;
        this.puntajeAcumulado = 0;
    }

    public void actualizarPuntaje(int puntos) {
        this.puntajeAcumulado += puntos;
    }

    public void mostrarEquipo() {
        System.out.println("La lista de jugadores del equipo: " + this.nombre + " es: ");
        for (Jugador jugador : listJugadores) {
            System.out.println(" - "+jugador.getNombre());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
