package co.edu.uniquindio.poo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Guarderia guarderia = new Guarderia("Pequeños Gigantes");

        Ninio ninio = new Ninio("Raul", 3, "M", "1234", "abejas", "Carmen", "123", "DFRR1");
        Ninio ninio2 = new Ninio("Juliana", 6, "F", "1234", "abejas", "Carmen", "123", "DFRR1");
        Ninio ninio3 = new Ninio("Camila", 2, "F", "1234", "abejas", "Carmen", "123", "DFRR1");
        Ninio ninio4 = new Ninio("Juan", 8, "M", "1234", "abejas", "Carmen", "123", "DFRR1");
        guarderia.almacenarNinios(ninio);
        guarderia.almacenarNinios(ninio2);
        guarderia.almacenarNinios(ninio3);
        guarderia.almacenarNinios(ninio4);

        System.out.println(guarderia);


    }
}