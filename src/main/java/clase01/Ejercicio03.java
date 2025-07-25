package clase01;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una nota del 0 al 10");
        int nota = sc.nextInt();

        if (nota < 0 || nota > 10) {
            System.out.println("La nota debe estar entre 0 y 10");
        } else  {
            switch (nota) {
                case 0, 1, 2, 3, 4:
                    System.out.println("Insuficiente");
                    break;

                case 5:
                    System.out.println("Suficiente");
                    break;

                case 6:
                    System.out.println("Bien");
                    break;

                case 7, 8:
                    System.out.println("Notable");
                    break;

                case 9, 10:
                    System.out.println("Sobresaliente");
                    break;
            }
        }
        sc.close();
    }
}
