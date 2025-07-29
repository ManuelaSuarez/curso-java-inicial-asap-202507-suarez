package clase03;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cantidadPersonas;

        do {
            System.out.println("Ingrese la cantidad de personas");
            cantidadPersonas = sc.nextInt();
        } while (0 >= cantidadPersonas);


        for (int i = 1; i <= cantidadPersonas; i++) {
            System.out.println("Ingrese la altura de la persona " + i + " en centímetros. Por ejemplo: 165.");

        }

    }
}
