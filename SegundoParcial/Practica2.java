package SegundoParcial;

import java.util.Scanner;

public class Practica2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arreglo [] = new int[5];
        int valor;
        int mayor = 0;
        System.out.println("Ingresa 6 valores");
        for (int i = 0; i <= arreglo.length - 1; i++){
            System.out.print("Valor " + (i+1) + ": ");
            valor = scan.nextInt();
            arreglo[i] = valor;
        }
        System.out.println("primer Arreglo");
        for (int i = 0; i <= arreglo.length - 1; i++){
            System.out.print("\t" + arreglo[i]);

        }
        System.out.println("");
        for (int i = 0; i <= arreglo.length - 1; i++){

            if (arreglo[i] > mayor){
                mayor = arreglo[i];

            }else {
                mayor = mayor;
            }
        }

        System.out.println("Nuevo Arreglo");
        for (int i = 0; i<= arreglo.length -1; i++){
            if (i == 0){
                arreglo[0] = mayor;
            }else{
                arreglo[i] = 0;
            }
        }
        for (int i = 0; i<= arreglo.length -1; i++){
            System.out.println(arreglo[i]);
        }
    }

}


