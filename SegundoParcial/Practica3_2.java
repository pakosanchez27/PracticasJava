package SegundoParcial;

import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class Practica3_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arregloB [][] = new int[2][2];
        int valor;
        int mayor = 0;

        System.out.println("ingresa 4 valores");
        for (int fil = 0; fil <= arregloB.length - 1; fil++){
            for (int col = 0; col <= arregloB.length -1; col++){
                System.out.println( "ingresa el valor");
                valor = scan.nextInt();
                arregloB[fil][col] = valor;
            }
        }
        System.out.println("Primer Arreglo");
        for (int fil = 0; fil <= arregloB.length - 1; fil++){
            for (int col = 0; col <= arregloB.length -1; col++){
                System.out.print(arregloB[fil][col]);

            }
            System.out.println("");
        }

        //sacar el mayor

        for (int fil = 0; fil <= arregloB.length - 1; fil++) {
            for (int col = 0; col <= arregloB.length - 1; col++) {
                if (arregloB[fil][col] > mayor) {
                    mayor = arregloB[fil][col];
                } else {
                    mayor = mayor;
                }
            }
        }
        for (int fil = 0; fil <= arregloB.length - 1; fil++) {
            for (int col = 0; col <= arregloB.length - 1; col++) {
                if (arregloB[fil][col] == mayor) {
                    for (int f = fil; f > 0; f--) {
                        for (int c = col; c > 0; c--) {
                            arregloB[f][c] = arregloB[f][c];
                        }
                    }
                    arregloB[0][0] = mayor;
                }
            }
        }


        System.out.println("");
            //imprimir el nuevo areglo
        for (int fil = 0; fil <= arregloB.length - 1; fil++){
            for (int col = 0; col <= arregloB.length -1; col++){
                System.out.print(arregloB[fil][col]);

            }
            System.out.println("");
        }

    }

    }

