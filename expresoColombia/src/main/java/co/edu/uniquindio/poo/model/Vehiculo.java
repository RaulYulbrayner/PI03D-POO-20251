package co.edu.uniquindio.poo.model;

/**
 * Clase abstracta que representa un vehículo genérico.
 */
public abstract  class Vehiculo {

    private String placa;
    private String modelo;
    private int capacidad;

    /**
     * Constructor del vehículo.
     */
    public Vehiculo(String placa, String modelo, int capacidad) {
        this.placa = placa;
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    /**
     * Método abstracto para calcular el costo del viaje según el tipo de vehículo.
     *
     * @return Costo del viaje.
     */
    public abstract double calcularCosto();


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
