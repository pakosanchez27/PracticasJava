package SegundoParcial.Practica4;
import java.util.*;
import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arreglo[] = new int[5];

        for (int uni = 0; uni < 5; uni++) {
            System.out.println("Ingresa en la posición [" + uni + "]");
            arreglo[uni] = in.nextInt();
        }

        ArregloUtil.desordenarArreglo(arreglo);
        System.out.println("Arreglo desordenado:");
        ArregloUtil.imprimirArreglo(arreglo);

        ArregloUtil.ordenarArreglo(arreglo);
        System.out.println("Arreglo ordenado:");
        ArregloUtil.imprimirArreglo(arreglo);
    }
}
