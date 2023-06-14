package SegundoParcial;

import java.util.Scanner;

public class Practica1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Ordenar valores de forma ascendente");
            System.out.println("2. Ordenar valores de forma descendente");
            System.out.println("3. Mostrar pirámide de asteriscos");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    int[] valoresAscendente = pedirValores(scanner);
                    ordenarAscendente(valoresAscendente, 0);
                    System.out.println("Valores en forma ascendente: ");
                    imprimirValores(valoresAscendente);
                    break;
                case 2:
                    int[] valoresDescendente = pedirValores(scanner);
                    ordenarDescendente(valoresDescendente, 0);
                    System.out.println("Valores en forma descendente: ");
                    imprimirValores(valoresDescendente);
                    break;
                case 3:
                    System.out.println("Pirámide de asteriscos:");
                    imprimirPiramide(1);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
            }

            System.out.println();
        } while (opcion != 4);

        scanner.close();
    }

    public static int[] pedirValores(Scanner scanner) {
        return pedirValoresRecursivo(scanner, new int[5], 0);
    }

    public static int[] pedirValoresRecursivo(Scanner scanner, int[] valores, int index) {
        if (index == 5) {
            return valores;
        }
        System.out.print("Valor " + (index + 1) + ": ");
        valores[index] = scanner.nextInt();
        return pedirValoresRecursivo(scanner, valores, index + 1);
    }

    public static void ordenarAscendente(int[] valores, int index) {
        if (index == valores.length - 1) {
            return;
        }
        int minIndex = encontrarMinimoIndex(valores, index, index);
        swapValores(valores, minIndex, index);
        ordenarAscendente(valores, index + 1);
    }

    public static int encontrarMinimoIndex(int[] valores, int minIndex, int currentIndex) {
        if (currentIndex == valores.length) {
            return minIndex;
        }
        if (valores[currentIndex] < valores[minIndex]) {
            minIndex = currentIndex;
        }
        return encontrarMinimoIndex(valores, minIndex, currentIndex + 1);
    }

    public static void swapValores(int[] valores, int i, int j) {
        int temp = valores[i];
        valores[i] = valores[j];
        valores[j] = temp;
    }

    public static void ordenarDescendente(int[] valores, int index) {
        if (index == valores.length - 1) {
            return;
        }
        int maxIndex = encontrarMaximoIndex(valores, index, index);
        swapValores(valores, maxIndex, index);
        ordenarDescendente(valores, index + 1);
    }

    public static int encontrarMaximoIndex(int[] valores, int maxIndex, int currentIndex) {
        if (currentIndex == valores.length) {
            return maxIndex;
        }
        if (valores[currentIndex] > valores[maxIndex]) {
            maxIndex = currentIndex;
        }
        return encontrarMaximoIndex(valores, maxIndex, currentIndex + 1);
    }

    public static void imprimirValores(int[] valores) {
        imprimirValoresRecursivo(valores, 0);
        System.out.println();
    }

    public static void imprimirValoresRecursivo(int[] valores, int index) {
        if (index == valores.length) {
            return;
        }
        System.out.print(valores[index] + " ");
        imprimirValoresRecursivo(valores, index + 1);
    }

    public static void imprimirPiramide(int n) {
        if (n > 10) {
            return;
        }
        imprimirAsteriscos(n);
        System.out.println();
        imprimirPiramide(n + 1);
    }

    public static void imprimirAsteriscos(int n) {
        if (n == 0) {
            return;
        }
        System.out.print("* ");
        imprimirAsteriscos(n - 1);
    }
}
