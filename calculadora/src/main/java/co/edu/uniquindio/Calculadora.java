package co.edu.uniquindio;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Calculadora {

    public static int sumar(int valor1, int valor2){
        int resultado = valor1 + valor2;
        return resultado;
    }

    public static int restar(int valor1, int valor2){
        int resultado = valor1 - valor2;
        return resultado;
    }

    public static int multiplicar(int valor1, int valor2){
        int resultado = valor1 * valor2;
        return resultado;
    }

    public static int dividir(int valor1, int valor2){
        int resultado = valor1 / valor2;
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println("El valor de operación suma es: " + sumar(10,2));
        System.out.println("El valor de operación resta es: " + restar(10,2));
        System.out.println("El valor de operación multipliación es: " + multiplicar(10,2));
        System.out.println("El valor de operación división es: " + dividir(10,2));
    }
}