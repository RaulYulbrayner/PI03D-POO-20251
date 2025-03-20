package co.edu.uniquindio.poo.model;

public class Partida {

    private String id, hora, fecha;
    private Equipo equipo1;
    private Equipo equipo2;
    private Resultado resultado;

    public Partida(String id, String hora, String fecha, Equipo equipo1, Equipo equipo2) {
        this.id = id;
        this.hora = hora;
        this.fecha = fecha;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }

    public void jugarPartido(int marcadorEquipo1, int marcadorEquipo2){
        if(marcadorEquipo1 > marcadorEquipo2){
            this.resultado = new Resultado(equipo1.getNombre(), equipo2.getNombre(), marcadorEquipo1, marcadorEquipo2);
            equipo1.actualizarPuntaje(3);
        } else if (marcadorEquipo1 < marcadorEquipo2) {
            this.resultado = new Resultado(equipo2.getNombre(), equipo1.getNombre(), marcadorEquipo2, marcadorEquipo1);
            equipo2.actualizarPuntaje(3);
        }else{
            this.resultado = new Resultado("Empate", "Empate", marcadorEquipo1, marcadorEquipo2);
            equipo1.actualizarPuntaje(1);
            equipo2.actualizarPuntaje(1);
        }
    }

    public Resultado getResultado() {
        return resultado;
    }

    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "Partida{" +
                "id='" + id + '\'' +
                ", hora='" + hora + '\'' +
                ", fecha='" + fecha + '\'' +
                ", equipo1=" + equipo1 +
                ", equipo2=" + equipo2 +
                ", resultado=" + resultado +
                '}';
    }
}
