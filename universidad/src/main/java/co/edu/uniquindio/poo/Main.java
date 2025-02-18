package co.edu.uniquindio.poo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Raul Yulbraynner", "Rivera Galvez", "ryrviera@uniquindio.edu.co", 30, 31111, 12345);
        Estudiante estudiante2 = new Estudiante("Camila", "Rivera Galvez", "ryrviera@uniquindio.edu.co", 30, 31111, 12345);

        System.out.println(estudiante.toString());
        System.out.println(estudiante2.toString());
    }
}