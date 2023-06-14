package SegundoParcial;

import java.util.Scanner;

public class Practica3_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arreglo [] = new int [6];
        int valor;
        int mayor = 0;

        System.out.println("ingresa 5 valores");
        for (int i = 0; i <= arreglo.length -1; i++){
            System.out.println( "ingresa el valor");
            valor = scan.nextInt();
            arreglo[i] = valor;
        }

        System.out.println("primer arreglo");
        for (int i = 0; i <= arreglo.length -1; i++){
            System.out.print( "\t" + arreglo[i] );
        }
        System.out.println("");

        //sacar el mayor

        for (int i = 0; i <= arreglo.length -1; i++){
            if (arreglo[i] > mayor){
                mayor = arreglo[i];
            }else{
                mayor = mayor;
            }
        }

        //Acomodar a el mayor en la primera posicon
        for (int i = 0; i <= arreglo.length -1; i++){
            if (arreglo[i] == mayor) {
                for (int j = i; j > arreglo.length - 1; j++) {
                    arreglo[j] = arreglo[j + 1];
                }
                arreglo[arreglo.length - 1] = mayor;
            }
        }

        // imprimir el nuevo arreglo
        for (int i = 0; i <= arreglo.length -1; i++){
            System.out.print( "\t" + arreglo[i] );
        }
    }

}
