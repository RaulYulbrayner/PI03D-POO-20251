package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.*;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Crear jugadores
        Jugador jugador1 = new Jugador("Raul", "CR7", Rol.ATACANTE);
        Jugador jugador2 = new Jugador("lionel", "La pulga", Rol.LIDER);
        Jugador jugador3 = new Jugador("Cristiano", "El bicho", Rol.ATACANTE);
        Jugador jugador4 = new Jugador("Yamal", "El niño", Rol.LIDER);
        Jugador jugador5 = new Jugador("Pele", "El rey", Rol.ATACANTE);
        Jugador jugador6 = new Jugador("Maradona", "El de los pases", Rol.LIDER);

        //Crear equipos
        Equipo brasil = new Equipo("Brasil", List.of(jugador5, jugador3, jugador1));
        Equipo colombia = new Equipo("Colombia", List.of(jugador2, jugador4, jugador6));

        brasil.mostrarEquipo();
        colombia.mostrarEquipo();

        //Crear una partida y jugarla
        Partida partida = new Partida("1", "7:45 pm", "20/03/2025", brasil, colombia);
        partida.jugarPartido(3,2);

        Resultado resultado = partida.getResultado();

        System.out.println("Resultado de las eliminatorias a EEUU y los Otros");
        System.out.println("Equipo Ganador " + resultado.equipoGanador() + " con marcador a su favor " + resultado.marcadorGanador());
        System.out.println("Equipo Perdedor " + resultado.equipoPerdedor() + " con marcador a su favor " + resultado.marcadorPerdedor());

    }
}