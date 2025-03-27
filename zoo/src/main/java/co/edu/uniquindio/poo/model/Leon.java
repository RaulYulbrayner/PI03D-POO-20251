package co.edu.uniquindio.poo.model;

public class Leon extends Animal {

    private String genero;

    /**
     * Metodo constructor de la clase León
     * @param nombre
     * @param edad
     * @param
     */
    public Leon(String nombre, int edad, String genero) {
        super(nombre, edad, Especie.MAMÍFEROS);
        this.genero = genero;
    }

    @Override
    public void comer() {
        System.out.println(this.getNombre() + " esta Comiendo CARNE......");
    }
}
