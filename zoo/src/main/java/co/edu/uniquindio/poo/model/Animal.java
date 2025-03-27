package co.edu.uniquindio.poo.model;

public abstract class Animal {

    private String nombre;
    private int edad;
    private Especie especie;

    /**
     * Metodo constructor de la clase Animal
     * @param nombre
     * @param edad
     * @param especie
     */
    public Animal(String nombre, int edad, Especie especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }

    /**
     * Metodo que permite obtener el nombre de un animal
     * @return nombre del animal
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo que permite modificar el nombre de un animal
     * @param nombre del animal
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    /**
     * Metodo abstracto comer de la clase animal
     */
    public abstract void comer();

    /**
     * Metodo que permite imprimir la información del animal
     * @return
     */
    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", especie=" + especie +
                '}';
    }
}
