package clase03;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cantidadPersonas, suma, cantsuperiorMedia, cantInferiorMedia;

        suma = 0;
        cantsuperiorMedia = 0;
        cantInferiorMedia = 0;


        do {
            System.out.println("Ingrese la cantidad de personas");
            cantidadPersonas = sc.nextInt();

            if (0 >= cantidadPersonas) {
                System.out.println("El número debe ser mayor a 0");
            }

        } while (0 >= cantidadPersonas);

        int[] alturas = new int[cantidadPersonas];


        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.println("Ingrese la altura de la persona " + i+1 + " en centímetros. Por ejemplo: 165.");
            alturas[i] = sc.nextInt();

            suma = suma + alturas[i];

        }

        int media = suma/cantidadPersonas;

        for (int i = 0; i < cantidadPersonas; i++) {
            if (alturas[i] > media) {
                cantsuperiorMedia++;
            } else if (alturas[i] < media) {
                cantInferiorMedia++;
            }
        }

        System.out.println("La altura media es: " + media + "cm. " + cantsuperiorMedia + " personas superan la altura media, y " + cantInferiorMedia + " personas no superan la altura media.");
    }
}
