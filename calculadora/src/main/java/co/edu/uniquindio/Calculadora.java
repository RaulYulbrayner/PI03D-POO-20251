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
        int resultado = 0;
        if(valor2 != 0){
            resultado = valor1 / valor2;
        }
        return resultado;
    }

    public static String calculadora(int operador, int valor1, int valor2){
        String resultado = "";
        if(operador == 1){
            resultado = "El valor de la suma es: " + sumar(valor1, valor2);
        }else if(operador == 2){
            resultado = "El valor de la resta es: " + restar(valor1, valor2);
        } else if (operador == 3) {
            resultado = "El valor de la multiplicación es: " + multiplicar(valor1, valor2);
        } else if (operador == 4){
            resultado = "El valor de la división es: " + dividir(valor1, valor2);
        }
        return  resultado;
    }

    public static String calculadora2(char operador, int valor1, int valor2){
        String resultado = "";
        if(operador == '+'){
            resultado = "El valor de la suma es: " + sumar(valor1, valor2);
        }else if(operador == '-'){
            resultado = "El valor de la resta es: " + restar(valor1, valor2);
        } else if (operador == '*') {
            resultado = "El valor de la multiplicación es: " + multiplicar(valor1, valor2);
        } else if (operador == '/'){
            resultado = "El valor de la división es: " + dividir(valor1, valor2);
        }
        return  resultado;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el operador: ");
        char operador = scanner.nextLine().charAt(0);

        System.out.println("Ingrese el valor 1: ");
        int valor1 = scanner.nextInt();

        System.out.println("Ingrese el valor 2: ");
        int valor2 = scanner.nextInt();

        System.out.println(calculadora2(operador, valor1, valor2));
    }
}