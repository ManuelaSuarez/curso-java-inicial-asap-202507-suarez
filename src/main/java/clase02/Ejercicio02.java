package clase02;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, suma1, suma2;

        System.out.println("Ingrese dos números enteros positivos para saber si son amigos");

        do {
            System.out.println("Ingrese el primer número");
            n1 = sc.nextInt();

            if (0 >= n1) {
                System.out.println("El número ingresado debe ser mayor a 0");
            }

        } while (0 >= n1);

        do {
            System.out.println("Ingrese el segundo número");
            n2 = sc.nextInt();

            if (0 >= n2) {
                System.out.println("El número ingresado debe ser mayor a 0");
            }

        } while (0 >= n2);

        suma1 = 0;
        suma2 = 0;

        for (int i = 1; i < n1; i++) {
            if (n1 % i == 0) {
                suma1 += i;
            }

        }

        for (int i = 1; i < n2; i++) {
            if (n2 % i == 0) {
                suma2 += i;
            }

        }

        if (suma1 == n2 && suma2 == n1) {
            System.out.println("Los números " + n1 + " y " + n2 + " son amigos");
        } else {
            System.out.println("Los números " + n1 + " y " + n2 + " no son amigos");
        }

    }
}
