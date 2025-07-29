package clase02;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, suma, cifra, numeroAMostrar;

        System.out.println("Ingrese un número entero positivo");

        // Valida que el número sea positivo
        do {
            numero = sc.nextInt();

            if(0 >= numero) {
                System.out.println("El número ingresado debe ser mayor a 0");
            }
        } while (0>=numero);

        suma = 0;
        numeroAMostrar = numero;

        while (numero != 0) { // Se repite hasta que el número se quede sin cifras
            cifra = numero % 10; // Se obtiene y guarda la última cifra
            suma = suma + cifra; // Se suma la cifra actual
            numero = numero / 10; // Se elimina la última cifra sumada
        }

        System.out.println("La suma de las cifras del número " + numeroAMostrar + " es: " + suma);
    }
}
