package clase03;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mayor, menor, posicMayor, posicMenor;

        int[] numeros = new int[6];

        System.out.println("Ingrese 6 números");

        for (int i = 0; i < 6; i++) {
            System.out.println("Ingrese el número " + i+1);
            numeros[i] = sc.nextInt();
        }

        mayor = numeros[0];
        menor = numeros[0];

        posicMayor = 0;
        posicMenor = 0;

        for (int i = 0; i < 6; i++) {

           if (mayor < numeros[i]) {
               mayor = numeros[i];
               posicMayor = i;
           }

           if (menor > numeros[i]) {
               menor = numeros[i];
               posicMenor = i;
           }
        }

        System.out.println("El mayor número del arreglo es " + mayor + ", cuya posición en el arreglo es " + posicMayor + ". El menor número del arreglo es " + menor + ", cuya posición en el arreglo es " + posicMenor + ".");
    }


}
