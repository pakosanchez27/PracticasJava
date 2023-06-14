package SegundoParcial;

import java.util.Scanner;

public class Practica2_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arreglo [][] = new int[2][2];
        int valor;
        int mayor = 0;
        System.out.println("Ingresa 4 valores");
        for (int col = 0; col <= arreglo.length - 1 ; col++){
            for (int fil = 0; fil <= arreglo.length - 1; fil++){
                System.out.println("ingresa el valor");
                valor = scan.nextInt();
                arreglo[col][fil] = valor;
            }
        }
        System.out.println("primer Arreglo");
        for (int col = 0; col <= arreglo.length - 1; col++){
            for (int fil = 0; fil <= arreglo.length -1; fil++){
                System.out.print(arreglo[col][fil]);
            }
            System.out.println("");
        }

        System.out.println("");
        for (int col = 0; col <= arreglo.length - 1; col++){
            for (int fil = 0; fil <= arreglo.length -1; fil++){
                if (arreglo[col][fil] > mayor){
                    mayor = arreglo[col][fil];
                }else{
                    mayor = mayor;
                }
            }
        }

        System.out.println("Nuevo Arreglo");
        for (int col = 0; col <= arreglo.length - 1; col++){
            for (int fil = 0; fil <= arreglo.length - 1; fil++){
                if (col == arreglo.length - 1 && fil == arreglo.length -1){
                    arreglo[arreglo.length - 1][arreglo.length - 1] = mayor;
                }else{
                    arreglo[col][fil] = 0;
                }
            }
        }
        for (int col = 0; col <= arreglo.length - 1; col++){
            for (int fil = 0; fil <= arreglo.length -1 ; fil++){
                System.out.print(arreglo[col][fil]);

            }
            System.out.println("");
        }
    }

}


