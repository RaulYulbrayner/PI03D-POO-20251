package co.edu.uniquindio.poo.model;

public class Loro extends Animal {
    /**
     * Metodo constructor de la clase Loro
     * @param nombre
     * @param edad
     */
    public Loro(String nombre, int edad) {
        super(nombre, edad, Especie.AVES);
    }

    @Override
    public void comer() {
        System.out.println(this.getNombre() + " esta Comiendo SEMILLAS......");
    }
}
