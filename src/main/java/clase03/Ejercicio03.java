package clase03;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        boolean esCapicua = true;

        System.out.println("Ingrese 5 números");

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el número " + i+1);
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length / 2; i++) {
            if (numeros[i] != numeros[numeros.length - i - 1]) {
                esCapicua = false;
                break;
            }
        }

        if (esCapicua == false) {
            System.out.println("El array no es capicúa.");
        } else {
            System.out.println("El array es capicúa.");
        }
        
    }
}
