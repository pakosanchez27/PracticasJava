package SegundoParcial.Practica5;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Metodos metodo = new Metodos();

        System.out.println("ingresa las calificaciones");
        metodo.llenarArregloPrincipal(0);

        System.out.println("calidicaciones ordenadas");
        metodo.ordenarDesendente();
        metodo.imprimirArreglo(0);
        System.out.println("");
        System.out.println("calidicaciones reprobados");
        metodo.llenarAprobados(0);
        metodo.imprimirAprobados(0);
    }
}
