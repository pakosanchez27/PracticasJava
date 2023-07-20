package SegundoParcial.ProyectoFinal;
import java.util.*;

public class MainFila {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MetodosFila fila = new MetodosFila();
        int[] arreglo = new int[6];
        int opc, valor;

        System.out.println("Bienvenido al programa de Fila");

        do {
            System.out.println("Escoge una opción");
            System.out.println("1. Agregar");
            System.out.println("2. Eliminar 1 elemento");
            System.out.println("3. Eliminar Todo");
            System.out.println("4. Mostrar arreglo");
            System.out.println("0. Salir");
            opc = scan.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Ingrese el número a agregar: ");
                    valor = scan.nextInt();
                    fila.agregarElemento(valor);
                    fila.imprimir();
                    break;
                case 2:
                    fila.eliminarElemento();
                    fila.imprimir();
                    break;
                case 3:
                    fila.eliminarTodo();
                    fila.imprimir();
                    break;
                case 4:
                    fila.imprimir();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        } while (opc != 0);

        scan.close();
    }
}
