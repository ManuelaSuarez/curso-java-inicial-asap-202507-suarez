package clase04;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número para verificar si es primo");

        int contador = 0;
        int numero = sc.nextInt();

        for (int i = 2; i < numero; i++) {
            if(numero % i == 0) {
                contador++;
            };
        }

        if(contador == 0){
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero no es primo");
        }

    }
}
