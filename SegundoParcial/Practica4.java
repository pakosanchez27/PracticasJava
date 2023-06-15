package SegundoParcial;

import java.util.*;
public class Practica4 {
    public static void main (String args []){
        Scanner in = new Scanner (System.in);
        int arreglo[]=new int[5];

        for (int uni=0;uni<5;uni++){
            System.out.println("Ingresa en la posición [" + uni + "]");
            arreglo[uni]=in.nextInt();

        }
        for(int uni=0;uni<5;uni++){
            System.out.print("\t" + arreglo[uni]);
        }
        int nuevo;
        for(int uno=0;uno<5;uno++){
            for(int dos=uno+1;dos<5;dos++){
                if(arreglo[uno]>arreglo[dos]){

                }
                else{
                    nuevo=arreglo[uno];
                    arreglo[uno]=arreglo[dos];
                    arreglo[dos]=nuevo;

                }
            }
            System.out.println(" ");
            for (int uni=0; uni<5; uni++){
                System.out.print("\t" + arreglo[uni]);
            }
        }
    }
}