package co.edu.uniquindio;

import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor 1: ");
        int valor1 = scanner.nextInt();
        System.out.println("Ingrese el valor 2: ");
        int valor2 = scanner.nextInt();

        System.out.println("El valor de operación suma es: " + sumar(valor1,valor2));
    }
}