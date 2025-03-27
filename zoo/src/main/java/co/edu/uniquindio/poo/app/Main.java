package co.edu.uniquindio.poo.app;

import co.edu.uniquindio.poo.model.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo("Ukumari", "1001");
        Animal leon = new Leon("Simba", 3, "M");
        Animal loro = new Loro("Paco", 4);
        Animal serpiente = new Serpiente("Slytherin", 10);

        Animal[] animales = {leon, loro, serpiente};

        for (Animal animal : animales) {
            System.out.println("-------------------");
            System.out.println(animal.toString());
            animal.comer();
        }
    }
}