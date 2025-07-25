package clase01;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su día de nacimiento: ");
        int diaNacimiento = sc.nextInt();

        System.out.println("Ingrese su mes de nacimiento: ");
        int mesNacimiento = sc.nextInt();

        System.out.println("Ingrese su año de nacimiento: ");
        int anioNacimiento = sc.nextInt();

        int suma = diaNacimiento + mesNacimiento + anioNacimiento;

        int cifra1 = suma / 1000;
        int cifra2 = suma / 100 % 10;
        int cifra3 = suma / 10 % 10;
        int cifra4 = suma % 10;

        int suerte = cifra1 + cifra2 + cifra3 + cifra4;

        System.out.println("Su número de la suerte es: " + suerte);
    }
}
