package co.edu.uniquindio.poo;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca("UQ");
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n1. Agregar libro");
            System.out.println("2. Eliminar libro");
            System.out.println("3. Registrar cliente");
            System.out.println("4. Eliminar cliente");
            System.out.println("5. Realizar préstamo");
            System.out.println("6. Mostrar préstamos");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("ISBN: ");
                    String isbn = scanner.nextLine();
                    biblioteca.agregarLibro(new Libro(titulo, autor, isbn));
                    break;
                case 2:
                    System.out.print("Título del libro a eliminar: ");
                    titulo = scanner.nextLine();
                    biblioteca.eliminarLibro(titulo);
                    break;
                case 3:
                    System.out.print("Nombre del cliente: ");
                    String nombre = scanner.nextLine();
                    System.out.print("ID: ");
                    String id = scanner.nextLine();
                    biblioteca.registrarCliente(new Cliente(nombre, id));
                    break;
                case 4:
                    System.out.print("ID del cliente a eliminar: ");
                    id = scanner.nextLine();
                    biblioteca.eliminarCliente(id);
                    break;
                case 5:
                    System.out.print("ID del cliente: ");
                    id = scanner.nextLine();
                    System.out.print("Título del libro: ");
                    titulo = scanner.nextLine();
                    System.out.print("Días de préstamo: ");
                    int dias = scanner.nextInt();
                    scanner.nextLine();
                    biblioteca.prestarLibro(titulo, id, dias);
                    break;
                case 6:
                    biblioteca.mostrarPrestamos();
                    break;
            }
        } while (opcion != 7);
        scanner.close();
    }

}