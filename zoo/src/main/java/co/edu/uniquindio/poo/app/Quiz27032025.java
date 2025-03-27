package co.edu.uniquindio.poo.app;

import java.util.Scanner;

public class Quiz27032025 {

    private static int[] numeros = new int[10];

    public static void procesarPositivos() {
        int suma = 0;
        int contador = 0;

        for (int num : numeros) {
            if (num > 0) {
                suma += num;
                contador++;
            }
        }

        System.out.println("Suma total de números positivos: " + suma);
        System.out.println("Cantidad de números positivos ingresados: " + contador);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        procesarPositivos();
    }

}
