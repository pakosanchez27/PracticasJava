package SegundoParcial.ProyectoFinal;
import java.util.Scanner;

public class MainPila {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MetodosPila pila = new MetodosPila();
        int opc, valor;

        System.out.println("Bienvenido al programa de Pila");

        do {
            System.out.println("Escoge una opción");
            System.out.println("1. Agregar");
            System.out.println("2. Eliminar 1 elemento");
            System.out.println("3. Eliminar Todo");
            System.out.println("4. Mostrar pila");
            System.out.println("0. Salir");
            opc = scan.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Ingrese el número a agregar: ");
                    valor = scan.nextInt();
                    pila.agregarElemento(valor);
                    pila.imprimir();
                    break;
                case 2:
                    pila.eliminarElemento();
                    pila.imprimir();
                    break;
                case 3:
                    pila.eliminarTodo();
                    pila.imprimir();
                    break;
                case 4:
                    pila.imprimir();
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
