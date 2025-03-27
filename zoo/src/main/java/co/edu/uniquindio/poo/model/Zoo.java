package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private String nombre, cod;
    private List<Animal> listAnimales;

    /**
     * Metodo constructor de la clase Zoologico
     * @param nombre
     * @param cod
     */
    public Zoo(String nombre, String cod) {
        this.nombre = nombre;
        this.cod = cod;
        this.listAnimales = new ArrayList<>();
    }

    /**
     * Metodo que permite agregar animales a la lista del zoologico
     * @param animal
     */
    public void agregarAnimal(Animal animal){
        listAnimales.add(animal);
    }

}
