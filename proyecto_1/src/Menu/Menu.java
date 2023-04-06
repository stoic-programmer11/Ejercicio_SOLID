package Menu;

import java.util.Scanner;
import clases.Empleado;
import clases.Impuesto;

public class Menu {
    public static void main(String[] args) {
        Empleado empleado = null;
        Impuesto impuesto = new Impuesto();
        int opcion = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Menu:");
            System.out.println("1. Introducir empleado");
            System.out.println("2. Calcular impuesto");
            System.out.println("3. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.next();

                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();

                    System.out.print("Salario: ");
                    double salario = scanner.nextDouble();

                    System.out.print("Cargo: ");
                    String cargo = scanner.next();

                    empleado = new Empleado(nombre, edad, salario, cargo);

                    break;

                case 2:
                    if (empleado == null) {
                        System.out.println("Debe introducir un empleado primero.");
                    } else {
                        double impuestoCalculado = impuesto.calcular(empleado.getSalario());

                        System.out.println("Impuesto a pagar: " + impuestoCalculado);
                    }

                    break;

                case 3:
                    System.out.println("Adios!");

                    break;

                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 3);
    }
}

