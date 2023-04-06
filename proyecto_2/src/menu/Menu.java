package menu;

import java.util.Scanner;
import figuras.Figura;
import figuras.Circulo;
import figuras.Cuadrado;
import figuras.TrianguloRectangulo;

public class Menu {
    public static void main(String[] args) {
        Figura figura = null;
        int opcion = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Menu:");
            System.out.println("1. Introducir figura");
            System.out.println("2. Calcular area");
            System.out.println("3. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Seleccione una figura:");
                    System.out.println("1. Cuadrado");
                    System.out.println("2. Triangulo rectangulo");
                    System.out.println("3. Circulo");

                    int opcionFigura = scanner.nextInt();

                    switch (opcionFigura) {
                        case 1:
                            System.out.print("Lado: ");
                            double lado = scanner.nextDouble();

                            figura = new Cuadrado(lado);

                            break;

                        case 2:
                            System.out.print("Base: ");
                            double base = scanner.nextDouble();

                            System.out.print("Altura: ");
                            double altura = scanner.nextDouble();

                            figura = new TrianguloRectangulo(base, altura);

                            break;

                        case 3:
                            System.out.print("Radio: ");
                            double radio = scanner.nextDouble();

                            figura = new Circulo(radio);

                            break;

                        default:
                            System.out.println("Opcion no valida.");
                    }

                    break;

                case 2:
                    if (figura == null) {
                        System.out.println("Debe introducir una figura primero.");
                    } else {
                        double areaCalculada = figura.calcularArea();

                        System.out.println("Area calculada: " + areaCalculada);
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
