package SegundoParcial.Recuperacion;

import java.util.Scanner;

public class Metodos {
   static Scanner scan = new Scanner(System.in);
   static  int valor;
   static int arreglo [] = new int[8];
    public static void llenarArreglo(int indice){
        if (indice < 8 ){
            System.out.print("valor: ");
            valor = scan.nextInt();
            arreglo[indice] = valor;
            llenarArreglo(indice + 1);
        }
    }

    public static void imprimirArreglo(int indice){
        if (indice < 8){
            System.out.print("\t" + arreglo[indice]);
            indice++;
            imprimirArreglo(indice);
        }
    }
}
