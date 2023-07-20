package SegundoParcial.ProyectoFinal;

import java.util.Scanner;

import java.util.Scanner;

public class MetodosFila {

     int[] arreglo = new int[6];
     int posicion;



    public void agregarElemento(int valor) {
        if (posicion < arreglo.length) {
            arreglo[posicion] = valor;
            posicion++;
            System.out.println("Número agregado correctamente a la posición " + posicion);
        } else {
            System.out.println("El arreglo está lleno. No se pueden agregar más elementos.");
        }
    }

    public void eliminarElemento() {
        if (posicion == 0) {
            System.out.println("La fila está vacía. No se puede eliminar ningún elemento.");
            return;
        }

        // Desplazar todos los elementos una posición hacia adelante
        for (int i = 0; i < posicion - 1; i++) {
            arreglo[i] = arreglo[i + 1];
        }

        // Colocar 0 en la posición del último elemento eliminado
        arreglo[posicion - 1] = 0;

        posicion--;
        System.out.println("Primer elemento eliminado correctamente.");
    }

    public void eliminarTodo() {
        // Eliminar todos los valores asignando 0 a cada posición
        for (int i = 0; i < posicion; i++) {
            arreglo[i] = 0;
        }
        posicion = 0;
        System.out.println("Se han eliminado todos los elementos.");
    }
    public void imprimir(){
    for (int i = 0; i < arreglo.length; i++){

        System.out.print("\t" + arreglo[i]);

    }
        System.out.println("");
    }
}
