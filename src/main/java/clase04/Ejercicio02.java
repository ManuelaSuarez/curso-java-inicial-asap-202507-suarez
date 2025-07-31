package clase04;

public class Ejercicio02 {
    public static void main(String[] args) {
        int[] numeros = new int[8];
        int pivote;

        // Cargar y mostrar el array original
        System.out.println("Arreglo original");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random()*10) + 1;
            System.out.println(numeros[i]);
        }

        System.out.println();

        // Ordenar
        for (int i = 0; i < numeros.length -1; i++) {
            for (int j = 0; j < numeros.length - i -1; j++) {
                if(numeros[j]>numeros[j+1]) {
                    pivote = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = pivote;
                }
            }
        }

        // Mostrar array
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
