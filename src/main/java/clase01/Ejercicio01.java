package clase01;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un número entero: ");
        int numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número ingresado es múltiplo de 2");
        } else if (numero % 3 == 0) {
            System.out.println("El número ingresado es múltiplo de 3");
        } else {
            System.out.println("El número ingresado no múltiplo de 2 ni de 3");
        }

        teclado.close();

    }
}