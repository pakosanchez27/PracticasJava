package SegundoParcial.ProyectoFinal;
import java.util.Arrays;

public class MetodosPila {

    int[] pila = new int[6];
    int posicion;

    public void agregarElemento(int valor) {
        if (posicion < pila.length) {
            pila[posicion] = valor;
            posicion++;
            System.out.println("Número agregado correctamente a la posición " + posicion);
        } else {
            System.out.println("La pila está llena. No se pueden agregar más elementos.");
        }
    }

    public void eliminarElemento() {
        if (posicion == 0) {
            System.out.println("La pila está vacía. No se puede eliminar ningún elemento.");
            return;
        }

        posicion--; // Decrementar la posición para apuntar al último elemento agregado
        System.out.println("Elemento eliminado correctamente.");
    }

    public void eliminarTodo() {
        Arrays.fill(pila, 0); // Asignar 0 a cada elemento para eliminarlos
        posicion = 0; // Reiniciar la posición para indicar que la pila está vacía
        System.out.println("Se han eliminado todos los elementos de la pila.");
    }

    public void imprimir() {
        if (posicion == 0) {
            System.out.println("La pila está vacía.");
            return;
        }

        System.out.println("Contenido de la pila:");
        for (int i = posicion - 1; i >= 0; i--) {
            System.out.print("\t" + pila[i]);
        }
        System.out.println();
    }
}