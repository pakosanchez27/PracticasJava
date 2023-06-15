package SegundoParcial.Practica4;

import java.util.Random;

public class ArregloUtil {
    public static void desordenarArreglo(int[] arreglo) {
        Random rnd = new Random();

        for (int i = arreglo.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            int temp = arreglo[index];
            arreglo[index] = arreglo[i];
            arreglo[i] = temp;
        }
    }

    public static void ordenarArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("\t" + arreglo[i]);
        }
        System.out.println();
    }
}
