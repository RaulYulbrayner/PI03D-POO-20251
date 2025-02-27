package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Quiz {

    public static void tablasMultiplicar(){

        System.out.println("Tablas Multiplicar");

        for (int i = 1; i <= 10; i++){
            System.out.println("\nLa tabla de Multiplicar del " + i + " es ");
            for (int j = 1; j <= 10; j++){
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }


    public static void main(String[] args) {
        tablasMultiplicar();
    }


}
