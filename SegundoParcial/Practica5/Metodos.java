package SegundoParcial.Practica5;

import javax.naming.Binding;
import java.util.Scanner;

public class Metodos {
    static int principal [] = new int [10];
    static int reprobados [];
    static int aprobados [];
    static Scanner scan = new Scanner(System.in);
    static int contadorA = 0;
    static int contadorR = 0;
    static int valor;
    public  void llenarArregloPrincipal(int indice){

        if ( indice < principal.length){
            System.out.println("ingresa la calificacion: " + (indice + 1));
            valor = scan.nextInt();
            if (valor < 0 || valor > 10){
                System.out.println("Error en los datos");
                llenarArregloPrincipal(indice);
            }
            if (valor > 8){
                contadorA++;
            }else {
                contadorR++;
            }
            principal[indice] = valor;
            indice++;
            llenarArregloPrincipal(indice);
        }
    }

    public  void ordenarDesendente(){
            for (int i = 0; i < principal.length - 1; i++) {
                for (int j = 0; j < principal.length - i - 1; j++) {
                    if (principal[j] > principal[j + 1]) {
                        int temp = principal[j];
                        principal[j] = principal[j + 1];
                        principal[j + 1] = temp;
                    }
                }
            }
    }

    public  void imprimirArreglo(int indice){
        if (indice < principal.length){
            System.out.print("\t" + principal[indice]);
            indice++;
            imprimirArreglo(indice);
        }
    }

    public void llenarAprobados(int indice) {
        aprobados = new int[contadorA];
        int contador = 0; // Variable auxiliar para contar los elementos en el arreglo "aprobados"

        if (indice < principal.length) {
            if (principal[indice] > 8) {
                aprobados[contador] = principal[indice];
                contador++;
            }
            indice++;
            llenarAprobados(indice);
        }
    }


    public void imprimirAprobados(int indice){
        if (indice < aprobados.length){
            System.out.print("\t" + aprobados[indice]);
            indice++;
            imprimirArreglo(indice);
        }
    }
}
