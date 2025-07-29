package clase02;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fibonacciInicial = 0;
        int fibonacciActual = 1;

        System.out.println("Ingrese la cantidad de números que desea mostrar");
        int cantidadNumeros = sc.nextInt();

        for (int i = 1; i <= cantidadNumeros; i++) {
            System.out.println(fibonacciActual);

            int fibonacciSiguiente = fibonacciInicial + fibonacciActual;
            fibonacciInicial = fibonacciActual;
            fibonacciActual = fibonacciSiguiente;
        }
    }
}
