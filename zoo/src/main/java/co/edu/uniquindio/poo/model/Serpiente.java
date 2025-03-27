package co.edu.uniquindio.poo.model;

public class Serpiente extends Animal {
    /**
     * Metodo constructor de la clase Serpiente
     * @param nombre
     * @param edad
     */
    public Serpiente(String nombre, int edad) {
        super(nombre, edad, Especie.REPTILES);
    }

    @Override
    public void comer() {
        System.out.println(this.getNombre() + " esta Comiendo HUEVOS......");
    }
}
